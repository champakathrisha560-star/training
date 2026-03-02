package OOPS.Basics.ClassWithAttributes;

public class car {
    String brand;
    int model;

    car(String brand, int model) {
        this.brand = brand;
        this.model = model;
    }

    void printDetails() {
        System.out.println("Car Brand is " + brand);
        System.out.println("Model number is " + model);
    }
}

    class Driver
    {
        public static void main(String[] args) {
            car c1 = new car("LAMBORGINI", 300);
            car c2 = new car("F1", 456);
        c1.printDetails();
                c2.printDetails();
            }
        }
