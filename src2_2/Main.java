import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание прямоугольника
        System.out.print("Введите ID прямоугольника: ");
        String rectangleId = scanner.nextLine();
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();
        System.out.print("Введите высоту прямоугольника: ");
        double height = scanner .nextDouble();
        Rectangle rectangle = new Rectangle(rectangleId, width, height, 0, 0);

        // Создание пятиугольника
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите ID пятиугольника: ");
        String pentagonId = scanner.nextLine();
        System.out.print("Введите сторону пятиугольника: ");
        double side = scanner.nextDouble();
        Pentagon pentagon = new Pentagon(pentagonId, side, 0, 0);

        // Перемещение фигур
        System.out.print("Введите смещение по X: ");
        double deltaX = scanner.nextDouble();
        System.out.print("Введите смещение по Y: ");
        double deltaY = scanner.nextDouble();
        rectangle.move(deltaX, deltaY);
        pentagon.move(deltaX, deltaY);

        // Проверка включения
        boolean isIncluded = rectangle.isInclude(pentagon);
        if (isIncluded) {
            System.out.println("Пятиугольник включен в прямоугольник.");
        } else {
            System.out.println("Пятиугольник не включен в прямоугольник.");
        }

        // Вывод информации о фигурах
        System.out.println(rectangle);
        System.out.println(pentagon);
    }
}