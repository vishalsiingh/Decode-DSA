

public class buildarrayper {
    public static void main(String[] args) {
        int[ ] num={0,2,1,5,3,4};
        int n =num.length;
        int[] ans = new int[n];
        
        for( int i=0;i<n;i++){
            ans[i]=num[num[i]];

        }
        for(int i=0;i<n;i++){
        System.out.print(ans[i]);
    }}
    
}
