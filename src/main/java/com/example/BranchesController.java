package com.example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class BranchesController {
    private final BranchesRepository branchesRepository;

    @GetMapping("/branches")
    Mono<Branches> getNearBranch(@RequestParam double lat, @RequestParam double lon) {
        return null;
    }

    @GetMapping("/branches/{id}")
    Mono<Branches> getBranch(@PathVariable long id) {
        return branchesRepository
                .findById(id)
                .switchIfEmpty(
                    Mono.error(new BranchesNotFoundException("branch not found"))
                );
    }
}
