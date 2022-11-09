package com.Bridgelabz.Day06LogicalProblems;

import java.util.Scanner;

public class FibonacciSeries {          //

    public static void main(String[] args) {
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        int term1 = 0, term2 = 1;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();   //Declare and initialize the number
        System.out.println("Fibonacci Series upto "+ n +": ");
        //Print the fibonacci series upto that number
        while (term1 <= n) {
            System.out.println(term1+ " ");
            //It will update the series in each iteration
            int sum = term1 + term2;
            term1 = term2;
            term2 = sum;
        }
    }
}
