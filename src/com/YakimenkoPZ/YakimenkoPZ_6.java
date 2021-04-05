package com.YakimenkoPZ;

import java.util.Scanner;

public class YakimenkoPZ_6 {
    public static void main(String[] args) {
        System.out.println("Вас приветствует конвертвер!\n>Выберите что переводить: 1 - массу, 2 - расстояние");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        boolean f1 = false;
        boolean f2 = false;
        switch (a){
            case 1: f1 = true;
                break;
            case 2: f2 = true;
                break;
            default:
                System.out.println("Введен некорректный символ!");
        }
        if (f1 == true){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            int b = scan1.nextInt();
            boolean d1 = false;
            boolean d2 = false;
            boolean d3 = false;
            boolean d4 = false;
            switch (b){
                case 1: d1 = true;
                    break;
                case 2: d2 = true;
                    break;
                case 3: d3 = true;
                    break;
                case 4: d4 = true;
                    break;
                default:
                    System.out.println("Введен некорректный символ!");
            }
            System.out.println("Введите число");
            double c = scan1.nextInt();
            if (d1 == true){
                System.out.printf("Результат:\nГрамм: "+c+"\nКилограмм: "+c/1000+"\nЦентнер: "+c/100000+"\nТонны: "+c/1000000);
            } else if (d2 == true){
                System.out.println("Результат:\nГрамм: "+c*1000+"\nКилограмм: "+c+"\nЦентнер: "+c/100+"\nТонны: "+c/1000);
            } else if (d3 == true){
                System.out.println("Результат:\nГрамм: "+c*100000+"\nКилограмм: "+c*100+"\nЦентнер: "+c+"\nТонны: "+c/10);
            } else if (d4 == true){
                System.out.println("Результат:\nГрамм: "+c*1000000+"\nКилограмм: "+c*1000+"\nЦентнер: "+c*10+"\nТонны: "+c);
            }
        } else if (f2 == true){
            System.out.println("Выберите единицу измерения: 1 - Сантиметр, 2 - Дециметр, 3 - Метр, 4 - Киллометр");
            int b = scan1.nextInt();
            boolean d1 = false;
            boolean d2 = false;
            boolean d3 = false;
            boolean d4 = false;
            switch (b){
                case 1: d1 = true;
                    break;
                case 2: d2 = true;
                    break;
                case 3: d3 = true;
                    break;
                case 4: d4 = true;
                    break;
                default:
                    System.out.println("Введен некорректный символ!");
            }
            System.out.println("Введите число");
            double c = scan1.nextInt();
            if (d1 == true){
                System.out.println("Результат:\nСантиметр: "+c+"\nДециметр: "+c/10+"\nМетр:"+c/100+"\nКилометр: "+c/100000);
            } else if (d2 == true){
                System.out.println("Результат:\nСантиметр: "+c*10+"\nДециметр: "+c+"\nМетр: "+c/10+"\nКилометр: "+c/10000);
            } else if (d3 == true){
                System.out.println("Результат:\nСантиметр: "+c*100+"\nДециметр: "+c*10+"\nМетр: "+c+"\nКилометр: "+c/1000);
            } else if (d4 == true){
                System.out.println("Результат:\nСантиметр: "+c*100000+"\nДециметр: "+c*10000+"\nМетр: "+c*1000+"\nКилометр: "+c);
            }
        }
    }
}
