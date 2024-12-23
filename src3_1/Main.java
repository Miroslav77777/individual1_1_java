import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Удалить книгу");
            System.out.println("3. Поиск книги по автору");
            System.out.println("4. Поиск книги по жанру");
            System.out.println("5. Сортировка книг по названию");
            System.out.println("6. Сортировка книг по году");
            System.out.println("7. Показать все книги");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите жанр книги: ");
                    String genre = scanner.nextLine();
                    System.out.print("Введите год издания: ");
                    int year = scanner.nextInt();
                    library.addBook(new Book(title, author, genre, year));
                    break;
                case 2:
                    System.out.print("Введите название книги для удаления: ");
                    String titleToRemove = scanner.nextLine();
                    library.removeBook(titleToRemove);
                    break;
                case 3:
                    System.out.print("Введите автора для поиска: ");
                    String authorToSearch = scanner.nextLine();
                    library.searchByAuthor(authorToSearch).forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Введите жанр для поиска: ");
                    String genreToSearch = scanner.nextLine();
                    library.searchByGenre(genreToSearch).forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Книги, отсортированные по названию:");
                    library.sortByTitle().forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Книги, отсортированные по году:");
                    library.sortByYear ().forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Все книги в библиотеке:");
                    library.displayBooks();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}