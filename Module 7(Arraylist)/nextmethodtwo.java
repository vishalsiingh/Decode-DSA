
import javax.sound.sampled.SourceDataLine;

public class nextmethodtwo {
    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[arr.length];
        ans[n - 1] = -1;

        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);

        }
        for(int ele:ans){
        System.out.print( ele + " ");}
    } 
    
}
