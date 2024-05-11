package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number8 {
        public static void main(String[] args) {
        /*Create a Java program that takes two numbers and an operator (+, -, *, /) 
        as inputs and performs the corresponding arithmetic operation using a switch case statement. */


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n");
        sc.nextLine();
        String op = sc.nextLine();
        sc.close();
        int sum=n1+n2;
        int subtraction=n1-n2;
        int multiply=n1*n2;
        int division=n1/n2;

        switch(op){
            
            case "1":System.out.println("Adding "+n1+" and "+n2+" we get "+sum);
            break;
            case "2":System.out.println("Subtracting "+n1+" and "+n2+" we get "+subtraction);
            break;
            case "3":System.out.println("Multiplying "+n1+" and "+n2+" we get "+multiply);
            break;
            case "4":System.out.println("Dividing "+n1+" and "+n2+" we get "+division);
            break;
            
            
        }
    }
}
