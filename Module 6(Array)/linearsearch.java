import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print( "Enter target value :");
        int x=sc.nextInt();
        System.out.print("Enter array size: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        // solution 
        boolean flag=false; // not fpund 
        for(int i=0;i<=n;i++){
            if (arr[i]==x){
                flag =true;
                // System.out.println("Element found");
                break;
            }
        }
        if (flag==true){
            System.out.println("Element found");
        
        }else
         {System.out.println("not found");

    }
    }
    
}
