

public class sumdigits {
    public static void main(String[] args) {
        int n=12;
        int sum = 0;
        while (n != 0) {// Extract the last digit
            int last = n % 10;
            sum += last;// Add last digit to sum
            n /= 10;// Remove the last digit
        }
       
    
   
        System.out.println(sum);
        
    }}

    

