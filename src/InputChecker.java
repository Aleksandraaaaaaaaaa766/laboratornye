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

}
