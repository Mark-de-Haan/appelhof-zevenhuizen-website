package org.mdehaan.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static java.util.Objects.requireNonNull;

@Entity
public class Event
{
    @Id
    private String eventName;

    @Column
    private String eventDescription;

    @Column
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @Column
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    protected Event()
    {
        // No args constructor for JPA
    }

    public Event(String eventName, String eventDescription)
    {
        this.eventName = requireNonNull(eventName);
        this.eventDescription = requireNonNull(eventDescription);
    }

    public String getEventName()
    {
        return eventName;
    }

    public String getEventDescription()
    {
        return eventDescription;
    }

    public LocalDateTime getCreateDateTime()
    {
        return createDateTime;
    }

    public LocalDateTime getUpdateDateTime()
    {
        return updateDateTime;
    }
}
