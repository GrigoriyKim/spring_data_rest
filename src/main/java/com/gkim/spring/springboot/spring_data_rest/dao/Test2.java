package com.gkim.spring.springboot.spring_data_rest.dao;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int hours = n / 60 / 60;
        int minutes = n / 60 % 60;
        int seconds = n % 60;
        hours = hours == 24 ? 0 : hours;
        System.out.println(hours + ":" + str(minutes) + ":" + str(seconds));
    }

    private static String str(int n) {
        return n < 10 ? "0" + n : "" + n;
    }
}
