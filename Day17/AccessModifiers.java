class Demo {
    public int a = 10;
    private int b = 20;
    protected int c = 30;

    void show() {
        System.out.println(b); // private accessible inside class
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println(obj.a);
        System.out.println(obj.c);

        obj.show();
    }
}