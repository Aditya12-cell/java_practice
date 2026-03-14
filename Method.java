import java.util.Scanner;

public class Method{

    boolean hello(int a){
      if(a%2 == 0){
        return true;
      } else{
        return false;
      }
    }   
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Method m = new Method();
        boolean result = m.hello(num);
        System.out.println("Result: " + result);

        sc.close();
    }
   
}