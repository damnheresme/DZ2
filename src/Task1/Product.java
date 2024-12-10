package Task1;
// Класс Task1.Product описывает товар с количеством, ценой и скидкой.
public class Product {  // Класс, представляющий товаp
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
