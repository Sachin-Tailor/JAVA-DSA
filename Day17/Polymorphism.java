class MathOp {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        MathOp obj = new MathOp();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,4));

        Parent p = new Child();
        p.show();
    }
}