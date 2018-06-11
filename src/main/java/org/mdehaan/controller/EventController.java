package org.mdehaan.controller;

import org.mdehaan.model.Event;
import org.mdehaan.model.EventResponse;
import org.mdehaan.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.google.common.collect.Streams.stream;
import static java.util.stream.Collectors.toList;


@RestController
public class EventController
{
    @Autowired
    private EventRepository eventRepository;

    @GetMapping(value = "/events/list", produces = "application/json")
    public List<EventResponse> getEvents()
    {
        return stream(eventRepository.findAll()).map(EventResponse::create).collect(toList());
    }

    @PostMapping("/admin/event/create")
    @ResponseStatus(HttpStatus.OK)
    public void createEvent(@Valid @ModelAttribute Event event)
    {
        eventRepository.save(event);
    }

    @PostMapping("/admin/event/edit")
    @ResponseStatus(HttpStatus.OK)
    public void editEvent(@Valid @ModelAttribute Event event)
    {
        eventRepository.save(event);
    }

    @DeleteMapping("/admin/event/remove")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEvent(@Valid @ModelAttribute Event event)
    {
        eventRepository.delete(event);
    }
}
