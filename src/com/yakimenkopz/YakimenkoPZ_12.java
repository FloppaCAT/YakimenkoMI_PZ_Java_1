package com.yakimenkopz;

import java.util.Scanner;

public class YakimenkoPZ_12 {
    public static void main(String args [ ])
    {
        boolean s1,s2,s3;
        Scanner scan1 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        s1 = str1.contains("Java");
        s2 = str1.startsWith("I like");
        s3 = str1.endsWith("!!!");
        if (s1 && s2 && s3){
            System.out.println("Строка содержит \"Java\", начинается с \"I like\", заканчивается \"!!!\"");
            System.out.println(str1.toUpperCase());

        } else System.out.println("Заданные условия не выполняются");

        String str2 = str1.replace("a",  "o");
        int indexM = str1.indexOf("Java");
        if(indexM == - 1) {
            System.out.println("\"Java\" не найден");
        } else {
            str2 = str2.substring(indexM,indexM+4);
            System.out.println(str2);
        }
    }
}
