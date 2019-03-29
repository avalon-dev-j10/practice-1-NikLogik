package ru.avalon.java.dev.j10.labs.shapes;

import ru.avalon.java.dev.j10.labs.factories.Randome;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    private float radius;
    private float x;
    private float y;
    private int angle;

    public Circle(float x, float y, float radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
        
    
    @Override
    public float getLength() {
        return radius*2*(float)Math.PI;
    }

    @Override
    public float getArea() {
        return radius*radius*(float)Math.PI;
    }

    @Override
    public int getRotation() {
        return 0;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
    
}
