
import java.util.Scanner;
public class alphasquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.print("enter side of square :");
          int n =sc.nextInt();
          for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(  " "+ (char)(i+64) ); // AAAA BBBB CCCC
                System.out.print(  " "+ (char)(j+64) ); //ABCD ABCD
            }
            System.out.println();

    }}
}
    
       
