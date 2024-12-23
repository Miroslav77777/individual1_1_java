public class Rectangle implements Shape {
    private String id;
    private double width;
    private double height;
    private double x, y; // координаты центра

    public Rectangle(String id, double width, double height, double x, double y) {
        this.id = id;
        this.width = width;
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
        return width * height;
    }

    @Override
    public boolean isInclude(Shape other) {
        if (other instanceof Rectangle) {
            Rectangle rect = (Rectangle) other;
            return (this.x <= rect.x && this.x + this.width >= rect.x + rect.width &&
                    this.y <= rect.y && this.y + this.height >= rect.y + rect.height);
        } else if (other instanceof Pentagon) {
            // Для простоты, предположим, что пятиугольник можно включить в прямоугольник
            Pentagon pentagon = (Pentagon) other;
            return (this.x <= pentagon.getX() && this.x + this.width >= pentagon.getX() + pentagon.getWidth() &&
                    this.y <= pentagon.getY() && this.y + this.height >= pentagon.getY() + pentagon.getHeight());
        }
        return false;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle{id='%s', width=%.2f, height=%.2f, area=%.2f}", id, width, height, area());
    }
}