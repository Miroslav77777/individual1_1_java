public class Pentagon implements Shape {
    private String id;
    private double side;
    private double x, y; // координаты центра

    public Pentagon(String id, double side, double x, double y) {
        this.id = id;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void move(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    @Override
    public double area() {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }

    @Override
    public boolean isInclude(Shape other) {
        // Для простоты, предположим, что мы не реализуем логику включения для пятиугольника
        return false;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return side; // Для простоты, возвращаем сторону как ширину
    }

    public double getHeight() {
        return side; // Для простоты, возвращаем сторону как высоту
    }

    @Override
    public String toString() {
        return String.format("Pentagon{id='%s', side=%.2f, area=%.2f}", id, side, area());
    }
}