package com.ocp30_dialog;

import javax.swing.JOptionPane;

public class DialogInputDemo {
    public static void main(String[] args) {
        
        double h = Double.parseDouble(JOptionPane.showInputDialog("請輸入身高"));
        double w = Double.parseDouble(JOptionPane.showInputDialog("請輸入體重"));
        double bmi = w / Math.pow(h/100, 2);
        String result = bmi >= 24 ? "過胖" : bmi < 18.5 ? "過瘦" : "正常";
        //JOptionPane.showMessageDialog(null, String.format("bmi=%.2f (%s)", bmi, result));
        int flag = JOptionPane.showConfirmDialog(null, String.format("bmi=%.2f (%s) 是否要繼續?", bmi, result));
        if(flag == 0) {
            main(null);
        }
    }
}
