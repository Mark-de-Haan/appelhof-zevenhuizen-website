package org.mdehaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Application extends WebMvcAutoConfiguration
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}