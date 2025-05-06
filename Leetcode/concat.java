public class concat {
    public static void main(String[] args) {
        int[ ] num={0,2,1,5,3,4};
        int n =num.length;
        int[] ans = new int[n*2];
        
        for( int i=0;i<n;i++){
            ans[i]=num[i];
            ans[i+n]=num[i];

        }
        for(int i=0;i<2*n;i++){
        System.out.print(ans[i]);
    }}
    
}

// int n =nums.length;
//         int[] ans=new int[n];
//         int[] answ new int[n];
//         for(int i=0;i<n;i++){
//             ans[i]=nums[i];
//         }for(int i=0;i<n;i++){
//             ans[i+n]=nums[i];
//         }