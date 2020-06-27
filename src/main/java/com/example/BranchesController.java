package com.example;

import lombok.RequiredArgsConstructor;
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
    Mono<BranchesWithDistance> getNearBranch(@RequestParam double lat, @RequestParam double lon) {
        return branchesRepository
                .findAll()
                .reduce(((branches1, branches2) -> Branches.minDistance(branches1, branches2, lat, lon)))
                .map(branches -> BranchesWithDistance.valueOf(branches, lat, lon));
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
