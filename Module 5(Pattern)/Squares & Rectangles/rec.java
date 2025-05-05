
import java.util.Scanner;

public class rec {

    public static void main(String[] args) {
        //     for(int i=1;i<=4;i++){
        //         for(int j=1;j<=5;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println( );
        //     }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows&columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
System.out.println();
        }
    }
}
