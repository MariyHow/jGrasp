public class RecursionStars {
    
    public static void main(String[] args) {
        printStars(5);
    }
    
    public static void printStars(int n) {
        if(n == 1) {
            System.out.println("*");
            return;
        }
        
        printStars(n - 1);
        
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
