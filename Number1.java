package TasksToDo.TaskWeek3;

public class Number1 {
    
    public static void main(String[] args) {
        
        /* Write a JAVA program to find the maximum between three numbers.*/

        int a = 20,b=43,c=86;

        if(a>b&&b>c){
            System.out.println("Greatest number is "+a);
        }
        else if(b>c&&c>a){
            System.out.println("Greatest number is "+b);
        }
        else{
            System.out.println("Greatest number is "+c);
        }


    }
}
