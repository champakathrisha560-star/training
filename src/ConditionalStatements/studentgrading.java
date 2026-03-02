package ConditionalStatements;

import java.util.Scanner;

public class studentgrading {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5,totalmarks;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all five subject marks");
         sub1 = sc.nextInt();
         sub2=sc.nextInt();
         sub3= sc.nextInt();
         sub4 = sc.nextInt();
         sub5 = sc.nextInt();
         totalmarks=sub1+sub2+sub3+sub4+sub5;
        percentage= totalmarks/500.0*100;

        if (percentage>=75)
        {
            System.out.println("A grade");
        } else if (percentage>50 ) {
            System.out.println("B grade ");
        } else if (percentage>30) {
            System.out.println("C grade");
        }
        else
        {System.out.println("fail");

        }
    }

    }
