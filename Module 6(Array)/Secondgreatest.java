
public class Secondgreatest {

    public static void main(String[] args) {
        int[] arr = {23, 45, 35, 78, 24, 235};
        // int max= - 1;// sb sb value-ve hoga tb dikkat hoga isiliye 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int Secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Secondmax && arr[i] != max) {
                Secondmax = arr[i];
                
                // if (arr[i] != max) 
                        //     Secondmax = Math.max(Secondmax, arr[i]);
        
        
            
        
            }}
        System.out.println(Secondmax);

    }

}
