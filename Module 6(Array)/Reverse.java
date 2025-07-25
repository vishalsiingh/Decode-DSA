// QUES . x
// Q10 : Rotate the given array ‘a’ by k steps, where k is
// non-negative.

// Note : k can be greater than n as well where n is the size of array ‘a’.

// a=10,20,30,40,50
// k=2
//   50 10 20 30 40 k =1
//   40 50 10 20 30 k =2
public class Reverse {
    public static void reverse(int[] arr , int i, int j) 
    {
        // i=0;
        // j=n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] =temp;
            i++;
            j--;

        }
        
    }
    public static void  rotate(int[] arr , int k ){
        int n =arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);


    }
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int k =2;
        for(int ele:arr){
            System.out.print(ele + " ");
        }System.out.println();
        rotate(arr,k);
        System.out.println("Rotated Array by " + k + " steps:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }
    



    
}
