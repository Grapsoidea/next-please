package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import static java.lang.Math.*;

@Data
@AllArgsConstructor
public class BranchesWithDistance {
    private Long id;
    private String address;
    private double lat;
    private double lon;
    private String title;
    private long distance;

    public static BranchesWithDistance valueOf(Branches branches, double lat, double lon) {
        return new BranchesWithDistance(
                branches.getId(),
                branches.getAddress(),
                branches.getLat(),
                branches.getLon(),
                branches.getTitle(),
                branches.calcDistance(lat, lon));
    }
}
