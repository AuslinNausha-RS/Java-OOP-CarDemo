public class car {
    String brand;
    String color;
    int year;

    car(String carBrand, String carColor, int carYear) {
        brand = carBrand;
        color = carColor;
        year = carYear;
    }

    void showDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Year  : " + year);
    }

    public static void main(String[] args) {
        car car1 = new car("Toyota", "Red", 2020);
        car car2 = new car("Honda", "Blue", 2022);

        car1.showDetails();
        System.out.println();
        car2.showDetails();
    }
}
