import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();


        for (int i=1;i<=rows;i++) {
            for (int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=rows-1;i>=1;i--) {
            for (int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }


    
}
