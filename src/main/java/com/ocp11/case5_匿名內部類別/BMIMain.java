package com.ocp11.case5_匿名內部類別;

public class BMIMain {
    public static void main(String[] args) {
        // Java 7 以前的寫法
        BMI bmi = new BMI() {
            @Override
            public double getBMIByHeightAndWeight(double height, double weight) {
                return weight / Math.pow(height/100, 2);
            }
        };
        System.out.println(bmi.getBMIByHeightAndWeight(170, 60));
        
        // Java 8 Lambda
        BMI bmi2 = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println(bmi2.getBMIByHeightAndWeight(170, 60));
    }
}
