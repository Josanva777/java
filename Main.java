
class calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println("suma de 5 + 3 : " + calc.sumar(5, 3));
        System.out.println("suma de 5 + 3 + 2: " + calc.sumar(5, 3, 2));
        System.out.println("suma de 5.5  + 3.3 : " + calc.sumar(5.5, 3.3));
    }
    
}
