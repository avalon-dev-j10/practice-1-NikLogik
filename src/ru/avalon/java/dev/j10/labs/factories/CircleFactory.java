package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class CircleFactory implements ShapeFactory{
    
    Randome randNum = new Randome(20);
    
    
    @Override
    public Shape getInstance(){
        return new Circle(randNum.setNumber(), randNum.setNumber(), randNum.setNumber());
    }
    
}
