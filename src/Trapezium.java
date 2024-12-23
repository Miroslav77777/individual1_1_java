public class Trapezium implements Figure {
    private double base1;
    private double base2;
    private double height;

    public Trapezium(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        // Для простоты, предположим, что стороны равны
        double side = Math.sqrt(height * height + Math.pow((base2 - base1) / 2, 2));
        return base1 + base2 + 2 * side;
    }

    @Override
    public double calculateArea() {
        return ((base1 + base2) / 2) * height;
    }
}