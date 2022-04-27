package core.directory;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        cat1.swim(10); // Коты плавать не умеют, выведется соответствующая информация
        Cat cat2 = new Cat("Маркиз");
        cat2.run(300); // Дистанция бега слишком большая
        Cat cat3 = new Cat("Вася");
        cat3.run(150); // Дистанция соответствует возможностям кота
        System.out.println("Всего котов: " + Cat.cat_count);
        System.out.println("");


        Dog dog1 = new Dog("Рекс");
        dog1.swim(25); // Слишком большая дистанция для собаки
        Dog dog2 = new Dog("Полкан");
        dog2.swim(8);
        Dog dog3 = new Dog("Бобик");
        dog3.run(650); // Дистанция бега слишком большая
        Dog dog4 = new Dog("Тузик");
        dog4.run(150); // Дистанция соответствует возможностям кота
        System.out.println("Всего собак: " + Dog.dog_count);
        System.out.println("");

        System.out.println("Всего животных: " + Animal.count);
    }
}
