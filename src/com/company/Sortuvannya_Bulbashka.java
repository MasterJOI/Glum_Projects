package com.company;

import java.util.Random;

public class Sortuvannya_Bulbashka {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[1000];
        System.out.println("Початковий масив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt() % 1500;
            System.out.print(arr[i] + " ");
        }
        boolean Sort_num = false;
        int a;
        while (!Sort_num) {
            Sort_num = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    Sort_num = false;
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        }
        System.out.println("\nВідсортований масив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
