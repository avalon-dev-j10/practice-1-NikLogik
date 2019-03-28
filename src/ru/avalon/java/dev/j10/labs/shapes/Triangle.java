package ru.avalon.java.dev.j10.labs.shapes;

import ru.avalon.java.dev.j10.labs.factories.Randome;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {
    

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    private float bottomSide;       //основание
    private float leftSide;         //левая сторона
    private float rightSide;        //правая сторона
    private float height;           //высота Треугольника
    private float area;             //площадь Треугольника
    private float perimeter;        //периметр Треугольника
    private int angleRotation;      //угол поворота фигуры
    
    /*  TODO (Проверка№1 ЛР№2)
        - Нелогическое название сторон треугольника! Основанием может быть любая
        сторона треугольника, если его перевернуть, правая сторона может оказаться слева!
        Исправить названия, как на уроках геометрии в Школе!
        - Треугольник, как и любая фигура может иметь координаты на полскости и угол поворота!
        В данном классе, отсутствует один интерфейс!
    
    */
        
    public Triangle(float bottomSide, float leftSide, float rightSide){
        this.bottomSide = bottomSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.perimeter = bottomSide+leftSide+rightSide;  //определяем периметр Треугольника
        

        //вычисляем высоту по трем сторонам, по пормуле Герона
        float halfPerimeter = perimeter / 2;
        float firstPartOfFormula = halfPerimeter * (halfPerimeter - leftSide) * (halfPerimeter - rightSide) * (halfPerimeter - bottomSide);
        height = (2/bottomSide) * (float) Math.sqrt(firstPartOfFormula);
        
        /*  TODO (Проверка№1 ЛР№2)
            - Высота лишний параметр, любую высоту можно вычислить, зная три стороны
            треугольника. Удалить высоту!
            - Площадь находить сразу по формуле Герона, минуя высоту!
        */
        
        //вычисляем площадь Треугольника
        area = (bottomSide * height) / 2;
        
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
    
    /*  TODO (Проверка№1 ЛР№2)
        - Возращаемый угол поворота фигуры треугольника может лежат в диапазоне от 0 до 360!
    */
        
}
