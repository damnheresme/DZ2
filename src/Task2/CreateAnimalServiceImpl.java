package Task2;
import Task2.Predator;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    private Random random = new Random();

    private AbstractAnimal generateAnimal() {
        String[] breeds = {"Labrador", "Tiger", "Persian Cat", "Siberian Cat", "Pig", "Rabbit"};
        String[] names = {"Max", "Bella", "Charlie", "Catty", "Cherry"};
        String[] characters = {"Friendly", "Aggressive", "Calm", "Touchy", "Not touchy"};
        String breed = breeds[random.nextInt(breeds.length)];
        String name = names[random.nextInt(names.length)];
        Double cost = 100.0 + random.nextDouble() * 400;
        String character = characters[random.nextInt(characters.length)];
        return random.nextBoolean() ? new Predator(breed, name, cost, character) :
                new Pet(breed, name, cost, character);
    }

    @Override
    public void createTenAnimals() {
        int count = 0;
        while (count < 10) {
            AbstractAnimal animal = generateAnimal();
            System.out.println("Created: " + animal.getName());
            count++;
        }
    }

    @Override
    public void createNAnimals(int n) {
        for (int i = 0; i < n; i++) {
            AbstractAnimal animal = generateAnimal();
            System.out.println("Created: " + animal.getName());
        }
    }

    // Переопределенный метод с do-while
    public void createAnimalsWithDoWhile(int n) {
        int count = 0;
        do {
            AbstractAnimal animal = generateAnimal();
            System.out.println("Created: " + animal.getName());
            count++;
        } while (count < n);
    }
}
