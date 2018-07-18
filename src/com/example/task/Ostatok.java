package com.example.task;

import java.util.Scanner;

public class Ostatok {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scn.nextInt();
        if ((x % 7) == 0) {
            System.out.println(x * 2);
        } else {
            System.out.println("Число не делиться на 7 без остатка");
        }

    }
}