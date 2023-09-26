package ru.example.springcourse.controllers.house;

import java.util.Scanner;

public class DzRecursive {

    public static void main(String[] args) {


        Scanner scr;

        String [] name = nameScanner(new Scanner(System.in));
        char [] elementStr = name[1].toCharArray();
        int sum = numberSum(elementStr, 0, 0);

        System.out.println("Здравствуйте "+ name[0] + " сумма числа: "+sum );
    }

    static String [] nameScanner(Scanner scr){
        String name = scr.nextLine();
        String [] words = name.split(" ");
        return words;
    }

    static int numberSum(char[] elementStr, int index, int sum) {
        return index == elementStr.length ? sum : numberSum(elementStr, index + 1, sum + elementStr[index]);
    }
}
