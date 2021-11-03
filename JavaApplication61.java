
import java.util.Scanner;


public class JavaApplication61 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int m = input.nextInt();
        int n = input.nextInt();
        
        System.out.println(A(m , n));
    }
    
    public static int A(int m ,int n){
        
        if(m == 0 && n >= 0){
            return n + 1;
        }
        
        if(m > 0 && n == 0){
            return A(m-1 , 1);
        }
        
        if(m > 0 && n >= 0){
            return A(m-1 ,A(m, n-1));
        }
        
        return 1;
    }
    
}
