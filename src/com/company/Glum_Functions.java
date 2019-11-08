package com.company;

import java.util.Random;

class Functions {
    public static int arr[] = new int[25];
    //1 Функція
    public static double Sum(float a,float b)
    {
        System.out.print("Результат виконання 1 функції: ");
        System.out.print(a+b +"\n");
        return a+b;
    }
    //2 Функція
    public static double Aver_of_3(float a,float b, float c)
    {
        System.out.print("Результат виконання 2 функції: ");
        System.out.print((a+b+c)/2+"\n");
        return (a+b+c)/2;
    }
    //3 Функція
    public static void Mas_fill()
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt() % 100;
        }
    }
    public static void Mas_output(int[] arr)
    {
        System.out.print("Результат виконання 3 та 4 функцій: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        Sum(4,1);
        Aver_of_3(2,4,6);
        Mas_fill();
        Mas_output(arr);
    }
}
