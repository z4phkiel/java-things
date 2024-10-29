import java.util.Scanner;

class Guitar {

    private String brand;
    private String model;
    private int year;
    private String type;
    private double price;
    
public Guitar(String brand, String model, int year, String type, double price) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.type = type;
    this.price = price;   
}

public void displayAttributes() {
    System.out.println("Guitar Details");
    System.out.println("Guitar brand: " + brand);
    System.out.println("Guitar model: " + model);
    System.out.println("Guitar type: " + type);
    System.out.println("Manufacture year: " + year);
    System.out.println("Estimated price: " + price +"$");
}
}

public class DCIT50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Guitar brand");
        String brand = scanner.nextLine();
        System.out.println("Enter Guitar model");
        String model = scanner.nextLine();
        System.out.println("Type of Guitar(Acoustic/Electric");
        String type = scanner.nextLine();
        System.out.println("Year of manufacture");
        int year = scanner.nextInt();
        System.out.println("Enter estimated price($)");
        double price = scanner.nextDouble();
        
        Guitar guitarDetails = new Guitar(brand, model, year, type, price);
        guitarDetails.displayAttributes();
        scanner.close();
        
        System.out.println("Have a nice day :)");
       
     
        
    }
    
}
