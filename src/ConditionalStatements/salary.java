package ConditionalStatements;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary ");
        double salary = sc.nextInt();
        double tax=0;
        double netSalary;
        if (salary<300000){
            tax=0;
        }else {
            if (salary <= 700000) {
                tax = salary * 0.10;
            } else {
                tax = salary * 0.20;
            }
        }
        netSalary = salary-tax;
            System.out.println("tax amt="+tax);
        System.out.println("Net salary"+netSalary);

        }



    }

