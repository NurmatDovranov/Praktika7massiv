package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.println(arr[i]);
            b = b + arr[i];
        }
            System.out.println(b / arr.length);
        }


    }



