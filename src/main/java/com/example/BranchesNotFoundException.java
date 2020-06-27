package com.example;

import lombok.Getter;

@Getter
public class BranchesNotFoundException extends RuntimeException {
    public BranchesNotFoundException(String msg) {
        super(msg);
    }
}
