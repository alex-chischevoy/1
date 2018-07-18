package com.example.task;

import java.util.Scanner;

public class Sravnenye {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scn.nextInt();
        System.out.println("Введите второе число");
        int y = scn.nextInt();
        if (x > y) {
            System.out.println(x - y);
        } else {
            System.out.println(x + y);
        }
    }
}
