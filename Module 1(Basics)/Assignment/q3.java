//Write a Java program that uses boolean variables and relational operators to compare two numbers.
//Print whether the numbers are equal, not equal, greater, or less.



public class q3 {
    public static void main(String[] args) {
        int num1=10;
        int num2=40;

        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;

        System.out.println(" comparing " + num1 + " and " + num2);
        System.out.println(" are number equal :" + isEqual);
        System.out.println(" are number notequal :" + isNotEqual);
        System.out.println(" are number is greater :" + isGreater);
        System.out.println(" are number is less :" + isLess);


    }
     
    
}
