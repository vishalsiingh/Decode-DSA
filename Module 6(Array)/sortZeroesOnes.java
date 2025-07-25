public class sortZeroesOnes {
    public static void main(String[] args) {
        int[] arr ={1,0,0,1,1,0,0,0,1,1,0,0,0};
        int n=arr.length;
        int noofZeroes=0;
        // int noofOnes=0;
        for(int i=0 ; i<n;i++){
            if(arr[i] ==0) noofZeroes++;
            // else noofOnes++;

        }
        for (int i=0;i<noofZeroes;i++){
            arr[i]=0;
        }
        for (int i=noofZeroes;i<n;i++){
            arr[i]=1;
    }
    System.out.print("Sorted array: ");
    for( int ele: arr){
        System.out.print(ele);
    }
}
}
