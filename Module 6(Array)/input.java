import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of: ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter " + n + " numbers:");


     
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
     

    }
    
}
