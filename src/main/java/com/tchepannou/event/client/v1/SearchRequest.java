package com.tchepannou.event.client.v1;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashSet;

public class SearchRequest {
    //-- Attributes
    @NotEmpty(message = "calendar_id_missing")
    private Collection<Long> calendarIds = new HashSet<>();

    @NotNull (message = "start_date_missing")
    private String startDate;

    @NotNull (message = "end_date_missing")
    private String endDate;

    private int limit = 30;

    private int offset;

    //-- Getter/Setter
    public Collection<Long> getCalendarIds() {
        return calendarIds;
    }

    public void setCalendarIds(Collection<Long> calendarIds) {
        this.calendarIds = calendarIds;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
