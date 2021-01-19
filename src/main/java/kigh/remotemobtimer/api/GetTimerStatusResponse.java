package kigh.remotemobtimer.api;

import lombok.Value;

import java.util.Collections;
import java.util.List;

@Value
class GetTimerStatusResponse {
    Timer timer;
    List<Event> eventHistory;

    @Value
    static class Timer {
        String name;
        int time;
        int clientCount;
        boolean isRunning;
    }

    @Value
    static class Event {
        Long id;
        String type;
        String date; // ISO 8601
    }
}
