package lab2;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;
//    private double average;

    public int[] getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

//    public double getAverage() {
//        return average;
//    }

    public void setGrades(int[] grades) {

        for (int grad : grades) {
            if (grad < 2 || grad > 5) {
                throw new IllegalArgumentException("Оценки должны быть от 2 до 5");
            }
        }
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int... grades) { //второй аргумент либо пустой, либо нет
        setName(name);

        if (grades == null) { // если пустой, создаём пустой массив
            this.grades = new int[0];
        } else { //иначе вызываем сет
            setGrades(grades);
        }
    }

    /*public Student(String name) {
        this.name = name;
    }

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student(Student other) {
        this.name = other.name;
        this.grades = other.grades;
    }*/

    @Override
    public String toString() {
        return this.name + ": " + Arrays.toString(grades);
    }

    public double getAverage() {
        double avr = 0;
        if (grades.length >= 1) {
            for (int grade : grades) {
                avr += grade;
            }
            return avr / grades.length;
        } else {
            return avr;
        }
    }

    public boolean isTop() {
        return grades.length >= 1 && getAverage() == 5;
    }
}
