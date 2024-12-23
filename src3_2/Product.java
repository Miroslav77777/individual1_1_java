public class Product {
    private String name;
    private String country;
    private String grade; // сорт
    private double price;
    private double weight;

    public Product(String name, String country, String grade, double price, double weight) {
        this.name = name;
        this.country = country;
        this.grade = grade;
        this.price = price;
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public String getGrade() {
        return grade;
    }

    public double getPrice() {
        return price;
    }
}