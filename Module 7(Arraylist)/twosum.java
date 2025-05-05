//Find the doublet in the Array whose sum is equal to the
// given value x. (Two Sum)

public class twosum {

    public static void main(String[] args) {

        int[] arr = {12, 3, 6, 5};
        int x = 11;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" " +arr[j]);
                }

            }
        

    }
    }
}
