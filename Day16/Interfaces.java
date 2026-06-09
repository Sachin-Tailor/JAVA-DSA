interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}