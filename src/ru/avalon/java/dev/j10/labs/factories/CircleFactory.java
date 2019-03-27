/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories;


import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

/**
 *
 * @author nikitorches
 */
public class CircleFactory implements ShapeFactory{
    
    Randome randNum = new Randome(90);
    
    
    @Override
    public Shape getInstance(){
        return new Circle(randNum.setNumber(), randNum.setNumber(), randNum.setNumber());
    }
    
}
