package org.mdehaan.model;

import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;
import java.time.LocalDateTime;

@AutoValue
public abstract class EventResponse
{
    public abstract String getEventName();

    public abstract String getEventDescription();

    public abstract LocalDateTime getCreationDateTime();

    @Nullable
    public abstract LocalDateTime getUpdateDateTime();

    public static EventResponse create(Event event)
    {
        return new AutoValue_EventResponse(event.getEventName(), event.getEventDescription(), event.getCreateDateTime(), event.getUpdateDateTime());
    }
}
