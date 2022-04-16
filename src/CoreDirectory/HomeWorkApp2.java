package core.directory;

public class HomeWorkApp2 {
    /*  1. Написать метод, принимающий на вход два целых числа и проверяющий, что
    их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false */

    public static boolean m1_within10and20(int a, int b, int c) {
        int sum = a + b + c;
        return (sum >= 10 && sum <= 20);
    }

    /*  2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом */

    public static void m2_isPositiveOrNegative(int value) {
        if ( value < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    /*  3. Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. */
    static void m3_isNegative(int value) {
        if (value > 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    /*  4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз */
    static void m4_printWordNTimes(String s, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

        /* 5. Написать метод, который определяет, является ли год високосным, и возвращает
        boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        кроме каждого 100-го, при этом каждый 400-й – високосный */

    public static boolean m5_isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
            return true;
    }

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("method1:");
        System.out.println(m1_within10and20(5, 6, 9));
        System.out.println("---------------------");
        System.out.println("method2:");
        m2_isPositiveOrNegative(0);
        System.out.println("---------------------");
        System.out.println("method3:");
        m3_isNegative(-1);
        System.out.println("---------------------");
        System.out.println("method4:");
        m4_printWordNTimes("repeat_text", 6);
        System.out.println("---------------------");
        System.out.println("method5:");
        System.out.println(m5_isLeapYear(2100));
        System.out.println("---------------------");
    }
}