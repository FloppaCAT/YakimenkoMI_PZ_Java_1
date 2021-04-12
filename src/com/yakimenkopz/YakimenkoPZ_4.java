package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoPZ_4 {
    public static void main(String[] args) {
        //Объявляем массив
        int Arr[] = new int[3];
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите 3 любых числа");
        //Наполняем массив числами с клавиатуры
        for (int i=0;i<3;i++){
            Arr[i] = scan1.nextInt();
        }
        double average = 0;
        double sum = 0;
        //Считаем среднее арефметическое
        for (int i=0;i<Arr.length;i++){
            sum+=Arr[i];
        }
        average = sum/Arr.length;
        System.out.println("Среднее арефметическое введенных чисел = " + average);
        //Округляем вниз
        average = average/2;
        double FloorAverage = Math.floor(average);
        System.out.println("Разделили результат на 2 и округлили вниз = " + FloorAverage);
        if (FloorAverage>3)
            System.out.println("Программа выполнена корректно");

    }
}
