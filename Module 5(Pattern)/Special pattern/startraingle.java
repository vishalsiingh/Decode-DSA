
import java.util.Scanner;

public class startraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side of square :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    System.out.print(i);
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }

    }
}
