package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number9 {
    /*Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season 
    (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12");
        int seasons = sc.nextInt();
        sc.close();
        
        switch(seasons){
            case 1,2,3: System.out.println("Winter");
            break;
            case 4,5,6: System.out.println("Spring");
            break;
            case 7,8,9: System.out.println("Summer");
            break;
            case 10,11,12: System.out.println("Fall");
            break;
        }
    }
}
