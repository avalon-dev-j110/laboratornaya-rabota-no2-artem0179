package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая фигура,
 * образованная тремя отрезками, которые соединяют три точки, не лежащие на
 * одной прямой. Указанные три точки называются вершинами треугольника, а
 * отрезки — сторонами треугольника. Часть плоскости, ограниченная сторонами,
 * называется внутренностью треугольника: нередко треугольник рассматривается
 * вместе со своей внутренностью (например, для определения понятия площади).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    private XYPoint a, b, c;

    public Triangle(XYPoint a, XYPoint b, XYPoint c) {
        if (a.getX() == b.getX() && b.getX() == c.getX()) {
            System.out.println("Это не треугольник. Точки лежат по оси абсцисс на одной прямой");
        }
        if (a.getY() == b.getY() && b.getY() == c.getY()) {
            System.out.println("Это не треугольник. Точки по оси ординат лежат на одной прямой");
        }
       
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float getPerimeter() {
        return (float) (Math.sqrt(Math.pow((b.getX() - a.getX()), 2)) + (Math.pow((b.getY() - a.getY()), 2))
                + Math.sqrt(Math.pow((c.getX() - a.getX()), 2)) + (Math.pow((c.getY() - a.getY()), 2))
                + Math.sqrt(Math.pow((c.getX() - b.getX()), 2)) + (Math.pow((c.getY() - b.getY()), 2)));
    }

    
    
    @Override
    public float getArea() {
        return (float) 1 / 2 * (Math.abs(
                (b.getX() - a.getX()) * (c.getY() - a.getY())
                - (c.getX() - a.getX()) * (b.getY() - a.getY())));
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
