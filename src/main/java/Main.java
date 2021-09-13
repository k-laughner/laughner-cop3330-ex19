/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static Scanner console = new Scanner (System.in);
    static public char restart = 'n';

    public static void main(String[] args) {
      do {
        try{
          System.out.println("What is your height, in inches?");
          float height = console.nextFloat();
          
          System.out.println("What is your weight, in pounds?");
          float pounds = console.nextFloat();

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
        catch (InputMismatchException fe){
          System.out.println("You did not enter an integer. Please try again.");
          restart='y';
          console.next();
        }
    }
    while (restart == 'y');
  }
}
