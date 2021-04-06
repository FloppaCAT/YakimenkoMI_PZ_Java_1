package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoPZ_10 {
    public static void main(String args [ ])
    {
        //Аркадий, я решил пожертвовать длинной кода, ради +- красивого вывода, например, я добавил вывод в консоль уточняющей
        //записи о том что вводится, кол-во строк или столбцов. Для уменьшения кода, можно это убрать, а считывание вставить в массив
        System.out.println("Введите кол-во строк и столбцов");
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Кол-во строк: ");
        int a = scan1.nextInt();
        System.out.print("Кол-во столбцов: ");
        int b = scan1.nextInt();
        int [][] arr2 = new int [a][b];

        for (int i = 0;i< arr2.length;i++){
            for(int j = 0;j<arr2[i].length;j++){
                System.out.print("Строка № "+ i + " элемент № " + j + " : ");
                arr2[i][j] = scan1.nextInt();
            }
        }
        System.out.println("Введите № строки массива, которую Вы хотите вывести");
        int rowNum = scan1.nextInt();
        System.out.print("Элементы строки № " + rowNum + " массива умноженные на 3: ");
        for(int i=0;i<arr2[rowNum].length;i++){
            System.out.print(arr2[rowNum][i]*3 + " ");
        }
    }
}
