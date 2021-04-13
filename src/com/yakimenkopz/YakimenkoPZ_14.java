package com.yakimenkopz;

import java.util.Random;

public class YakimenkoPZ_14 {
    public static void main(String args [ ])
    {
        final int max = 20;
        final int min = -20;
        final int diff = max - min;
        int [] arr1 = new int[15];
        Random rand1 = new Random();
        for(int i=0; i< arr1.length;i++){
            arr1[i] = rand1.nextInt(diff +1)+min;
        }
        int max1 = 0;
        int min1 = 0;
        for (int i : arr1) {
            if (max1 < i) {
                max1 = i;
            } else if (min1 > i) {
                min1 = i;
            }
        }
        System.out.println("Максимальное: "+max1 + "\n" + "Минимальное: " + min1);
        max1 = Math.abs(max1);
        min1 = Math.abs(min1);
        int max2 = Math.max(max1,min1);
        System.out.println("Наибольшее по модулю: " + max2);
    }
}
