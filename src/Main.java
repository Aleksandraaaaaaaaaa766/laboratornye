import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lab1 lab1 = new Lab1();

        int userChoice;

        do {
            System.out.println("1. Задание №1");
            System.out.println("2. Задание №2");
            System.out.println("3. Задание №3");
            System.out.println("0. Завершение программы");

            userChoice = InputChecker.readInt(scanner, "Выбeрите действие: "); // вводим до тех пор, пока не будет правильный ответ

            switch (userChoice) {

                case 1:
                    //Задача №1
                    double x = InputChecker.readDouble(scanner, "Введите дробное число для поиска дробной части числа:");
                    System.out.println("Дробная часть числа: " + lab1.fraction(x));
                    //break;

                    //Задача №3
                    System.out.println("Введите символ:");
                    char k = scanner.next().charAt(0);
                    System.out.println("Число: " + lab1.charToNum(k));
                    //break;

                    //Задача №5
                    int p = InputChecker.readInt(scanner, "Введите целое число для проверки на двухзначность:");
                    System.out.println(lab1.is2Digits(p)
                            ? "Число " + p + " является двухзначным"
                            : "Число " + p + " не является двухзначным");

                    //Задача №7
                    int a = InputChecker.readInt(scanner, "Введите целое число (первую границу диапазона):");
                    int b = InputChecker.readInt(scanner, "Введите целое число (вторую границу диапазона):");
                    int num = InputChecker.readInt(scanner, "Введите целое число:");
                    System.out.println(lab1.isInRange(a, b, num)
                            ? "Число " + num + " входит в данный числовой диапазон"
                            : "Число " + num + " не входит в данный числовой диапазон");

                    //Задача №9
                    int a1 = InputChecker.readInt(scanner, "Введите целое число:");
                    int b1 = InputChecker.readInt(scanner, "Введите целое число:");
                    int c1 = InputChecker.readInt(scanner, "Введите целое число:");
                    System.out.println(lab1.isEqual(a1, b1, c1)
                            ? "Числа равны"
                            : "Числа не равны ");
                    break;

                case 2:
                    //Задача №1
                    int numberToAbs = InputChecker.readInt(scanner, "Введите целое число для поиска модуля: ");
                    System.out.println("Модуль числа " + numberToAbs + ": " + lab1.abs(numberToAbs));

                    //Задача №3
                    int divNumber = InputChecker.readInt(scanner, "Введите целое число для проверки делимости на 3 или на 5:");
                    System.out.println(lab1.is35(divNumber)
                            ? "Число делится либо на 3, либо на 5"
                            : "Число либо делится на 3 и на 5, либо не делится ни на одно из них");

                    //Задача №5
                    int candidateForMax1 = InputChecker.readInt(scanner, "Введите первое целое число, для поиска максимума: ");
                    int candidateForMax2 = InputChecker.readInt(scanner, "Введите второе целое число, для поиска максимума: ");
                    int candidateForMax3 = InputChecker.readInt(scanner, "Введите третье целое число, для поиска максимума: ");
                    System.out.println("Максимальное число из трёх предложенных: " + lab1.max3(candidateForMax1, candidateForMax2, candidateForMax3));

                    //Задача №7
                    int firstNumberForAddition = InputChecker.readInt(scanner, "Введите целое число, первое слагаемое:");
                    int secondNumberForAddition = InputChecker.readInt(scanner, "Введите целое число, второе слагаемое:");
                    System.out.println("Результат сложения: " + lab1.sum2(firstNumberForAddition, secondNumberForAddition));

                    //Задача №9
                    int dayOfWeek = InputChecker.readInt(scanner, "Введите  номер дня недели: ");
                    System.out.println("Введённый день недели: " + lab1.day(dayOfWeek));

                    break;

                case 3:
                    //Задача №1
                    int stopNumber = InputChecker.readInt(scanner, "Введите число для вывода предыдущих чисел: ");
                    System.out.println("Полученная строка: " + lab1.listNums(stopNumber));

                    //Задача №3
                    int stopNumberChet = InputChecker.readInt(scanner, "Введите число для вывода предыдущих чётных чисел: ");
                    System.out.println("Полученная строка: " + lab1.chet(stopNumberChet));

                    //Задача №5
                    int number = InputChecker.readInt(scanner, "Введите целое число для подсчёта знаков в числе: ");
                    System.out.println("Количество знаков в числе: " + lab1.numLen(number));

                    //Задача №7
                    int sizeSquare = InputChecker.readInt(scanner, "Введите целое число, размер квадрата: ");
                    lab1.square(sizeSquare);

                    //Задача №9
                    int size = InputChecker.readInt(scanner, "Введите целое число, размер треугольника: ");
                    lab1.rightTriangle(size);

                    break;

                case 0:
                    System.out.println("Пока");
                    break;

                default:
                    System.out.println("Введите правильную цифру!");
            }
        } while (userChoice != 0);
    }
}
