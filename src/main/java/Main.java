/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your height, in inches?");
        Scanner input = new Scanner(System.in);
        float height = input.nextFloat();

        System.out.println("What is your weight, in pounds?");
        Scanner input2 = new Scanner(System.in);
        float pounds = input2.nextFloat();

        float bmi = (pounds/(height*height))*703;

        System.out.println("Your BMI is " + bmi);


        if (bmi>=18.5 && bmi <= 25){
            System.out.println("You are within the ideal weight range.");
        }
        else if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else {
            System.out.println("You are underweight. You should see your doctor.");
        }
    }
}