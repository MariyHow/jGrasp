import java.util.Scanner;
import java.io.;

public class RecursionFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Error: input must be non-negative.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.printf("%d! = %d", n, factorial);
        }
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
