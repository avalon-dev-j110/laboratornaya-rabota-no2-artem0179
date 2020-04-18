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

    public static float getSideLength(XYPoint x, XYPoint y) {
        return (float) (Math.sqrt((Math.pow((y.getX() - x.getX()), 2)) + (Math.pow((y.getY() - x.getY()), 2))));
    }

  
    private XYPoint a, b, c;

    public Triangle(XYPoint a, XYPoint b, XYPoint c) {
        if (a.getX() == b.getX() && b.getX() == c.getX()) {
            throw new IllegalArgumentException("Неверные координаты. Точки на одной прямой");
        }
        if (a.getY() == b.getY() && b.getY() == c.getY()) {
            throw new IllegalArgumentException("Неверные координаты. Точки на одной прямой");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float getPerimeter() {
        return getSideLength(a, b) + getSideLength(b, c) + getSideLength(c, a);

    }

    
    
    @Override
    public float getArea() {
        float p = getPerimeter()/2;
        return (float) Math.sqrt(p * (p - getSideLength(a, b)) * 
                (p - getSideLength(b, c)) *
                (p - getSideLength(c, a)));
                
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
