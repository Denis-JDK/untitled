package ru.geekbrains.basa_home_work_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = arr[0]; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else if (arr[i] == 1) arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
        // не понимаю почему arr[0] так и остается 1


        int[] mas = new int[8];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i * 3;

        }
        System.out.println(Arrays.toString(mas));

        int[] arrSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrSix.length; i++) {
            if (arrSix[i] < 6) arrSix[i] = arrSix[i] * 2;
        }
        System.out.println(Arrays.toString(arrSix));

        int counter = 1;
        int[][] tableDiagonal = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tableDiagonal[i][j] = counter;
                System.out.print(tableDiagonal[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
        do {
            if (tableDiagonal[0][0] != 1) tableDiagonal[0][0] = 1;
            else if (tableDiagonal[0][2] != 1) tableDiagonal[0][2] = 1;
            else if (tableDiagonal[1][1] != 1) tableDiagonal[1][1] = 1;
            else if (tableDiagonal[2][0] != 1) tableDiagonal[2][0] = 1;
            else if (tableDiagonal[2][2] != 1) tableDiagonal[2][2] = 1;
        } while (tableDiagonal[0][2] != 1 || tableDiagonal [1][1] != 1 || tableDiagonal[2][0] != 1 || tableDiagonal[2][2] != 1);
        //System.out.print(Arrays.toString(tableDiagonal));// не могу вывести в консоль результат, какие то кракозябры выводится

            int[] arrMaxMin = {3, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int max = arrMaxMin[0];
            int min = arrMaxMin[0];
            for(int m = 0; m < arrMaxMin.length; m++) {
                if (arrMaxMin[m] > max)
                    max = arrMaxMin[m];
                if (arrMaxMin[m] < min)
                    min = arrMaxMin[m];
            }

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);*/




           int [] checkBalance = { 1, 1, 1, 2, 1};

            private boolean Form6 [String a; int b; int n; int m; int k] {
                String [] balance = {a , b, n, m, k};
                int left = 0;
                int right = 0;
            for (int i = checkBalance[0]; i <= checkBalance[2]; i++)
                left = checkBalance[i] + i;
            for (int j = checkBalance[3]; j <= checkBalance[4]; j++)
                right = checkBalance[j] = j;
            if (left == right) return true; }
        }
    }
}


