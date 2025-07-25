// import java.util.Scanner;
import java.util.Arrays;
public class rotatearray {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.print("enter n :");
        // int n =sc.nextInt();
        // int[] arr = new int[n];
        // System.out.print("Enter" + n +"elemnts");
        // for(int  i=0;i<=n;i++){
        //     arr[i]= sc.nextInt();

        // }
        // System.out.print("array formed is : ");
        // for(int i =0;i<=n;i++){
        //     System.out.print(arr[i] + " ");
        // }
        int[] arr ={10 ,20,30,40,50};
        int n=arr.length;

        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // reverse
        for(int i =0;i<n/2;i++){
            int j = n-1-i;
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]= temp;

        }
         for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        }
    
}
