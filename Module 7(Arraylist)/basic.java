
import java.util.ArrayList;



public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>(6);
        System.out.println(arr); //array me 0 prnt hoga but yye khali reha hai
        arr.add(0,13);// initialsze
        arr.add(1,90);
        arr.add(2,67);
        arr.add(3,45);
        arr.add(4,10);
        arr.add(5,14);
        // System.out.println(arr.size());
        // for(int i=0;i<6;i++) System.out.print(arr.get(i)+ " ");
        System.out.println(arr);
        arr.set(1,70);//update
        System.out.println(arr);
// System.out.println(arr.get(0));
arr.add(789);//push at last
System.out.println(arr);//printarryalist 
arr.get(3);//us index ka value la ke dega 
arr.remove(2);
System.out.println(arr);

    }
    
}
