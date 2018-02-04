package org.mdehaan;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mdehaan.persistence.model.Content;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static io.restassured.RestAssured.preemptive;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment = DEFINED_PORT)
public class ApplicationTest
{
	@Before
	public void setUp()
	{
		RestAssured.authentication = preemptive().basic("admin", "admin");
	}

	private static final String API_ROOT = "http://localhost:8081/api/content";

	@Test
	public void testGetAllContentOK()
	{
		final Response response = RestAssured.get(API_ROOT);
		assertEquals(HttpStatus.OK.value(), response.getStatusCode());
	}

	@Test
	public void testGetAllContentInNamespace()
	{
		final Content content = createRandomContent();
		createContentAsUri(content);

		final Response response = RestAssured.get(API_ROOT + "/namespace/" + content.getNamespace());
		assertEquals(HttpStatus.OK.value(), response.getStatusCode());
		assertTrue(response.as(List.class).size() > 0);
	}

	// ===============================

	private Content createRandomContent()
	{
		return new Content("test", randomAlphabetic(10));
	}

	private String createContentAsUri(Content content)
	{
		final Response response = RestAssured.given().log().all()
											 .contentType(MediaType.APPLICATION_JSON_VALUE)
											 .body(content)
											 .log().all()
											 .post(API_ROOT);

		return API_ROOT + "/" + response.jsonPath().get("id");
	}
}
