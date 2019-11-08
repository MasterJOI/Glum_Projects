package com.company;

import java.util.Scanner;

public class Chrestiki_Noliky {

    public static void main(String[] args) {
        char[][] arr = new char[3][3];
        System.out.println("Гра 'Хрестики-Нулики' v.0.0.1");
        System.out.println("-------------");
        System.out.println("| " + arr[0][0] + " | " + arr[0][1] + " | " + arr[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + arr[1][0] + " | " + arr[1][1] + " | " + arr[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + arr[2][0] + " | " + arr[2][1] + " | " + arr[2][2] + " |");
        System.out.println("-------------");
        for(int i = 0;i<=arr.length;i++ ) {
            if(i%2 == 0) System.out.println("Хід 1 гравця(ви граєте 'X'):");
            else System.out.println("Хід 2 гравця(ви граєте 'O'):");

                System.out.println("Введіть координату x(0,1,2): ");
                Scanner first = new Scanner(System.in);
            while (!first.hasNextInt()){
                System.out.println("Неправильно введений номер комірки!");
                first.next();
            }
                int x = first.nextInt();
                System.out.println("Введіть координату y(0,1,2): ");
                Scanner second = new Scanner(System.in);
            while (!second.hasNextInt()){
                System.out.println("Неправильно введений номер комірки!");
                second.next();
            }
                int y = second.nextInt();
                if(arr[x][y] != 0) System.out.println("Це поле вже зайняте!");
                else {if(i%2 == 0) arr[x][y] = 'X';
                else arr[x][y] = 'O';}

            System.out.println("-------------");
            System.out.println("| " + arr[0][0] + " | " + arr[0][1] + " | " + arr[0][2] + " |");
            System.out.println("-------------");
            System.out.println("| " + arr[1][0] + " | " + arr[1][1] + " | " + arr[1][2] + " |");
            System.out.println("-------------");
            System.out.println("| " + arr[2][0] + " | " + arr[2][1] + " | " + arr[2][2] + " |");
            System.out.println("-------------");
            System.out.println("");
        }
    }
}
