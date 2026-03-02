package loopingStatements;

import java.util.Scanner;

public class bowpattern {
    static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int k = 2 * i; k <= 2 * size; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
            for (int i = size - 1; i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                for (int k = 2 * i; k <= 2 * size; k++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }


