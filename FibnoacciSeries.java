  import java.util.Scanner;

public class FibnoacciSeries {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Input number of terms
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        
        // Print Fibonacci Series
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int c = a + b;
            a = b;
            b = c;
        }
        
        sc.close();
    }
}


