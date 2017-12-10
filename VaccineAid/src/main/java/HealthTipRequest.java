package main.java;

import java.util.Random;

public class HealthTipRequest {

    public String getInfo() {
        int n = 90;
        if (n%2 == 1) {
            return HealthTips.ONE.getValue();
        } else {
            System.out.println(HealthTips.TWO.getValue());
            return HealthTips.TWO.getValue();
        }

    }

}
