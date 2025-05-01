//HW : Given the length and breadth of a rectangle,
//write a program to find whether the area of the
//rectangle is greater than its perimeter.

import java.util.Scanner;
public class area {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("length of the reactangle:");
    int l=sc.nextInt();
    System.out.println("bradth of the reactangle:");
    int b=sc.nextInt();
    int a=l*b;
    System.out.println(" Area of the rectangle is : " + a);
     int p=2*(l+b);
    System.out.println("perimeter if the reachtnge is : " + p);
    if(a>p){
        System.out.println("area is greater than perimertr");

    }else{
        System.out.println("perimetter is greater");
    }


    
    
    
  }  
}
