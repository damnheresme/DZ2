package Task2;

// Main класс
public class MainTask2 {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();

        // Создание 10 животных
        createService.createTenAnimals();

        // Создание N животных с использованием for
        createService.createNAnimals(5);

        // Создание N животных с использованием do-while
        createService.createAnimalsWithDoWhile(3);
    }
}

