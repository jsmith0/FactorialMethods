package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {


        System.out.println("Enter an integer and I will give you the factorial.");
        Main w = new Main();
        w.factorial();
    }

    public int factorial(){
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        int inputA = 0;
        for (int a = 1; a<=input; a++){
            int q = input-a;
            inputA = input * (q);

            System.out.println(inputA);
            System.out.println(input);
            System.out.println(q);
            System.out.println(a + "\n");
        }
        System.out.println(inputA);
        return inputA;

    }

    public int factorial2(){
        Scanner kb = new Scanner(System.in);
        int in = kb.nextInt();
        int z = in;
        
        return ???;
    }
}
