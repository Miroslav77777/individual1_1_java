public class Quad implements Shape {
    private String id;
    private double side;
    private double x, y; // координаты центра

    public Quad(String id, double side, double x, double y) {
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
        return side * side;
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
        return String.format("Quad{id='%s', side=%.2f, area=%.2f}", id, side, area());
    }
}