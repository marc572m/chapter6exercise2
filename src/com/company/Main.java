package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double result = squareRoot(a);
        System.out.println(result);

    }

    public static double squareRoot(double a) {
        double x = a / 2;
        double oldx = (-1);
        for (int i = 0; Math.abs(oldx - x) > 0.00001; i++) {
            oldx = x;
            x =(x + a/x) / 2;
        }

        return x;
    }
}
