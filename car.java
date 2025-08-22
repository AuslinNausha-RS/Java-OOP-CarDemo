import java.util.Scanner;

public class car {
    
    String brand;
    String color;
    int year;

    // Constructor
    car(String carBrand, String carColor, int carYear) {
        brand = carBrand;
        color = carColor;
        year = carYear;
    }

    // Method to show details
    void showDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Year  : " + year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for first car
        System.out.println("Enter details for Car 1:");
        System.out.print("Brand: ");
        String brand1 = sc.nextLine();
        System.out.print("Color: ");
        String color1 = sc.nextLine();
        System.out.print("Year: ");
        int year1 = sc.nextInt();
        sc.nextLine(); // consume newline

        car car1 = new car(brand1, color1, year1);

        // Taking input for second car
        System.out.println("\nEnter details for Car 2:");
        System.out.print("Brand: ");
        String brand2 = sc.nextLine();
        System.out.print("Color: ");
        String color2 = sc.nextLine();
        System.out.print("Year: ");
        int year2 = sc.nextInt();

        car car2 = new car(brand2, color2, year2);

        // Display details
        System.out.println("\n--- Car 1 Details ---");
        car1.showDetails();
        System.out.println("\n--- Car 2 Details ---");
        car2.showDetails();

        sc.close();
    }
}
