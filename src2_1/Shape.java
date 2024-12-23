public interface Shape {
    String getId();
    void move(double deltaX, double deltaY);
    double area();
    int compare(Shape other);
}