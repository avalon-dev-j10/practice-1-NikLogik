/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories;


import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

/**
 *
 * @author nikitorches
 */
public class TriangleFactory implements ShapeFactory{
    
    Randome randNum = new Randome(90);
    
    
    @Override
    public Shape getInstance(){
        return new Triangle(randNum.setNumber(), randNum.setNumber(), randNum.setNumber());
    }    
    /*  TODO (Проверка№1 ЛР№2)
        - Ошибка создания сторон треугольника. Если ты рандомно создаешь три стороны
        треугольника, ты должен соблюдать главное его правило - "Сумма любых двух
        сторон, должна быть больше чем третья"
        - Например, у тебя может создаться треугольник со сторонами 3, 10 и 40.
        Такой треугольник невозможно построить и не выполняется правило
        3 + 10 > 40 - ложь, поэтому возникает NaN
        - Исправить метод создания треугольника!!!
    */
}
