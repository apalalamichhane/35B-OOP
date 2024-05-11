package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        
         /*
     * Write a Java program that takes a student's grade as input (A, B, C, D, or F)
     *  and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.
     */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade obtained");
        String grade = sc.nextLine();
        grade = grade.toUpperCase();
        sc.close();

        switch(grade){
            case "A":System.out.println("4.0 GPA");
            break;
            case "B":System.out.println("3.0 GPA");
            break;
            case "C":System.out.println("2.0 GPA");
            break;
            case "D":System.out.println("1.6 GPA");
            break;
            case "F":System.out.println("NG");
            break;

        }
    }
}
