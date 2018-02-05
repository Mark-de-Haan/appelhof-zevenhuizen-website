package org.mdehaan.api;

import org.mdehaan.exception.ContentNotFoundException;
import org.mdehaan.persistence.model.Content;
import org.mdehaan.persistence.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.requireNonNull;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/content")
public class ContentController
{
	private final ContentRepository contentRepository;

	@Autowired
	public ContentController(ContentRepository contentRepository)
	{
		this.contentRepository = requireNonNull(contentRepository);
	}

	@GetMapping
	public Iterable<Content> findAll()
	{
		return contentRepository.findAll();
	}

	@GetMapping("/{id}")
	public Content findOne(@PathVariable long id)
	{
		return contentRepository.findOne(id).orElseThrow(ContentNotFoundException::new);
	}

	@GetMapping("/namespace/{contentNamespace}")
	public List<Content> findByNamespace(@PathVariable String namespace)
	{
		return contentRepository.findByNamespace(namespace);
	}

	@PostMapping(consumes = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Content create(@RequestBody Content content)
	{
		return contentRepository.save(content);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		contentRepository.delete(id);
	}

	@PutMapping("/{id}")
	public Content updateContent(@RequestBody Content content)
	{
		return contentRepository.save(content);
	}
}
