
import java.util.Scanner;
public class pyramid {
 
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a value: ");
        int value = scan.nextInt();

        for (int i=1;i<=value;i++) {
            for (int j=1;j<=value-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}

