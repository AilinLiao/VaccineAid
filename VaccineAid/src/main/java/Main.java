package main.java;

import java.util.ArrayList;


public class Main {
    public static void main(String [ ] args) throws Exception {

        HospitalHelpRequest requestHospitalInformation = new HospitalHelpRequest();
        requestHospitalInformation.getHospitalInformation();
        System.out.println("");
        HealthTipRequest requestHealthTipInformation = new HealthTipRequest();
        requestHealthTipInformation.getInfo();

    }
}
