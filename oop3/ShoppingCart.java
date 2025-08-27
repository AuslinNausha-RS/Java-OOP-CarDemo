import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example product prices
        int[] prices = {250, 100, 50, 75}; 

        try {
            System.out.println("Enter product index (0-3): ");
            int index = sc.nextInt();   // possible ArrayIndexOutOfBoundsException

            System.out.println("Enter number of people sharing the bill: ");
            int people = sc.nextInt();  // possible ArithmeticException (if zero)

            // Accessing array element
            int selectedPrice = prices[index];
            System.out.println("Selected Product Price: " + selectedPrice);

            // Division
            int perHeadCost = selectedPrice / people;
            System.out.println("Each person should pay: " + perHeadCost);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product index! Please choose between 0 and 3.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Number of people cannot be zero (division by zero not allowed).");
        } 
        finally {
            System.out.println("Billing process completed. Thank you for shopping!");
            sc.close();
        }
    }
}
