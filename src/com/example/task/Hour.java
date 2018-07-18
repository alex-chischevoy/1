package com.example.task;

import java.util.Scanner;

public class Hour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //создаем объект класса Scanner
        System.out.println("Какой сейчас час?");
        int x = scn.nextInt();//ввод с консоли часа
        if (x > 9 && x < 18) {
            System.out.println("Я на работе");//условие для рабочего времени
        }
        if ((x < 9 || x > 18) && x >= 0 && x <= 24) {
            System.out.println("Я отдыхаю");//условие для отдыха
        }
        if (x < 0 || x > 24) {
            System.out.println("Такого времени не существует");
        }
    }
}
