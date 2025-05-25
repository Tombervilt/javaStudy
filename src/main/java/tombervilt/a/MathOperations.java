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

        System.out.println("\nАрифметические операции над int и double в одном выражении:\n");
        System.out.println("(a + c) - d * c / c = " + ((a + c) - d * c / c));

        System.out.println("\nПрименение логических операций сравнения:\n");
        System.out.println("a > b - " + (a > b));
        System.out.println("c < d - " + (c < d));
        System.out.println("b >= d - " + (b >= d));
        System.out.println("d <= a - " + (d <= a));

        System.out.println("\nПереполнение при арефметических операциях:\n");
        float LimitFloat = Float.MAX_VALUE;;
        double LimitDouble = Double.MAX_VALUE;
        int limitInt = Integer.MAX_VALUE;
        System.out.println("LimitFloat * 2 = " + (LimitFloat * 2));
        System.out.println("LimitDouble * 2 = " + (LimitDouble * 2));
        System.out.println("limitInt * 2 = " + (limitInt * 2));
        //Переполнение int невозможно, вместо этого происходит 'заворачивание' - переход от макс. значения 2,147,483,647 к мин. значения -2,147,483,648
    }
}
