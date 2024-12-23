import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру (1 - Прямоугольник, 2 - Круг, 3 - Трапеция): ");
        int choice = scanner.nextInt();
        Figure figure = null;

        switch (choice) {
            case 1:
                System.out.print("Введите ширину прямоугольника: ");
                double width = scanner.nextDouble();
                System.out.print("Введите высоту прямоугольника: ");
                double height = scanner.nextDouble();
                figure = new Rectangle(width, height);
                break;
            case 2:
                System.out.print("Введите радиус круга: ");
                double radius = scanner.nextDouble();
                figure = new Circle(radius);
                break;
            case 3:
                System.out.print("Введите основание 1 трапеции: ");
                double base1 = scanner.nextDouble();
                System.out.print("Введите основание 2 трапеции: ");
                double base2 = scanner.nextDouble();
                System.out.print("Введите высоту трапеции: ");
                height = scanner.nextDouble();
                figure = new Trapezium(base1, base2, height);
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.printf("Периметр: %.2f\n", figure.calculatePerimeter());
        System.out.printf("Площадь: %.2f\n", figure.calculateArea());
    }
}