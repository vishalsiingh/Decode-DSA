import java.util.Scanner;

public class maxm1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        
        int n =sc.nextInt();
        // int[] arr={23,45,35,78,24,235};

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i =0;i <n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        int max=arr[0];
        // int max=Integer.MIN_VALUE;   method 2 for finding max 
        
        for(int i=1;i<n;i++){
            if(arr[i]>max) max=arr[i];

        }System.out.print( "Largest elelennt : " + max);
    }
    
}
