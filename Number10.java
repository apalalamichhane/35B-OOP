package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number10 {
    
    public static void main(String[] args) {
        // Implement a Java program that calculates the area of different shapes 
        // (circle, rectangle, square, triangle) based on the user's choice using a switch case.


    final double PI=3.14;
    double area;
    int shape,r,l,b,h;
    boolean continueloop=true;
    Scanner sc= new Scanner(System.in);

    while(continueloop){
    System.out.println();
    System.out.println("**AREA CALCULATOR PROGRAM**");
    System.out.println("Find the area of \n1)Circle\n2)Rectangle\n3)Square\n4)Triangle\n5)Exit");

    shape = sc.nextInt();
    
    switch(shape){
        case 1:System.out.println("To find the area of Circle:\nPress 1 to Proceed");
        int circle=sc.nextInt();
        switch(circle){
            case 1:System.out.println("Enter the radius of circle");
            r=sc.nextInt();
            area=PI*Math.pow(r, 2);
            System.out.printf("The area of the circle is %.2f",area);

            }
            break;
            
        case 2:System.out.println("To find the area of Rectangle:\nPress 1 to Proceed");
        int rectangle=sc.nextInt();
        switch(rectangle){
            case 1:System.out.println("Give me some input Human");
            System.out.println("Enter length");
            double length=sc.nextDouble();
            System.out.println("Enter breadth");
            double breadth=sc.nextDouble();

            area=length*breadth;
            System.out.println("The area of the rectangle is "+area);

        }
        break;

        case 3:System.out.println("To find the area of square:\nPress 1 to Proceed");
        int square=sc.nextInt();

        switch(square){
            case 1:System.out.println("Give me some input Human");
       
            System.out.println("Enter length");
            double length=sc.nextDouble();

            area=length*length;
            System.out.println("The area of the square is "+area);
        }
        break;

        case 4:System.out.println("To find the area of triangle:\nPress 1 to Proceed");
        int triangle=sc.nextInt();

        switch(triangle){
            case 1:System.out.println("Give me some input Human");
            System.out.println("Enter base");
            double base=sc.nextDouble();
            System.out.println("Enter height");
            double height=sc.nextDouble();
            sc.close();

            area=0.5*base*height;
            System.out.println("The area of the Triangle is "+area);
        }
        break;

        
        case 5:
        continueloop=false;
        break;
        
        default:System.out.println("Invalid input");
        break;
    }
}
}
}
