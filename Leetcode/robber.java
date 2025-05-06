

public class robber {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        int n =nums.length;
        int sum=0;
        for( int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+nums[i];
                
            }
        }System.out.print(sum+ " ");

    }
    
}
