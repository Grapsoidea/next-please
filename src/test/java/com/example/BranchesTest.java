package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchesTest {

    @Test
    void calcDistance() {
        Branches branches = new Branches();
        branches.setLat(55.7539);
        branches.setLon(37.6208);

        long distance = branches.calcDistance(59.9398, 30.3146);

        assertEquals(634340, distance);
    }
}