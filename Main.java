package com.company;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        System.out.println("NO OF PLAYERS:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if ( a == 1)
            System.out.println("Starting at the position 0");
        else
            System.out.println("Excessive player error");

    }
}
