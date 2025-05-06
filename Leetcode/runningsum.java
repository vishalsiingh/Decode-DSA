public class runningsum {

    public static void main(String[] args) {
        int[ ] num={1,2,3,4};
        int n =num.length;
        int[] runningsum = new int[n];
        runningsum[0]=num[0];
        
        for( int i=1;i<n;i++){
            runningsum [i]= runningsum[i-1] + num[i];
            

        }for(int i=0;i<n;i++){
            System.out.print(runningsum[i] + " ");
        }
         
    }
    
}
