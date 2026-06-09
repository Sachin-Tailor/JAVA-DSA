class Car {
    String name;
    int price;

    // constructor
    Car(String n, int p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 5000000);
        c1.display();
    }
}