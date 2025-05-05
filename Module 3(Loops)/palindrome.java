
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       System.out.print("Enter a String:");
       String str=sc.nextLine();


       boolean isPalindrome=true;
       for ( int i=0; i<str.length()/2; i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            isPalindrome=false;
            break;
            
        }
       
       }
      if(isPalindrome)
        System.out.println("The string is plaindrom:");
      else
        System.out.println("Not Plainmdrome");
        sc.close();
      
    }
    
}