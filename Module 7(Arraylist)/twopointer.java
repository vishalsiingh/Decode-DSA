

public class twopointer {
    // while loop kr ke krnaa h 
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n =arr.length;
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        //reverse 
        //part of array kaise reverse kre 
        int i=0,j=n-1; // i=2,j=3 krnge to bss whiib swap hoga 
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
        System.out.println();


    }
    //pass by refreence kiu ki array h isliye 
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    
}
