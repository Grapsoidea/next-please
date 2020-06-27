package com.example;

import lombok.Data;

@Data
public class BranchesWithPredicting {
    private long id;
    private String address;
    private int dayOfWeek;
    private int hourOfDay;
    private double lat;
    private double lon;
    private long predicting;
    private String title;
}
