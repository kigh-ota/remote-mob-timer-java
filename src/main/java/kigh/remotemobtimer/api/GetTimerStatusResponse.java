package kigh.remotemobtimer.api;

import java.util.List;
import lombok.Value;

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
