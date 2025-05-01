
import java.util.Scanner;
public class logical {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();
        if(n>9999 && n<10000){
            System.out.println("Number is  of 5 digits");
        }else{
            System.out.println("number is not of 5 digits");
        }
        
    }

    
}
