package lab3;

import lab1.InputChecker;
import lab2.Student;
//import lab3.Figure.Point;
import lab2.Point;
import lab3.Figure.Point3D;
import lab3.Figure.SummArea;
import lab3.Figure.task4_4.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("1. Задание №1");
            System.out.println("2. Задание №2");
            System.out.println("3. Задание №3");
            System.out.println("4. Задание №4");
            System.out.println("5. Задание №5");
            System.out.println("0. Завершение программы");

            userChoice = InputChecker.readInt(sc, "Выбeрите действие: "); // вводим до тех пор, пока не будет правильный ответ

            switch (userChoice) {

                case 1:
                    Student st = new Student("Volodya");
                    while (true) {
                        int[] grades = InputChecker.readArrIntNum(sc);
                        try {
                            st.setGrades(grades);
                            break;
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    break;

                case 2:
                    PhoneBook book = new PhoneBook();

                    book.print();
                    book.put("94352345", "Bdfy");
                    book.print();
                    break;

                case 3:
                    double x1 = InputChecker.readDouble(sc, "Введите координату х точки №1: ");
                    double y1 = InputChecker.readDouble(sc, "Введите координату y точки №1: ");
                    double z1 = InputChecker.readDouble(sc, "Введите координату z точки №1: ");
                    Point3D p1 = new Point3D(x1, y1, z1);
                    System.out.println(p1);
                    break;

                case 4:
                    //создаём круг
                    Circle c1 = new Circle(InputChecker.readDouble(sc, "Введите первую координату центра круга: "),
                            InputChecker.readDouble(sc, "Введите вторую координату центра круга: "),
                            InputChecker.readPositiveInteger(sc, "Введите радиус круга: "));
                    System.out.println(c1);
                    System.out.println("Площадь круга: " + c1.area() + '\n');

                    //создаём квадрат
                    Square sq1 = new Square(InputChecker.readDouble(sc, "Введите первую координату угла: "),
                            InputChecker.readDouble(sc, "Введите вторую координату угла: "),
                            InputChecker.readPositiveInteger(sc, "Введите длину стороны: "));
                    System.out.println(sq1);
                    System.out.println("Площадь квадрата: " + sq1.area() + '\n');

                    //создаём прямоугольник
                    Rectangle rc1 = new Rectangle(InputChecker.readDouble(sc, "Введите первую координату угла: "),
                            InputChecker.readDouble(sc, "Введите вторую координату угла: "),
                            InputChecker.readPositiveInteger(sc, "Введите длину первой стороны: "),
                            InputChecker.readPositiveInteger(sc, "Введите длину второй стороны: "));
                    System.out.println(rc1);
                    System.out.println("Площадь прямоугольника: " + rc1.area() + '\n');

                    //создаём треугольник

                    Point p41 = new lab2.Point(InputChecker.readDouble(sc, "Введите первую координату точки 1: "),
                            InputChecker.readDouble(sc, "Введите вторую координату точки 1: "));
                    Point p42 = new lab2.Point(InputChecker.readDouble(sc, "Введите первую координату точки 2: "),
                            InputChecker.readDouble(sc, "Введите вторую координату точки 2: "));
                    Point p43 = new lab2.Point(InputChecker.readDouble(sc, "Введите первую координату точки 3: "),
                            InputChecker.readDouble(sc, "Введите вторую координату точки 3: "));

                    Triangle tr1 = new Triangle(p41, p42, p43);
                    System.out.println(tr1);
                    System.out.println("Площадь треугольника: " + tr1.area() + '\n');

                    Circle c2 = new Circle(new Point(1, 3), 8);
                    Square sq2 = new Square(new Point(1, 1), 4);

                    System.out.println("Площадь 4 фигур: " + SummArea.summ(c1, c2, sq1, sq2));

                    // создаём объектную переменную абстрактного класса
                    Shape f;
                    f = c1;
                    System.out.println(f);
                    break;

//                case 5:

                default:
                    System.out.println("Введите правильную цифру!");
            }
        } while (userChoice != 0);

    }
}
