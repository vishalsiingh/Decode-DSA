

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + "numbers:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum +=arr[i];



        } 
        System.out.println("sum of the elements:-" + sum);
    }
    
}
