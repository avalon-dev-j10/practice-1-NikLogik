package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.factories.Randome;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
   
    private float topSide;      //верхняя сторона
    private float leftSide;     //левая сторона
    private float area;         //площадь
    private float perimeter;    //периметр
    private int angleRotation; //угол поворота фигуры
    private float centerX;     //координата Х центра фигуры
    private float centerY;    //координата У центра фигуры
    
    /*  TODO (Проверка№1 ЛР№2)
        - Прямоугольник, как и любая фигура может иметь координаты на полскости и угол поворота!
        В данном классе, отсутствует один интерфейс!
        - Прямоугольник по своей природе, фигура у которой противоположные стороны равны. Оставить всего две стороны!
    */
    
    public Rectangle(float topSide, float leftSide){
        this.topSide = topSide;
        this.leftSide = leftSide;
        
        //вычисляем периметр Прямоугольника
        perimeter = (topSide*2) +(leftSide*2);
        
        //вычисляем площадь Прямоугольника
        area = topSide * leftSide;
        
        //задаем угол поворота фигуры
        angleRotation = setRotation();
        
        //задаем координаты центра фигуры
        centerX = setCoordinate();
        centerY = setCoordinate();
    }

    //задаем значение координаты, которая вызывает метод
    public float setCoordinate() {
        Randome rand = new Randome(10);
        float coordinate = rand.setNumber();
        return coordinate;
    }

    @Override
    public float getX() {
        return centerX;
    }

    @Override
    public float getY() {
        return centerY;
    }
    
    //задаем угол поворота фигуры
    private int setRotation(){
        Randome rand = new Randome(360);
        int angle = rand.setNumber();
        return angle;
    }
    
    @Override
    public float getPerimeter() {
        return perimeter;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public int getRotation() {
        return angleRotation;
    }

}
