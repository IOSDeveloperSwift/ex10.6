package com.Doloscan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        isMultiple();

    }

    static boolean isMultiple() {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter nr1 => ");
        int nr1 = scr.nextInt();
        System.out.print("Enter nr2 => ");
        int nr2 = scr.nextInt();

        boolean answer = false;

        if (nr2 % nr1 == 0)
            answer = true;

        System.out.println(answer);

        return answer;
    }
}
