package TasksToDo.TaskWeek3;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        
        // vowel or consonant.

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter an alphabet");
    String a=sc.nextLine();
    sc.close();
    a=a.toLowerCase();

    
    boolean isVowel=false;
 
 String vowels[]={"a","e","i","o","u"};
 //for-each loop to iterate each element of the array of vowels
 for (String vowel : vowels){
     if (vowel.equals(a)){
         isVowel=true;
         break;
        }
        
    }
    if(isVowel){
        System.out.println(a+" is a vowel");
    }
    else{
        System.out.println(a+" is not a vowel");
    }    



//using basic if-else statements
if(a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u")){
    System.out.println(a+" is a vowel");
}
else{
    System.out.println(a+" is a consonant");
}

    }
}
