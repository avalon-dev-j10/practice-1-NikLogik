package ru.avalon.java.dev.j10.labs.shapes;

import java.security.Provider;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.factories.Randome;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном переводе: «бубен») — это
 * параллелограмм, у которого все стороны равны
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus implements Polygon {

    private float topSide;      //1-я сторона Ромба
    private float bottomSide;   //2-я сторона Ромба
    private float leftSide;     //3-я сторона Ромба
    private float rightSide;    //4-я сторона Ромба
    private float angleOfBottom;//угол между двумя сторонами Ромба
    private float height;       //высота Ромба
    private float area;         //площадь Ромба
    private float perimeter;    //периметр Ромба
    private int angleRotation; //угол поворота фигуры
    
    /*  TODO (Проверка№1 ЛР№2)
        - Ромб, как и любая фигура может иметь координаты на полскости и угол поворота!
        В данном классе, отсутствует один интерфейс!
        - Ромб по своей природе, фигура у которой все 4 стороны равны. Оставить всего одну сторону!
    */
    
    public Rhombus(float topSide, float angleOfBottom){
        this.topSide = this.bottomSide =  this.leftSide = this.rightSide = topSide; //инициализуем стороны Ромба
        //вычисляем периметр Ромба
        perimeter = topSide*2;          
        this.angleOfBottom = angleOfBottom;   //иницилизируем угол Ромба 
        this.height = setHeight(topSide, angleOfBottom);    //вычисляем высоту Ромба
        area = height * topSide;    //вычисляем площадь Ромба
        angleRotation = setRotation();  //задаем угол поворота фигуры
        
        /*  TODO (Проверка№1 ЛР№2)
            - Неправильно определен периметр ромба!!
        */
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
    
    /*  TODO (Проверка№1 ЛР№2)
        - Возращаемый угол поворота фигуры ромба может лежат в диапазоне от 0 до 360!
    */
    
    //вычисляет высоту Ромба
    private float setHeight(float a, float b) { 
        if(b>89){               //проверяем, чтобы угол был не 90 градусов
            b = 89;
        }else if(b<1){
            b = 1;
        }
        height = a * (float)Math.sin(Math.toRadians(b));    //определяем высоту Ромба
        
        /*  TODO (Проверка№1 ЛР№2)
            - Если угол больше 90 или меньше 0, то тебе надо его преобразовать к
            диапазону от 0 до 90 градусов, а не напрямую задавать значения, которые
            не соответствуют начальным значениям!
            - Угол задать в виде   |угол % 90| - по модулю остаток от деления на 90!
        */
        
        return height;
    }
    
    //задаем угол поворота фигуры
    private int setRotation(){
        Randome rand = new Randome(360);
        int angle = rand.setNumber();
        return angle;
    }

}
