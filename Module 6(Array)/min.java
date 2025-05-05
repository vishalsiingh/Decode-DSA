

public class min {
    public static void main(String[] args) {
        int[] arr={23,45,35,78,24,235};
        // int max= - 1;// sb sb value-ve hoga tb dikkat hoga isiliye 
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            // if(arr[i]>max) max=arr[i];
            min=Math.min(min,arr[i]);

        }System.out.println(min);
    
}}
