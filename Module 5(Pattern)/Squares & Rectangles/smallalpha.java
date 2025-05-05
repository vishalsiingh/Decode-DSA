
import java.util.Scanner;
public class smallalpha {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
          System.out.print("enter side of square :");
          int n =sc.nextInt();
          for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // System.out.print(  " "+ (char)(i+96) ); // aaaaa bbbbb
                System.out.print(  " "+ (char)(j+96) ); //abcd abcd abcd 
            }
            System.out.println();

    }}

    
}
