package com.example;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Branches {
    @Id
    private Long id;
    private String address;
    private double lat;
    private double lon;
    private String title;
}
