package ConditionalStatements;

import java.util.Scanner;

public class eligibilitytovote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n >= 18) {
            System.out.println("Eligible to vote");
        } else if (n < 18) {
            System.out.println("Not eligible to vote");
        }
    }
}
