package com.example.task;

import java.util.Scanner;

public class Diapazon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите десятичное число");
        double x = scn.nextDouble();
        if (x > 0 && x < 1) {
            System.out.println("Внутри диапазона");
        } else {
            System.out.println("Вне диапазона");
        }
    }
}
