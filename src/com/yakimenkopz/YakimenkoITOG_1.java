package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoITOG_1 {
    public static void main(String args [ ])
    {
        System.out.print("Курс доллара: ");
        Scanner scan1 = new Scanner(System.in);
        double kurs = scan1.nextDouble();

        System.out.print("Количество рублей: ");
        double rub = scan1.nextDouble();

        double itog = rub/kurs;
        System.out.printf("Итог: %.2f" + " долларов", itog);
    }
}
