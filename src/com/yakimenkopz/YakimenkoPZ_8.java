package com.YakimenkoPZ;

import java.util.Scanner;

public class YakimenkoPZ_8 {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное целое число");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        int sum = 0;

        for(int i = 1;i<=a;i++){
            if(!(i%2==0)){
                sum += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел равна: " + sum);
    }
}
