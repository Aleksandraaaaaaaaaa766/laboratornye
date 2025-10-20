package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class InputChecker {

    public static int readInt(Scanner scanner, String message) {
        int number = 0;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) { // если следующий входящий токен - целое число
                number = scanner.nextInt();
                return number;
            } else {
                System.out.println("Введено не целое число.");
//                System.out.println(message);
                scanner.nextLine(); // очищаем неправильный ввод
            }
        }
    }

    public static int readPositiveInteger(Scanner sc, String msg) {
        int number = 0;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextInt()) { // если следующий входящий токен - целое число
                number = sc.nextInt();
                if (number > 0) {
                    return number;
                }
                else {
                    System.out.println("Введено не положительное число.");
                    sc.nextLine(); // очищаем неправильный ввод
                }
            } else {
                System.out.println("Введено не целое число.");
//                System.out.println(message);
                sc.nextLine(); // очищаем неправильный ввод
            }
        }
    }

    public static double readDouble(Scanner scanner, String message) {
        double number = 0;
        System.out.println(message);
        while (true) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                return number;
            } else {
                System.out.println("Введено не дробное число.");
//                System.out.println(message);
                scanner.nextLine(); // очищаем неправильный ввод
            }
        }
    }

    public static int[] readArrIntNum(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = readPositiveInteger(scanner, ""); // Считываем размер массива

        // Создаем массив нужного размера
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        // Заполняем массив с клавиатуры
        for (int i = 0; i < size; i++) {
            array[i] = readInt(scanner, "Элемент " + i + ": "); // Считываем каждый элемент
        }
        System.out.println("Введенный массив: " + Arrays.toString(array));
        return array;
    }

}
