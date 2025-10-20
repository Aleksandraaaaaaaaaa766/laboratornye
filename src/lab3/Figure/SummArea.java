package lab3.Figure;

import lab3.Figure.task4_4.Circle;
import lab3.Figure.task4_4.Shape;
import lab3.Figure.task4_4.Square;

public class SummArea {

    static public double summ(Shape... sh) {
        double s = 0;
        for (Shape i : sh) {
            s += i.area();
        }
        return s;
    }
}
