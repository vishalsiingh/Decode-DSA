
import java.util.Scanner;
public class cordinate {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter X-Cordinate:");
        double x=sc.nextDouble();
        System.out.print("Enter Y-Cordinate:");
        double y =sc.nextDouble();
        if( x == 0  && y == 0){
            System.out.println("origin");   
}else if(x==0){
    System.out.println("y axis");
}else if(y==0){
    System.out.println("x axis");
}else if(x>0 &&y>0){
    System.out.println("1st quad");
}else if(x<0 && y>0){
    System.out.println("2nd quadrant");
}else if(x<0 && y<0){
    System.out.println("3rd quad");
}else{
    System.out.println("4the quadrant");
} 
} 
}
