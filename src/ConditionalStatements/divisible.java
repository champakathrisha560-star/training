package ConditionalStatements;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n % 7 == 0 && n % 3 == 0) {
            System.out.println("The number is divisible by 7 and 3");
        } else {
            System.out.println("get lost");
        }
    }
}

