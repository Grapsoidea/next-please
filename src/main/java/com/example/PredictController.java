package com.example;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PredictController {

    Mono<BranchesWithPredicting> getBranchesWithPredicting(@RequestParam int dayOgWeek, @RequestParam int  hourOfDay, @RequestParam long id) {
        return null;
    }
}
