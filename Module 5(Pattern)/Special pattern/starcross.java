import java.util.Scanner;

public class starcross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number: ");
        int n = sc.nextInt();
        // int mid=(n+2)/2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j+i==n+1 || i==j) {
                    System.out.print("*" );
                }else{
                    System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
    
}
