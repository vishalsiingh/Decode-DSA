
import java.util.Scanner;

public class inputstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String str=sc.nextLine();
        // str.length();
        System.out.println(" My name is " +str);
        // str.charAt(3);
        System.out.println(str.charAt(2));
        int n=str.length();
        System.out.println(n);

        


    }
}