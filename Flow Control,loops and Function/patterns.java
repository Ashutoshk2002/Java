import java.util.*;

public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("====================================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + 1);
            }
            System.out.println(" ");
        }
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        // int i = 1;
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}