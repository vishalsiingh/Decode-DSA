

public class maxm1 {
    public static void main(String[] args) {
        int[] arr={23,45,35,78,24,235};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];

        }System.out.println(max);
    }
    
}
