package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory();
        
        Shape[] shapes = new Shape[20];
        
        for(int i=0; i<shapes.length; i++){     //инициализируем массив случайными фигурами
        shapes[i]=factory.getInstance();
        }
        
        
        Shape shapeMaxArea = shapes[0];        //объявляю и инициализирую переменную для хранения фигуры с максимальной площадью
        
        for(int i=1; i<shapes.length; i++){    //сравниваю значения площадей фигур
                shapeMaxArea = shapeMaxArea.getArea() > shapes[i].getArea() ? shapeMaxArea : shapes[i];
        }
   
        System.out.println("Фигура с максимальной площадью: " + shapeMaxArea.getClass().getSimpleName());
        System.out.println("Значение площади: " + shapeMaxArea.getArea());
        
        for(Shape shape : shapes){
            System.out.println(shape.getArea() + " " + shape.toString());
        }
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
    }
}
