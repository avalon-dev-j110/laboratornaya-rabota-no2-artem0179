package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.XYPoint;

public class Application {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Triangle(new XYPoint(10, 8), new XYPoint(15, 20), new XYPoint(8, 7));
        shapes[1] = new Circle(new XYPoint(5, 2), 15);
        shapes[2] = new Rectangle (new XYPoint(3, 5), new XYPoint(10, 2));
        
        
        
        System.out.println(shapes[0].getArea());
        System.out.println(shapes[1].getArea());

        
        System.out.println(findMaxShape(shapes));
        
        
    }

    public static int findMaxShape(Shape[] shapes) {
        float max = shapes[0].getArea();
        int result = 0;
            System.out.println("У элемента " + 0 + " площадь " + shapes[0].getArea());
        for (int i = 1; i < shapes.length; i++) {
            if (max < shapes[i].getArea()) {
                max = shapes[i].getArea();
                result = i;
            }
            System.out.println("У элемента " + i + " площадь " + shapes[i].getArea());
        }
        return result;
    }


    
    
    
    
 /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
     */
}
