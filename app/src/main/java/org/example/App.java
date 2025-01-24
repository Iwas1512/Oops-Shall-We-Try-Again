// Author: @Anlil iwas
//Date: 01/22/25 
//Instructor: Cyrus Vandrevala

package org.example;

import java.util.Scanner;

public class App {

    public static int getInput(int lowerBound, int upperBound, String promptMessage, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do { 
      

          // checks if an int was even given, we are not accepting any other values except ints. doubles will cause error
          System.out.println(promptMessage);
          while (!scanner.hasNextInt()) {
            System.out.println(errorMessage);
            System.out.println(promptMessage);
            scanner.next(); 
        }

        //checking if the int entered was in the bounds we chose.
            userInput = scanner.nextInt();
            if (userInput < lowerBound || userInput > upperBound) {
                System.out.println(errorMessage);
            }
        } while (userInput < lowerBound || userInput > upperBound); 

        return userInput;
    }



    public static void main(String[] args) {

      System.out.println("Hello! Welcome to My Oops Shall We Try Again Lab. This lab will test user inputs and range of ints. Using Lower bound and upper bounds.");



      //tests below since we will not do Junit tests for this lab. 
      int lowerBound = -10; 
      int upperBound = 85;
      String promptMessage = " enter an int value between " + lowerBound + " and " + upperBound + ":";
      String errorMessage = "Invalid, lets try again no worries! Please enter an int between " + lowerBound + " and " + upperBound + ".";

      int validInput = getInput(lowerBound, upperBound, promptMessage, errorMessage);
      System.out.println("The value chosen is " + validInput); 
     
    }
}
