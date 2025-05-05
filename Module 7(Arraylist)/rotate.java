
public class rotate {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 2;

        int[] arr2 = new int[n];
/// k=2 mylb last ka 2 print oag issse 
        for (int i = 0; i < k; i++) {
            arr2[i] = arr[n - k + i];}
            for (int ele : arr2) {
                System.out.print(ele + " ");
            }
            System.out.println();
            for(int i=0;i<n-k;i++){
                arr2[k+i]=arr[i];
            }for(int vis:arr2){
                System.out.print(vis+ " ");
            }

        }

    }

