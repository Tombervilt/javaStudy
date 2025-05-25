package tombervilt.a;

public class MathOperations {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        double c = 2.5;
        double d = 1.33;
        System.out.println("Арифметические операции над двумя типами int:\n");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        System.out.println("\nАрифметические операции над int и double:\n");
        System.out.println("a + c = " + (a + c));
        System.out.println("a - d = " + (a - d));
        System.out.println("b * c = " + (b * c));
        System.out.println("b / c = " + (b / c));

        System.out.println("\nПрименение логических операций сравнения:\n");
        System.out.println("a > b - " + (a > b));
        System.out.println("c < d - " + (c < d));
        System.out.println("b >= d - " + (b >= d));
        System.out.println("d <= a - " + (d <= a));

        System.out.println("\nПереполнение при арефметических операциях:\n");
        float LimitFloat = Float.MAX_VALUE;;
        double LimitDouble = Double.MAX_VALUE;
        System.out.println("LimitFloat * 2 = " + (LimitFloat * 2));
        System.out.println("LimitDouble * 2 = " + (LimitDouble * 2));
    }
}
