package ru.avalon.java.dev.j10.labs.shapes;

import static ru.avalon.java.dev.j10.labs.shapes.Triangle.getSideLength;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы прямые (равны 90
 * градусам).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private XYPoint a, b, c, d;

    public Rectangle(XYPoint a, XYPoint b) {
        if (a.getX() == b.getX() || a.getY() == b.getY()) {
            throw new IllegalArgumentException("Неверные координаты. Точки на одной прямой");

        }
        this.a = a;
        this.b = b;
        c = new XYPoint(b.getX(), a.getY());
        d = new XYPoint(a.getX(), b.getY());

    }

    @Override
    public float getPerimeter() {
        return 2 * (getSideLength(a, c) + getSideLength(c, b));

    }

    @Override
    public float getArea() {
        return getSideLength(a, c) * getSideLength(c, b);

    }

    
    /*
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
