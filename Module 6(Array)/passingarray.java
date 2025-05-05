

public class passingarray {
    public static void main(String[] args) {
    //     int x=10;
    //     System.out.println(x);
    //     change(x);
    //     System.out.println(x);
    // }
    // public static void change(int x){ /// pass by value hua isiliye 10 print hua 
    //     x=19;
    // }
    int[] arr={10,45,67,34};
    System.out.println(arr[2]);
    change(arr);
    System.out.println(arr[2]);
}

    public static void change(int[] arr) { //arr=xke jagah v change hoga yha pass by refrence
        arr[2]=56;
    }}
// now array ka dekhate hai 
