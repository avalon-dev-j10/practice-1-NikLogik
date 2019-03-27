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
    
    public Rhombus(float topSide, float angleOfBottom){
        this.topSide = this.bottomSide =  this.leftSide = this.rightSide = topSide; //инициализуем стороны Ромба
        //вычисляем периметр Ромба
        perimeter = topSide*2;          
        this.angleOfBottom = angleOfBottom;   //иницилизируем угол Ромба 
        this.height = setHeight(topSide, angleOfBottom);    //вычисляем высоту Ромба
        area = height * topSide;    //вычисляем площадь Ромба
        angleRotation = setRotation();  //задаем угол поворота фигуры
        
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
    
    //вычисляет высоту Ромба
    private float setHeight(float a, float b) { 
        if(b>89){               //проверяем, чтобы угол был не 90 градусов
            b = 89;
        }else if(b<1){
            b = 1;
        }
        height = a * (float)Math.sin(Math.toRadians(b));    //определяем высоту Ромба
        
        return height;
    }
    
    //задаем угол поворота фигуры
    private int setRotation(){
        Randome rand = new Randome(360);
        int angle = rand.setNumber();
        return angle;
    }

}
