package org.mdehaan.repository;

import org.mdehaan.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository  extends CrudRepository<Event, String>
{}
