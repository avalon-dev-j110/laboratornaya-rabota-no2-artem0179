package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.XYPoint;

public class Application {

    static Random random = new Random();

    public static void main(String[] args) {

        Shape[] shapes = new Shape[10];

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(3);

            if (x == 0) {
                shapes[i] = new Triangle(getRandomPoint(), getRandomPoint(), getRandomPoint());
            } else if (x == 1) {
                shapes[i] = new Circle(getRandomPoint(), random.nextInt(60) + 1);
            } else {
                shapes[i] = new Rectangle(getRandomPoint(), getRandomPoint());
            }
        }

 
        
       System.out.println(findMaxShapeIndex(shapes));

    }

    public static float getRandomFloat() {
        return random.nextFloat() * 100;
    }

    public static XYPoint getRandomPoint() {
        return new XYPoint(getRandomFloat(), getRandomFloat());
    }

    public static int findMaxShapeIndex(Shape[] shapes) {
        float max = shapes[0].getArea();
        int result = 0;

        for (int i = 1; i < shapes.length; i++) {
            if (max < shapes[i].getArea()) {
                max = shapes[i].getArea();
                result = i;
            }
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
