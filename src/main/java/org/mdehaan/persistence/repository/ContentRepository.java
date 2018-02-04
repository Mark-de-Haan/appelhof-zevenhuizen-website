package org.mdehaan.persistence.repository;

import org.mdehaan.persistence.model.Content;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ContentRepository extends CrudRepository<Content, Long>
{
	/**
	 * Find a content entity by ID
	 *
	 * @param id id of a content entity
	 * @return Optional Content
	 */
	Optional<Content> findOne(long id);

	/**
	 * Find all content for a specific namespace
	 *
	 * @param namespace
	 * @return
	 */
	List<Content> findByNamespace(String namespace);
}
