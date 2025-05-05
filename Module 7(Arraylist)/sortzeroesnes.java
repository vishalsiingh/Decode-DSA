
public class sortzeroesnes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1, 0, 1};
        int n = arr.length;
        int noofzeroes = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                noofzeroes++;
            }}
            // for (int i = 0; i < noofzeroes; i++) {
            //     arr[i] = 0;
            // }
            // for (int i = 0; i < noofzeroes; i++) {
            //     arr[i] = 1;
            // }
            for (int i = 0; i < n; i++) {
                if (i < noofzeroes) {
                    arr[i] = 0; 
                }else {
                    arr[i] = 1;
                }}
                for(int i: arr){
                    System.out.print(i+ " ");
                }

            }

        }
    

