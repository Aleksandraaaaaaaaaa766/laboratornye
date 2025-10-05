package lab2;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public int[] getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int... grades) {
        setName(name);

        if (grades == null) {
            this.grades = new int[0];
        } else {
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
        this.grades = other.grades;
    }*/

    @Override
    public String toString() {
        return this.name + ": " + Arrays.toString(grades);
    }
}
