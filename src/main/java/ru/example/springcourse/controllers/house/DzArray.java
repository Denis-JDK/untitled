package ru.example.springcourse.controllers.house;

import java.util.Scanner;

public class DzArray {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите длинну массива.");


        int[][] array = new int[4][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scr.nextInt();

            }
        }
        /*
        i0 1 2 3
        i1 2 3 4
        i2 3 4 5
        i3 4 5 6
                            i0= {{1,2,3}, i1={2,3,4}, i2={3,4,5}}
                            двумерный массив это массив массивов
        i-столбцы
        j-строки
         */

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Line "+ (i+1)+": " + sum);
            sum=0;
        }

        if (array!=null|| array[0]!=null){
            for (int i = 0; i<array[0].length; i++){
                for (int j = 0; j<array.length; j++){
                    sum+=array[j][i];
                }
                System.out.println("Colum "+ (i+1)+": " + sum);
                sum=0;
            }
        }
        }
    }
