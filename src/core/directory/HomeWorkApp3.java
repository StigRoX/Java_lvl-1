package core.directory;

import java.util.Arrays;
import java.util.Random;

/* 1.1. Создать класс HomeWorkApp3, и прописать в нем метод main(). */
public class HomeWorkApp3 {

    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;  */
    public static void m1_SwapZeroOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /* 2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100 */
    public static void m2_ZeroToOneHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2 */
    public static void m3_UnderSixToDouble (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /* 4.Создать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей, если обе сложно). */
    public static void m4_bivariate_array() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
    равна initialValue; */
    public static void m5_receiverTwoInt (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    /* 6. Задать одномерный массив и найти в нем минимальный и максимальный элементы; */
    public static void m6_finderMaxMin( int[] arr6){
        int max = arr6[0];
        int min = arr6[0];

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
        }
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("\nMIN – " + (min) + " | " + "MAX – " + (max));
    }

    /* 7 ** Написать метод, в который передается не пустой одномерный
    целочисленный массив, метод должен вернуть true, если в массиве
    есть место, в котором сумма левой и правой части массива равны. */
    public static boolean m7_nonEmptyUnivariateIntegerArray ( int[] arr){
        int rightSum = 0;
        int leftSum = 0;
        // Cумма всех элементов
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        //Переборка суммы с начала массива и сравнение с правой частью
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // <=== Array for task 1
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // <=== Array for task 3
        int[] arr6 = new int[10]; // <=== Generated array for task 3
        Random random = new Random();
        for (int i = 0; i < arr6.length; i++){
            arr6[i] = random.nextInt(100);
        }
        int[] arr7 = {1, 2, 3, 3, 2, 1}; // <=== Array for task 7
        System.out.println("---------------------\nmethod1:");
        m1_SwapZeroOne(arr1); // Task 1 check
        System.out.println("\n---------------------\nmethod2:");
        m2_ZeroToOneHundred(); // Task 2 check
        System.out.println("\n---------------------\nmethod3:");
        m3_UnderSixToDouble(arr3); // Task 3 check
        System.out.println("\n---------------------\nmethod4:");
        m4_bivariate_array(); // Task 4 check
        System.out.println("---------------------\nmethod5:");
        m5_receiverTwoInt(6, 8); // Task 5 check
        System.out.println("\n---------------------\nmethod6:");
        System.out.println("Generated array – " + Arrays.toString(arr6));
        m6_finderMaxMin(arr6); // Task 6 check
        System.out.println("---------------------\nmethod7:");
        System.out.println(m7_nonEmptyUnivariateIntegerArray(arr7)); // Task 7 check
    }
}
