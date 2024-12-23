import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Работа с нечеткими числами
        System.out.println("Введите нечеткое число A (x, e1, e2): ");
        double xA = scanner.nextDouble();
        double e1A = scanner.nextDouble();
        double e2A = scanner.nextDouble();
        FuzzyNumber fuzzyA = new FuzzyNumber(xA, e1A, e2A);

        System.out.println("Введите нечеткое число B (x, e1, e2): ");
        double xB = scanner.nextDouble();
        double e1B = scanner.nextDouble();
        double e2B = scanner.nextDouble();
        FuzzyNumber fuzzyB = new FuzzyNumber(xB, e1B, e2B);

        System.out.println("A + B = " + fuzzyA.add(fuzzyB));
        System.out.println("A - B = " + fuzzyA.subtract(fuzzyB));
        System.out.println("A * B = " + fuzzyA.multiply(fuzzyB));
        System.out.println("A / B = " + fuzzyA.divide(fuzzyB));

        // Работа с комплексными числами
        System.out.println("Введите комплексное число C (real, imaginary): ");
        double realC = scanner.nextDouble();
        double imaginaryC = scanner.nextDouble();
        Complex complexC = new Complex(realC, imaginaryC);

        System.out.println("Введите комплексное число D (real, imaginary): ");
        double realD = scanner.nextDouble();
        double imaginaryD = scanner.nextDouble();
        Complex complexD = new Complex(realD, imaginaryD);

        System.out.println("C + D = " + complexC.add(complexD));
        System.out.println("C - D = " + complexC.subtract(complexD));
        System.out.println("C * D = " + complexC.multiply(complexD));
        System.out.println("C / D = " + complexC.divide(complexD));
    }
}