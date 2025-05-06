import java.util.Scanner;
public class substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        int n =s.length();
        System.out.println(n);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++)
        System.out.print(s.substring(i,j)+ " ");
    }
    }
    
}
