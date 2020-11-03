package com.ocp;

public class BMI {
    double h;
    double w;
    double calc() {
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
    double calc(double h, double w) {
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
}
