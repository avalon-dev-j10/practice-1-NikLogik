package ru.avalon.java.dev.j10.labs.factories;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Ellipse;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Rhombus;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Trapezium;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

/**
 * "Фабрика" фигур, возвращающая фигуры случайной природы.
 * <p>
 * Фабрика возвращает не только фигуры случайных типов, но
 * также обеспечивает случайную природу самих фигур. Другими,
 * словаим, если фабрика возвращает две фигуры одного и того
 * же типа, их структура, с высокой вероятностью, будет
 * отличатся.
 */
public class RandomShapeFactory implements ShapeFactory {

    
    /*
     * TODO: Реализуйте класс 'RandomShapeFactory'
     * Подумайте о том, какой может быть реализация.
     *
     * Как можно улучшить реализацию, создав специализированные
     * фабрики, создающие конкретные подвиды фигур?
     */
    
    

    /**
     * Возвращает случайную фигуру.
     * <p>
     * Разные вызовы метода могут возвращать экземпляры
     * различных типов. Например, два последовательных вызова
     * метода могут вернуть фигуры одного и того же типа,
     * но могут вернуть и фигуры различных типов.
     * <p>
     * Структура полученных фигур, также носит случайный
     * характер. Например, если два вызова метода возвращают
     * окружность, то это будут окружности с различным
     * радиусом.
     *
     * @return новый экземпляр типа {@link Shape}.
     */
    
    Shape shape;
    
    @Override
    public Shape getInstance() {
        
       Randome typeShape = new Randome(5);
       switch(typeShape.setNumber()){
           case 0:
               return shape = new RhombusFactory().getInstance();
           case 1:
               return shape = new RectangleFactory().getInstance();
           case 2:
               return shape = new TriangleFactory().getInstance();
           case 3:
               return shape = new TrapeziumFactory().getInstance();
           case 4:
               return shape = new CircleFactory().getInstance();
        }
         

        /*
         * TODO: Реализовать метод 'getInstance()' класса 'RandomShapeFactory'
         */
        return shape;
        
    }
}
