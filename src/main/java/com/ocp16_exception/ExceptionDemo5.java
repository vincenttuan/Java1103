package com.ocp16_exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            System.out.println(calcBMI(170, 60));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            System.out.println(calcBMI(-170, 60));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
    public static double calcBMI(double h, double w) throws Exception {
        if(h <= 0) {
            Exception e = new Exception("身高不可 <= 0");
            throw e;
        }
        if(w <= 0) {
            Exception e = new Exception("體重不可 <= 0");
            throw e;
        }
        return w / Math.pow(h/100, 2);
    }
}
