package zzapr;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //TODO Write a program that will list multiplication table for defined
        // values, e.g. <0, 10>
        Scanner input = new java.util.Scanner(System.in);

        System.out.print("Write from which value to start the table: ");
        int start = input.nextInt();

        System.out.print("Write from which value to end table with: ");
        int end = input.nextInt();


        //rows
        for (int i = start; i <= end; i++) {
            //columns
            for (int j = start; j <= end; j++) {
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }
    }
}
