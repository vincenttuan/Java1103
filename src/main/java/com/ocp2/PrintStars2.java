package com.ocp2;

public class PrintStars2 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++) {
            for(int k=6-i;k>0;k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
}
