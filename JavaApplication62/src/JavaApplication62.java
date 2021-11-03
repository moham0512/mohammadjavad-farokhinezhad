
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication62 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        Combin(a);
    }

    public static int [] Sum(int b[] , int a[] , int len){
        
        if(len == 0){
            return b;
        }
        
        b[len-1] = a[len] + a[len-1];
        
        return Sum(b , a, len-1);
    }
    
    public static void Combin(int a[]) {

        if (a.length == 1) {
            System.out.println("[" + a[0] + "]");
        }else{
            int[] b = new int[a.length-1];

            b = Sum(b ,a ,a.length-1);

            Combin(b);
            System.out.println(Arrays.toString(a));
        }
        
    }

}
