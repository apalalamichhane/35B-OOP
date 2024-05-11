package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check: ");

        int number1 = sc.nextInt();
        sc.close();

        if(number1>0){

            System.out.println(number1+" is a positive number");
        }
        else if(number1<0){
            System.out.println(number1+" is a neggative number");

        }
        else{
            System.out.println("zero");
        }
    }
}
