package loopingStatements;

import java.util.Scanner;

public class diamond {
    static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = size-2; i >=0; i--) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}