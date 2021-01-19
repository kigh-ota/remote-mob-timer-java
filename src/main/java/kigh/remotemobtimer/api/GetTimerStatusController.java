package kigh.remotemobtimer.api;

import java.util.Collections;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GetTimerStatusController {
    @GetMapping("timer/status")
    GetTimerStatusResponse run() {
        var timer = new GetTimerStatusResponse.Timer("Timer", 0, 1, false);
        return new GetTimerStatusResponse(timer, Collections.emptyList());
    }
}
