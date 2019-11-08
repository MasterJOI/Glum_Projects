package com.company;

import java.util.Scanner;

public class Glum_Kalculator {
    public float a;
    public float b;
    public String c;
    public static double Sum(float a,float b)
    {
        return a+b;
    }
    public static double Minus(float a,float b)
    {
        return a-b;
    }
    public static double Mnoh(float a,float b)
    {
        return a*b;
    }
    public static double Dil(float a,float b)
    {
        return a/b;
    }
    public static float Mod(float a,float b)
    {
        return a%b;
    }
    public static double Calculate(float a,float b, String c)
    {
        switch (c)
        {
            case "+": return Sum(a,b);
            case "-": return Minus(a,b);
            case "*": return Mnoh(a,b);
            case "/": return Dil(a,b);
            case "%": return Mod(a,b);
            default: return Double.NaN;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введіть 1 число: ");
        Scanner first = new Scanner(System.in);
        float a = first.nextFloat();

        System.out.println("Введіть 2 число: ");
        Scanner second = new Scanner(System.in);
        float b = second.nextFloat();

        System.out.println("Введіть знак операції: ");
        Scanner znak = new Scanner(System.in);
        String c = znak.next();
        double res = Calculate(a,b,c);
        System.out.println("Відповідь: "+ res);
    }
}

