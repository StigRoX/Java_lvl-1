package core.directory;

public class MainApp <plate> {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Axel", 15),
                new Cat("Boris", 25),
                new Cat("Clover", 22),
                new Cat("Daisy", 12),
                new Cat("Elsa", 14)
        };
        Plate plate = new Plate(80);
        for (Cat cat :cats) {
            cat.eat(plate);
            if(cat.getSatiety()) {
                System.out.println(cat.getName() + " сейчас сыт");
            } else {
                System.out.println(cat.getName() + " всё ещё хочет есть");
            }
        }
        System.out.println("\nОсталось еды в тарелке: " + plate.getFoodCount());
        plate.addFood(20);
        System.out.println("Добавили 20 еды в тарелку, теперь её " + plate.getFoodCount());
    }
}
