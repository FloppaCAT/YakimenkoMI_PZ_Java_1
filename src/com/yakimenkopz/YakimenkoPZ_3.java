package com.YakimenkoPZ;

import java.sql.SQLOutput;
import java.util.Arrays;

public class YakimenkoPZ_3 {
    public static void main(String[] args) {
        //1. Создаем и ыводим массив
        int Arr[] = {1,2,3,4,5};
        System.out.println("Первоначальный вид массива:");
        for(int i=0;i<Arr.length;i++){
            System.out.print(" " + Arr[i] + " ");
        }
        //2. Меняем местами первый и последний элементы
        int A = Arr[0];
        Arr[0] = Arr[Arr.length-1];
        Arr[Arr.length-1] = A;

        System.out.println(" ");
        System.out.println("Новый Массив:");
        for(int i =0;i<Arr.length;i++){
            System.out.print(" " + Arr[i] + " ");
        }
        //3. Вычисляем и выводим сумму первого и среднего элементов
        System.out.println(" ");
        int sum = Arr[0] + Arr[Arr.length-3];
        System.out.println("Сумма первого и среднего элементов нового массива " + sum);
    }
}
