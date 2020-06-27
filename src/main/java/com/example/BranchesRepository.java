package com.example;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BranchesRepository extends ReactiveCrudRepository<Branches, Long> {
}
