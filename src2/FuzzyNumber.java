public class FuzzyNumber implements Pair<FuzzyNumber> {
    private double x; // центральное значение
    private double e1; // нижняя неопределенность
    private double e2; // верхняя неопределенность

    public FuzzyNumber(double x, double e1, double e2) {
        this.x = x;
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public FuzzyNumber add(FuzzyNumber other) {
        double newX = this.x + other.x;
        double newE1 = this.e1 + other.e1;
        double newE2 = this.e2 + other.e2;
        return new FuzzyNumber(newX - newE1, newX, newX + newE2);
    }

    @Override
    public FuzzyNumber subtract(FuzzyNumber other) {
        double newX = this.x - other.x;
        double newE1 = this.e2 + other.e1;
        double newE2 = this.e2 + other.e2;
        return new FuzzyNumber(newX - newE2, newX, newX + newE1);
    }

    @Override
    public FuzzyNumber multiply(FuzzyNumber other) {
        double newX = this.x * other.x;
        double newE1 = Math.abs(this.x * other.e1) + Math.abs(this.e1 * other.x);
        double newE2 = Math.abs(this.x * other.e2) + Math.abs(this.e2 * other.x) + Math.abs(this.e1 * other.e2);
        return new FuzzyNumber(newX - newE1, newX, newX + newE2);
    }

    @Override
    public FuzzyNumber divide(FuzzyNumber other) {
        double newX = this.x / other.x;
        double newE1 = (this.e1 / (other.x + other.e2));
        double newE2 = (this.e2 / (other.x - other.e1));
        return new FuzzyNumber(newX - newE1, newX, newX + newE2);
    }

    @Override
    public String toString() {
        return String.format("X = (%.2f - %.2f, %.2f, %.2f + %.2f)", x - e1, x, x + e2, e1, e2);
    }
}