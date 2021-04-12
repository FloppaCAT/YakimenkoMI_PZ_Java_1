package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoPZ_11 {
    public static void main(String args [ ])
    {
        System.out.println("Введите первое число:");
        Scanner scan1 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String str2 = str1.replace(" ",  "");
        //Проверка - строка содержит только цифры
        String proverka = "\\d+";
        if (str2.matches(proverka)){
            System.out.println("Введите второе число:");
            int a  = scan1.nextInt();
            int b = Integer.parseInt(str2);
            int resultInt = Math.max(a,b);
            System.out.println("Большее число: " + resultInt);
            double resultDouble = Math.min(a,b);
            System.out.println("Меньшее число: " + resultDouble);
        }
        else System.out.println("Введен некорректный символ");
    }
}
