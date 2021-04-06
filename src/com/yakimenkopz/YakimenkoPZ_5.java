package com.YakimenkoPZ;

import java.util.Scanner;

public class YakimenkoPZ_5 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите 2 числа, затем один из символов арифметического действия: ‘+’, ‘-’, ‘*’ или ‘/’");
        int a = scan1.nextInt();
        int b = scan1.nextInt();
        scan1.nextLine(); //Метод nextInt добавляет \n после себя.
        // Из-за этого не работал NextLine, т.к. читал \n. Поэтому добавил еще один скан
        String c = scan1.nextLine();
        double d = 0;
        switch (c){
            case "+": d = a+b;
                System.out.println(a+"+"+b+"="+d);
                break;
            case "-": d = a-b;
                System.out.println(a+"-"+b+"="+d);
                break;
            case "*": d = a*b;
                System.out.println(a+"*"+b+"="+d);
                break;
            case "/": d = a/b;
                System.out.println(a+"/"+b+"="+d);
                break;
            default:
                System.out.println("Введен некорректный символ!");
        }
    }
}
