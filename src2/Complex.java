public class Complex implements Pair<Complex> {
    private double real; // действительная часть
    private double imaginary; // мнимая часть

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    @Override
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}