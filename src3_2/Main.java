import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Используем ArrayList для хранения товаров
        List<Product> products = new ArrayList<>();

        // Добавление товаров с разными сортами
        products.add(new Product("Товар1", "Россия", "высший", 100.0, 1.0));
        products.add(new Product("Товар2", "Китай", "высший", 120.0, 1.5));
        products.add(new Product("Товар3", "США", "высший", 90.0, 2.0));
        products.add(new Product("Товар4", "Россия", "средний", 80.0, 1.2));
        products.add(new Product("Товар5", "Китай", "высший", 110.0, 1.3));
        products.add(new Product("Товар6", "Германия", "высший", 95.0, 1.1));
        products.add(new Product("Товар7", "США", "высший", 150.0, 2.5));
        products.add(new Product("Товар8", "Италия", "средний", 85.0, 1.0));
        products.add(new Product("Товар9", "Франция", "низший", 70.0, 1.5));
        products.add(new Product("Товар10", "Италия", "высший", 130.0, 1.8));
        products.add(new Product("Товар11", "Канада", "средний", 75.0, 1.2));
        products.add(new Product("Товар12", "Япония", "низший", 60.0, 1.0));
        products.add(new Product("Товар13", "Австралия", "высший", 140.0, 2.0));
        products.add(new Product("Товар14", "Бразилия", "средний", 95.0, 1.3));
        products.add(new Product("Товар15", "Индия", "низший", 50.0, 1.1));

        // Вычисление средней цены
        double averagePrice = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);

        // Фильтрация стран-производителей
        Set<String> countries = products.stream()
                .filter(product -> "высший".equals(product.getGrade()))
                .filter(product -> Math.abs(product.getPrice() - averagePrice) <= averagePrice * 0.15)
                .map(Product::getCountry)
                .collect(Collectors.toSet());

        // Сортировка стран в алфавитном порядке
        List<String> sortedCountries = new ArrayList<>(countries);
        Collections.sort(sortedCountries);

        // Вывод результата
        System.out.println("Страны-производители товаров с высшим сортом и ценой в пределах 15% от средней:");
        for (String country : sortedCountries) {
            System.out.println(country);
        }
    }
}