package lab2;

import java.util.Arrays;
import java.util.Scanner;

import lab1.InputChecker;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("1. Задание №1");
            System.out.println("2. Задание №2");
            System.out.println("3. Задание №3");
            System.out.println("4. Задание №4");
            System.out.println("0. Завершение программы");

            userChoice = InputChecker.readInt(scanner, "Выбeрите действие: "); // вводим до тех пор, пока не будет правильный ответ

            switch (userChoice) {

                case 1:
                    for (int i = 1; i <= 3; i++) {
                        //создать 3 точки и вывести их на экран
                        double x1 = InputChecker.readDouble(scanner, "Введите координату х точки №1: ");
                        double y1 = InputChecker.readDouble(scanner, "Введите координату y точки №1: ");
                        Point p1 = new Point(x1, y1);
                        System.out.println(p1.toString());
                    }
                    break;

                case 2:
                    //Линия 1 с началом в т. {1;3} и концом в т.{23;8}.
                    Point p1 = new Point(1, 3);
                    Point p2 = new Point(23, 8);
                    Line l1 = new Line(p1, p2);
                    System.out.println("1 " + l1.toString());

                    //Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
                    Point p3 = new Point(5, 10);
                    Point p4 = new Point(25, 10);
                    Line l2 = new Line(p3, p4);
                    System.out.println("2 " + l2.toString());

                    //Линия 3, которая начинается всегда там же, где начинается линия 1, и заканчивается всегда там
                    //же, где заканчивается линия 2. Таким образом, если положение первой или второй линии
                    //меняется, то меняется и третья линия. Создаём ссылки на определённые существующие точки
                    Line l3 = new Line(l1.getStartPoint(), l2.getEndPoint());
                    System.out.println("3 " + l3.toString());

                    //После создания всех трех объектов измените координаты первой и второй линий, причем
                    //сделайте это таким образом, чтобы положение третьей линии соответствовало требованиям
                    //пункта 3.
                    //Изменяем координаты первой линии
                    //методом гет получили ссылку на поле типа Point, затем изменили уже его поле
                    Point start = l1.getStartPoint();
                    start.setX(9);
                    start.setY(0);

                    Point end = l1.getEndPoint();
                    end.setX(25);
                    end.setY(-3);

                    //Изменяем координаты второй линии
                    l2.getStartPoint().setX(45);
                    l2.getStartPoint().setY(2);
                    l2.getEndPoint().setX(-24);
                    l2.getEndPoint().setY(-3);

                    System.out.println("Изменённые координаты: ");
                    System.out.println("1 " + l1.toString());
                    System.out.println("2 " + l2.toString());
                    System.out.println("3 " + l3.toString());

                    //Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей
                    //линии.
                    //Создаем копию точки, а не меняем старую
                    l1.setStartPoint(new Point(10, 20));
                    l1.setEndPoint(new Point(1, 43));

                    System.out.println("Изменённые координаты первой линии: ");
                    System.out.println("1 " + l1.toString());
                    System.out.println("2 " + l2.toString());
                    System.out.println("3 " + l3.toString());

                    break;
                case 3:
                    Student vasya = new Student("Вася", new int[]{1, 2, 3});
                    System.out.println(vasya.toString());
                    Student petya = new Student("Петя");
                    petya.setGrades(vasya.getGrades());
                    petya.getGrades()[0] = 5;
                    System.out.println("Изменили первую оценку у Пети: ");
                    System.out.println(vasya.toString());
                    System.out.println(petya.toString());

                    Student andrey = new Student("Андрей");
                    int[] arr = vasya.getGrades();
                    andrey.setGrades(Arrays.copyOf(arr, arr.length));
                    System.out.println("Скопировали оценки Васи:");
                    System.out.println(andrey.toString());

                    vasya.getGrades()[1] = 5;
                    System.out.println("Изменили оценки Васи:");
                    System.out.println(vasya.toString());
                    System.out.println(andrey.toString());

                    break;
                case 4:
                    System.out.println("41. Создаём точку только по Х и Y");
                    Point p41 = new Point(3, 5);
                    Point p42 = new Point(25, 6);
                    Point p43 = new Point(7,8);

                    System.out.println(p41.toString());
                    System.out.println(p42.toString());
                    System.out.println(p43.toString());

                    System.out.println("47. Создаём студента либо по имени либо по имени и оценкам: ");

                    Student vasya1 = new Student("Вася", new int[]{3, 4, 5});
                    Student maksim = new Student("Максим");
            }
        } while (userChoice != 0);

    }
}