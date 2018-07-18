package com.example.task;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите три числа");
        int first = scn.nextInt();
        int second = scn.nextInt();
        int third = scn.nextInt();
        if (first > second && first > third) {
            System.out.println("Наибольшее число: " + first);
        }
        if (first < second && first < third) {
            System.out.println("Наименьшее число: " + first);
        }
        if (second > first && second > third) {
            System.out.println("Наибольшее число: " + second);
        }
        if (third < second && third < first) {
            System.out.println("Наименьшее число: " + third);
        }
        if (third > first && third > second) {
            System.out.println("Наибольшее число: " + third);
        }
        if (second < first && second < third) {
            System.out.println("Наименьшее число: " + second);
        }
    }
}
