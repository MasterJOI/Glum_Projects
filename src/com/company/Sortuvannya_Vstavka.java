package com.company;

import java.util.Random;

public class Sortuvannya_Vstavka {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[1000];
        System.out.println("Початковий масив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt() % 1500;
            System.out.print(arr[i] + " ");
        }

        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
        System.out.println("\nВідсортований масив:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

