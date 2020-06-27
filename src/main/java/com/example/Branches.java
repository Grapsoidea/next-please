package com.example;

import lombok.Data;
import org.springframework.data.annotation.Id;

import static java.lang.Math.*;

@Data
public class Branches {
    @Id
    private Long id;
    private String address;
    private double lat;
    private double lon;
    private String title;

    public long calcDistance(double lat, double lon) {
        double fi1 = toRadians(this.lat);
        double la1 = toRadians(this.lon);
        double fi2 = toRadians(lat);
        double la2 = toRadians(lon);

        return (long)(2 * 6371000 * asin(sqrt(pow((sin(fi2 - fi1)/2), 2) + cos(fi2) * cos(fi1) * pow(sin((la2 - la1)/2), 2))));
    }

    public static Branches minDistance(Branches branches1, Branches branches2, double lat, double lon) {
        if(branches1.calcDistance(lat, lon) < branches2.calcDistance(lat, lon))
            return branches1;
        else
            return branches2;
    }
}
