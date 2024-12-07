//Класс Product описывает товар с количеством, ценой и скидкой.
// Содержит поля для подсчета общей суммы покупки с учетом скидки.
class Product {  // Класс, представляющий товаp
    private int quantity; // Количество товаров
    private double price;  // Цена товара
    private double discount;  // Скидка на товар в процентах

    public Product(int quantity, double price, double discount) {   // Конструктор для инициализации полей
        if (quantity <= 0 || price <= 0) {
            throw new IllegalArgumentException("Количество и цена должны быть больше нуля"); // Проверка на валидность значений
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Скидка должна быть в пределах от 0 до 100"); // Проверка на валидность значений
        }
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public void calculateTotal() { // Метод для подсчета и вывода сумм
        double totalWithoutDiscount = quantity * price; // Общая сумма без скидки
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100); // Общая сумма со скидкой

        // Вывод результатов с округлением до 2 знаков
        System.out.printf("Общая сумма без скидки: %.2f%n", totalWithoutDiscount);
        System.out.printf("Общая сумма со скидкой: %.2f%n", totalWithDiscount);
    }
}

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
