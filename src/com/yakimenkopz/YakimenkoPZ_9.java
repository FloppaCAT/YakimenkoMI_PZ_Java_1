package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoPZ_9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();
        double arr[] = new double[size];

        System.out.println("Вводите значения для заполнения массива(Вводить через запятую)");
        for (int i=0;i<arr.length;i++){
            arr[i] = scan1.nextDouble();
        }
        double average = 0;
        double sum = 0;
        for (int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        average = sum/arr.length;

        System.out.println("Массив * AVG: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(String.format("%.2f",arr[i]*average) + " ");
        }
    }
}
