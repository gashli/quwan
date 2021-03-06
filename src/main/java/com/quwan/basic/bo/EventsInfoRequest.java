package com.quwan.basic.bo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class EventsInfoRequest extends BaseRequest{

    private String eventId;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EventsInfoRequest{");
        sb.append("eventId='").append(eventId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
