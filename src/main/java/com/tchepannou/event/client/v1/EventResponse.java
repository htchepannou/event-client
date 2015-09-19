package com.tchepannou.event.client.v1;

import java.util.Date;

public class EventResponse {
    private long id;
    private long calendarId;
    private String type;
    private String name;
    private String description;
    private Date startDate;
    private String startTime;
    private String endTime;
    private String recurrenceId;
    private Boolean requireRsvp;
    private Date created;
    private Date updated;
    private AddressResponse address;
    private PlaceResponse place;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRecurrenceId() {
        return recurrenceId;
    }

    public void setRecurrenceId(String recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public Boolean getRequireRsvp() {
        return requireRsvp;
    }

    public void setRequireRsvp(Boolean requireRsvp) {
        this.requireRsvp = requireRsvp;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public AddressResponse getAddress() {
        return address;
    }

    public void setAddress(AddressResponse address) {
        this.address = address;
    }

    public PlaceResponse getPlace() {
        return place;
    }

    public void setPlace(PlaceResponse place) {
        this.place = place;
    }
}
