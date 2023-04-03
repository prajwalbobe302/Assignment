package Inheritance;

class Arithmeticin {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmeticin {
    // Adder inherits the add method from Arithmetic
}

public class Arithmetic {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int result = adder.add(30, 2);
        System.out.println("The sum is: " + result);
    }
}
