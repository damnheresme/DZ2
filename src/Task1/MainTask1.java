package Task1;

// Класс Task1.Product описывает товар с количеством, ценой и скидкой.
// Содержит поля для подсчета общей суммы покупки с учетом скидки.
public class MainTask1 {  // Класс с методом main
    public static void main(String[] args) {
        // Создаем 3 объекта товара с различными параметрами
        Product product1 = new Product(10, 100.0, 0.75);
        Product product2 = new Product(5, 200.0, 42.575);
        Product product3 = new Product(3, 500.0, 59.1);

        System.out.println("Результаты для первого товара:"); // Вызываем метод calculateTotal для каждого объекта
        product1.calculateTotal();

        System.out.println("\nРезультаты для второго товара:");
        product2.calculateTotal();

        System.out.println("\nРезультаты для третьего товара:");
        product3.calculateTotal();
    }
}
