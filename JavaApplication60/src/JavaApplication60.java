
import java.util.Scanner;


public class JavaApplication60 {

    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a integer number:");
        int a = input.nextInt();
        System.out.println("enter a integer number:");
        int b = input.nextInt();
        
        System.out.println(BMM(a , b));
    }
    
    public static int BMM(int a , int b){
        
        if(b == 0){
            return a;
        }
        
        return BMM(b , a % b);
    }
}
