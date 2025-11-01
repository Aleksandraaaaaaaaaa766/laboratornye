package lab4.task2;

//Создайте метод, принимающий Коробку из задачи 3.1.1, и кладет в неё трехмерную точку
//координат (из задачи 2.1.5) с произвольными значениями. Метод должен позволять передавать
//Коробку с более чем одним видом параметризации.

import lab3.Figure.Point3D;

public class PointInBox {

    public static void putPoint(Box<? super Point3D> box) {//принимает тип точка и все родительские
        box.put(new Point3D(Math.random(), Math.random(), Math.random()));
    }
}
