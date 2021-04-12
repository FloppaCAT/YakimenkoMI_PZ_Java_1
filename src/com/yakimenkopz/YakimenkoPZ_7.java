package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoPZ_7 {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 11;
        System.out.println("Введите рамер массива");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        int[] arr = new int[a];

        System.out.println("Заполните массив, вводя значения с клавиатуры");
        for(int i=0; i<arr.length;i++){
            arr[i] = scan1.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x){
                System.out.println("Данное значение имеется в константах");
                break;
            } else if(arr[i] == y){
                System.out.println("Данное значение имеется в константах");
                break;
            } else if (arr[i] == z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
            if (i == arr.length-1){
                System.out.println("Нет совпадений с константами");
            }
        }

    }
}
