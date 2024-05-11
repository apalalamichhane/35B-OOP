package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);
        
           // Write a JAVA program to check whether a number is even or odd

           String NumberInput = "Enter a number: ";
           System.out.println(NumberInput);
           int number = sc.nextInt();
           sc.close();

           System.out.println((number%2==0)?"even":"odd");
    }
}
