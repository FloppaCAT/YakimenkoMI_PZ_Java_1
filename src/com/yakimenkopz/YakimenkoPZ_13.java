package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoPZ_13 {
    public static void main(String args [ ])
    {
        Scanner scan1 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String[] strArray = str1.split("\\s+");
        int count = 0;
        for(int i=0;i< strArray.length;i++){
            boolean LatinAlphabet = strArray[i].matches("^[a-zA-Z]+$");
            if (LatinAlphabet){
                count = count +1;
                System.out.print(strArray[i] + ", ");
            }
        }
        //значение "\b"+"\b" - согласен что это легаси костыль. Но нужен он только исключительно из-за наведения красоты,
        //на код это никак не влияет
        System.out.println("\b"+"\b"+"\n"+"Кол-во латинских слов: " + count);
    }
}
