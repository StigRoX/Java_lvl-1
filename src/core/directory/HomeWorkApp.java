package core.directory;

    /* 1.1. Создать класс HomeWorkApp, и прописать в нем метод main(). */
public class HomeWorkApp {

    /*  2. Создайте метод printThreeWords(), который при вызове должен
         отпечататьв столбец три слова: Orange, Banana, Apple. */
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    /* 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные
    a и b, и инициализируйте их любыми значениями, которыми захотите.
    Далее метод должен просуммировать эти переменные, и если их сумма больше
    или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная” */
    static void checkSumSign() {
        int a = 4, b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /* 4. Создайте метод printColor() в теле которого задайте int переменную
    value и инициализируйте ее любым значением. Если value меньше 0
    (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
    то “Желтый”, если больше 100 (100 исключительно) - “Зеленый” */
    static void printColor() {
        int value = -15;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    /* 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные
    a и b, и инициализируйте их любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b” */
    static void compareNumbers() {
        int a = 42, b = 12;
        if(a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    /* 1.2. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли
    они работают. Если выполнение задач вызывает трудности, можете обратиться к
    последней главе методического пособия “Подсказки по домашнему заданию”. */
    public static void main(String[] args) {
        System.out.println("printThreeWords:");
        printThreeWords();
        System.out.println("---------------------");
        System.out.println("checkSumSign:");
        checkSumSign();
        System.out.println("---------------------");
        System.out.println("printColor:");
        printColor();
        System.out.println("---------------------");
        System.out.println("compareNumbers:");
        compareNumbers();
    }
}
