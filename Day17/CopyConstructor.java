class Laptop {
    String brand;
    int price;

    Laptop(String b, int p) {
        brand = b;
        price = p;
    }

    // copy constructor
    Laptop(Laptop obj) {
        brand = obj.brand;
        price = obj.price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", 60000);
        Laptop l2 = new Laptop(l1);

        l2.display();
    }
}