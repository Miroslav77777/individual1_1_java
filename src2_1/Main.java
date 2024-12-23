import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание треугольника
        System.out.print("Введите ID треугольника: ");
        String triangleId = scanner.nextLine();
        System.out.print("Введите основание треугольника: ");
        double base = scanner.nextDouble();
        System.out.print("Введите высоту треугольника: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleId, base, height, 0, 0);

        // Создание квадрата
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите ID квадрата: ");
        String quadId = scanner.nextLine();
        System.out.print("Введите сторону квадрата: ");
        double side = scanner.nextDouble();
        Quad quad = new Quad(quadId, side, 0, 0);

        // Перемещение фигур
        System.out.print("Введите смещение по X: ");
        double deltaX = scanner.nextDouble();
        System.out.print("Введите смещение по Y: ");
        double deltaY = scanner.nextDouble();
        triangle.move(deltaX, deltaY);
        quad.move(deltaX, deltaY);

        // Сравнение площадей
        int comparisonResult = triangle.compare(quad);
        if (comparisonResult > 0) {
            System.out.println("Треугольник больше квадрата по площади.");
        } else if (comparisonResult < 0) {
            System.out.println("Квадрат больше треугольника по площади.");
        } else {
            System.out.println("Треугольник и квадрат имеют одинаковую площадь.");
        }

        // Вывод информации о фигурах
        System.out.println(triangle);
        System.out.println(quad);
    }
}