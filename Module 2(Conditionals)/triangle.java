
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First side of the triangle");
        int a=sc.nextInt();
        System.out.println("second side of the triangle");
        int b=sc.nextInt();
        System.out.println("third side of the triangle");
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid traingle ");
            
        }else{
            System.out.println("Inavlid Traingle");
        }
    }
    
}
