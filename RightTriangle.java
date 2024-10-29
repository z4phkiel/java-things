
import java.util.Scanner;
public class RightTriangle {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many rows: ");
        int rows = scan.nextInt();

        for (int i = 1;i<=rows;i++) {
            for (int j = 1;j <= rows - i;j++) {
                System.out.print(" ");
            }
            
            for (int k = 1;k <= i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();


    }
}
