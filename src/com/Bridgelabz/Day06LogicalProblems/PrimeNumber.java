package com.Bridgelabz.Day06LogicalProblems;

import java.util.Scanner;

public class PrimeNumber {          //

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num, i , count = 0;
        num = sc.nextInt();
        for(i=2; i<num; i++)
        {
            if(num%2 == 0)
            {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("It is prime number");
        else
            System.out.println("It is not prime number");
    }
}
