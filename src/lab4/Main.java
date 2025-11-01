package lab4;

import lab1.InputChecker;
import lab2.Point;
import lab3.Figure.Point3D;
import lab4.task2.Box;
import lab4.task2.PointInBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("1. Задание №1");
            System.out.println("2. Задание №2");
            System.out.println("3. Задание №3");
            System.out.println("0. Завершение программы");

            userChoice = InputChecker.readInt(sc, "Выбeрите действие: "); // вводим до тех пор, пока не будет правильный ответ

            switch (userChoice) {

                case 1:
                    System.out.println(1);
                case 2:
                    Box<Point> box = new Box<>();
                    PointInBox.putPoint(box);  //кладем точку в коробку
                    System.out.println(box);
                default:
                    System.out.println("Введите правильную цифру!");
            }
        } while (userChoice != 0);


    }
}
