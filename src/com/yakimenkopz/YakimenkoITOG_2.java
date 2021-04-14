package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoITOG_2 {
    public static void main(String args[]) {
        System.out.print("Введите уравнение: ");
        Scanner scan1 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String[] strArray = str1.split("");
        double a = 0;
        double b = 0;
        for (String s : strArray) {
            boolean numb = s.matches("^[0-9]+$");
            if (numb) {
                a = Double.parseDouble(s);
                break;
            }
        }
        for (String s : strArray) {
            boolean numb = s.matches("^[0-9]+$");
            if (numb) {
                b = Double.parseDouble(s);
            }
        }
        int index1 = str1.indexOf("x");
        if ("+".equals(strArray[1])) {
            switch (index1) {
                case 0:
                case 2:
                    double x = b - a;
                    System.out.println("Вывод: " + x);
                    break;
                case 4:
                    x = a + b;
                    System.out.println("Вывод: " + x);
                    break;
            }
        } else if ("-".equals(strArray[1])) {
            switch (index1) {
                case 0:
                    double x = b + a;
                    System.out.println("Вывод: " + x);
                    break;
                case 2:
                case 4:
                    x = a - b;
                    System.out.println("Вывод: " + x);
                    break;
            }
        } else if ("*".equals(strArray[1])) {
            switch (index1) {
                case 0:
                case 2:
                    double x = 0;
                    if (a==0){
                        System.out.println("Первое целочисленное значение = 0 недопустимо!");
                        break;
                    } else x = b / a;
                    System.out.println("Вывод: " + x);
                    break;
                case 4:
                    x = a * b;
                    System.out.println("Вывод: " + x);
                    break;
            }
        } else if ("/".equals(strArray[1])) {
            switch (index1) {
                case 0:
                    double x = b * a;
                    System.out.println("Вывод: " + x);
                    break;
                case 2:
                case 4:
                    if (b==0){
                        System.out.println("На ноль делить нельзя!");
                        break;
                    }else x = a / b;
                    System.out.println("Вывод: " + x);
                    break;
            }
        }
    }
}
