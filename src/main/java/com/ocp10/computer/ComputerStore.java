package com.ocp10.computer;

public class ComputerStore {
    public static void main(String[] args) {
        Computer computer = new Android();
        System.out.println(computer.add(10, 20));
        System.out.println(computer.getName());
        System.out.println(Computer.volt);
    }
}
