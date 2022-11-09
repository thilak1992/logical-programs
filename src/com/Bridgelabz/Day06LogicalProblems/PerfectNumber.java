package com.Bridgelabz.Day06LogicalProblems;

import java.util.Scanner;

public class PerfectNumber {            //

    public static void main(String[] args) {
        //Taking input from the user
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
                                                                    //executes until the condition becomes false
        while (i <= num / 2) {
            if (num % i == 0) {
                                                                    //Calculates the sum of factors
                sum += i;
            }
                                                                    //after every iteration it will increment the value of variable by 1
            i++;
        }
                                                                    //it will compare the sum with number
        if (sum == num) {
                                                                    //it will print if sum and num will are equal
            System.out.println("It is perfect number");
        } else {
                                                                    //it will print if sum and num will are not equal
            System.out.println("It is not perfect number");
        }
    }
}
