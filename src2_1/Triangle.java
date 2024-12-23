public class Triangle implements Shape {
    private String id;
    private double base;
    private double height;
    private double x, y; // координаты центра

    public Triangle(String id, double base, double height, double x, double y) {
        this.id = id;
        this.base = base;
        this.height = height;
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
        return 0.5 * base * height;
    }

    @Override
    public int compare(Shape other) {
        if (other instanceof Triangle) {
            return Double.compare(this.area(), other.area());
        } else if (other instanceof Quad) {
            return Double.compare(this.area(), other.area());
        }
        return 0; // Если тип не совпадает, можно вернуть 0 или выбросить исключение
    }

    @Override
    public String toString() {
        return String.format("Triangle{id='%s', base=%.2f, height=%.2f, area=%.2f}", id, base, height, area());
    }
}