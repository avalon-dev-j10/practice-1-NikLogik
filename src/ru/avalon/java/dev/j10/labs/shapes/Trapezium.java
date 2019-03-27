package ru.avalon.java.dev.j10.labs.shapes;

import ru.avalon.java.dev.j10.labs.factories.Randome;

/**
 * Представление о трапеции.
 * <p>
 * Трапе́ция (от др.-греч. τραπέζιον — «столик» от τράπεζα —
 * «стол») — выпуклый четырёхугольник, у которого две
 * стороны параллельны. Часто в определение трапеции
 * добавляют условие, что две другие стороны должны быть не
 * параллельны.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BF%D0%B5%D1%86%D0%B8%D1%8F">Трапеция</a>
 */
public class Trapezium implements Polygon {

    /*
     * TODO: Реализовать класс 'Trapezium'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private float topSide;      //верхнее основание
    private float bottomSide;   //нижнее основание
    private float leftSide;     //левая сторона
    private float rightSide;    //правая сторона
    private float height;       //высота
    private float area;         //площадь   
    private float perimeter;    //периметр
    private float leftAngleOfBottom;//левый угол основания
    private int angleRotation; //угол поворота фигуры
    
    
    
    public Trapezium(float topSide, float bottomSide, float height, float leftAngleOfBottom){
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.leftAngleOfBottom = leftAngleOfBottom;
        
        //вычисляем площадь Трапеции
        area = ((topSide + bottomSide)/2)*height;
        
        //вычисляем периметр Трапеции
        perimeter = (2*area)/(topSide + bottomSide);
        
        //определяем левую сторону Трапеции через высоту и угол при основании
        this.leftSide = height / (float) Math.sin(Math.toRadians(leftAngleOfBottom));
        
        //определяем правую сторону Трапеции
        this.rightSide = perimeter - topSide - bottomSide - leftSide;
        
        //задаем угол поворота фигуры
        angleRotation = setRotation();
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
        return 0;
    }
        
}
