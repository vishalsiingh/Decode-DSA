
import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First numbeer");
        int a=sc.nextInt();
        System.out.println("second ");
        int b=sc.nextInt();
        System.out.println("thirde ");
        int c=sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.println("a is smallest" +a);
            }else{
                System.out.println("c is smallest"+c);
            } 

            }else{
                if(b<c){
                    System.out.println("b is smaleest"+b);
                }else{
                    System.out.println("c is smallest"+c);
                }
            }
        }

        
    }

