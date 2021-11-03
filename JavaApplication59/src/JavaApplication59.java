
import java.util.Scanner;


public class JavaApplication59 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a double number:");
        double x = input.nextDouble();
        System.out.println("enter a integer number:");
        int n = input.nextInt();
        
        System.out.println(Pow(x , n));
        
    }
    
    public static double Pow(double x , int n){
        
        if(n == 1){
            return x;
        }
        
        return x * Pow(x , n-1);
    }
    
}
