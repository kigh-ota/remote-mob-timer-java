package kigh.remotemobtimer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
class GetTimerStatusController {
    @GetMapping("timer/status")
    GetTimerStatusResponse run() {
        var timer = new GetTimerStatusResponse.Timer("Timer", 0, 1, false);
        return new GetTimerStatusResponse(timer, Collections.emptyList());
    }
}
