package com.testinglaboratory.basics.lesson4_logic;

import java.util.Scanner;

public class FlowControlExcercise {

    public static void main(String[] args) {
        //todo try to load two numbers from user and compare it with all operators that you already know

        int myNumberFromUser;
        int eleven = 11;
        int eleven2 = 15;

        Scanner scanner = new Scanner(System.in);

        System.out.println("type some number   ");
        myNumberFromUser = scanner.nextInt();

        if (myNumberFromUser < 0) {
            System.out.println("you numba is smaller than 0, yo!");
        } else {
            System.out.println("you numba must be bigger than 0, yo!");
        }

        if (eleven == 11) {
            System.out.println("is one is smaller than two? " + (eleven < eleven2));
        } else {
            System.out.println("you numba must be bigger than 0, yo!");

        }
    }
}
