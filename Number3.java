package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        
        // Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        System.out.println((number%5==0 && number%11==0)?"Divisible":"Not divisible");



    }
}
