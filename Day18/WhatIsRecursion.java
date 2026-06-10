public class WhatIsRecursion {

    static void printHello(int n) {
        if(n == 0) return;

        System.out.println("Hello " + n);
        printHello(n - 1); // recursive call
    }

    public static void main(String[] args) {
        printHello(5);
    }
}