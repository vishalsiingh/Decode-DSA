import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a positive integer: ");
        int n =sc.nextInt();
        if(n%5==0)
        System.out.println("NUmbe is divisible  by 5 ");
        else 
        System.out.println("Not divisible by 5 ,Enter another number ");

    }
    

}
