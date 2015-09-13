package com.tchepannou.event.client.v1;

import java.util.ArrayList;
import java.util.List;

public class EventCollectionResponse {
    private List<EventResponse> events = new ArrayList<>();

    public int getSize (){
        return events.size();
    }

    public void addEvent (final EventResponse event){
        events.add(event);
    }

    public List<EventResponse> getEvents() {
        return events;
    }
}
