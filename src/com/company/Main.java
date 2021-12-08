package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] motivation = {2, 6, -5, 24.5, 34, 44, 54.6, 25, -35, 45, -55, 65, 75, -85, 95,};
        System.out.println(Arrays.toString(motivation));
        double success = 0;
        boolean apple = false;
        for (Double numbers : motivation) {
            success += numbers;
            if (numbers >= 0) {
                apple = true;
            } else if (numbers > 0) {
                apple = false;
            }
        }
        System.out.println(success / motivation.length);
        System.out.println(apple);
    }
}