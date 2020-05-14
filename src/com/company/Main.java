package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();

        int [] array = new int [n];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(50);
        }

        System.out.println(Arrays.toString(array));

        int min=array[0];
        for (int i=0; i<array.length; i++){
            if (i % 2!=0 && i!=0){
                while (array[i]<min){
                    min=array[i];
                }

            }
        }
        System.out.println(min);
    }
}
