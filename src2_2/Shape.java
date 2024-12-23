public interface Shape {
    String getId();
    void move(double deltaX, double deltaY);
    double area();
    boolean isInclude(Shape other);
}