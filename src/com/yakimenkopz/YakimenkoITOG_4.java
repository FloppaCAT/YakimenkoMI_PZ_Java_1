package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoITOG_4 {
    public static void main(String args [ ])
    {
        System.out.println("Напишите ответ на загадку: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
        String str1;
        int count = 0;
        int HelpCount = 0;
        Scanner scan1 = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.print("Ответ: ");
            str1 = scan1.nextLine();
            if (str1.equalsIgnoreCase("заархивированный вирус")){
                System.out.println("Правильно!");
                break;
            } else if (str1.equalsIgnoreCase("подсказка")){
                if (i>0){
                    System.out.println("Подсказка больше не доступна");
                    i--;
                } else {
                    count++;
                    System.out.println("Подсказка: А ВОТ У НАС НА МАКАХ ИХ НЕТ!!11!!! (с)");
                }
            } else if(!str1.equalsIgnoreCase("заархивированный вирус")){
                if (count == 1){
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else if (i<2) {
                    System.out.println("Подумай еще!");
                }else System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}
