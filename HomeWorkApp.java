package com.company;

public class HomeWorkApp {

    public static void main (String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 10;
        int b = 20;
        int sum = a + b;
        //if ((sum = a + b) >= 0) {...} - Пробовал по такому способу но вылезают 4 варнинга, оставил тот который ниже
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 101;
        if(value <= 0) {
            System.out.println("Красный");
        }
        if(value >0 && value<= 100) {
            System.out.println("Желтый");
        }
        if(value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 20;
        int b = 20;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}