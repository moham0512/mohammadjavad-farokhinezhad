
import java.util.Scanner;

public class JavaApplication70 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer:");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "    ");
        }
        System.out.println();
        
        while (a.length != 1) {

            int[] b = new int[a.length - 2];
            for (int j = 0; j < b.length; j++) {

                if (b.length > 1) {
                    if (j == 0) {
                        b[j] = a[j] + a[j + 1];
                    } else if (j == b.length - 1) {
                        b[j] = a[j + 1] + a[j + 2];
                    } else {
                        b[j] = a[j + 1];
                    }
                } else {
                    b[j] = a[j] + a[j + 1] + a[j + 2];
                }
            }

            a = b;

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + "    ");
            }

            System.out.println();
        }
    }

}
