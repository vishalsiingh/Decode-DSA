
import java.util.Scanner;
public class io {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the n :");
        int n=sc.nextInt();
        //array declaration 
         int[] arr =new int[n];
        //input 
        for( int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        } //output
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+ " ");

        }     
    }
    
}
