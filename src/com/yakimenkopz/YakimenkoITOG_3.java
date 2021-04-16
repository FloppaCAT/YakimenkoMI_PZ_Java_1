package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoITOG_3 {
    public static void main(String args [ ])
    {
        System.out.print("Количество строк: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        String [] strArray = new String[a];
        int [] intArray = new int[a];
        scan1.nextLine();
        for (int i=0;i<strArray.length;i++){
            System.out.print("Строка "+(i+1)+" : ");
            strArray[i] = scan1.nextLine();
        }
        System.out.print("Ответ: ");
        //переводим каждый элемент массива в массив char'ов и проверяем на кол-во совпадений
        int counter = 0;
        int counter1 = 0;
        for (int i=0;i< strArray.length;i++) {
            counter = 0;
            char[] chArray = strArray[i].toCharArray();
            for (int j=0;j<chArray.length;j++){
                counter1 = 0;
                for (int k=0;k<chArray.length;k++){
                    if (chArray[j]==chArray[k]){
                        counter1 +=1;
                    }if (counter1>1){
                        counter +=1;
                    }
                    intArray[i] = counter;
                }
            }

        }
        //находим минимальное значение повторений. int min = intArray[0]; запись нужна чтобы он начинал сравнивать с первым числом
        int min = intArray[0];
        for (int i=0;i< intArray.length;i++){
            if (intArray[i]<min){
                min = intArray[i];
            }
        }
        int counter2 = 0;
        for(int i=0;i< intArray.length;i++){
            if(intArray[i]==min){
                counter2+=1;
            }
        }
        //Находим и выводим все подходящие результаты
        for (int i=0;i<intArray.length;i++){
            if (intArray[i]==min){
                System.out.print(strArray[i] + ", ");
                if (counter2>1){
                    break;
                }
            }
        }
        System.out.println("\b"+"\b");
    }
}
