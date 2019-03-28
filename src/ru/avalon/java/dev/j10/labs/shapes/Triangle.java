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
    
    private float sideAB;       //основание
    private float sideBC;         //левая сторона
    private float sideAC;        //правая сторона
    private float area;             //площадь Треугольника
    private float perimeter;        //периметр Треугольника
    private int angleRotation;      //угол поворота фигуры
    private float centerX;     //координата Х центра фигуры
    private float centerY;    //координата У центра фигуры
    
    /*  TODO (Проверка№1 ЛР№2)
        - Нелогическое название сторон треугольника! Основанием может быть любая
        сторона треугольника, если его перевернуть, правая сторона может оказаться слева!
        Исправить названия, как на уроках геометрии в Школе!
        - Треугольник, как и любая фигура может иметь координаты на полскости и угол поворота!
        В данном классе, отсутствует один интерфейс!
    
    */
        
    public Triangle(float ab, float bc, float aBc){     //принимаем параметры: две стороны и угол между ними
            this.sideAB = ab;
            this.sideBC = bc;
            this.sideAC = (float) Math.sqrt(Math.pow(ab, 2) + Math.pow(bc, 2) - 2 * ab * bc * Math.cos(Math.toRadians(aBc)));      //определяем третью сторону по теореме косинусов
        
        this.perimeter = sideAB+sideBC+sideAC;  //определяем периметр Треугольника
        

        //вычисляем площадь по трем сторонам, по пормуле Герона
        area = (float) Math.sqrt((perimeter / 2) * ((perimeter / 2) - sideAB) * ((perimeter / 2) - sideBC) * ((perimeter / 2) - sideAC));
        
        /*  TODO (Проверка№1 ЛР№2)
            - Высота лишний параметр, любую высоту можно вычислить, зная три стороны
            треугольника. Удалить высоту!
            - Площадь находить сразу по формуле Герона, минуя высоту!
        */
        
        
        //задаем угол поворота фигуры
        angleRotation = setRotation();
        
        //задаем координаты центра фигуры
        centerX = setCoordinate();
        centerY = setCoordinate();
    }
    
    //задаем угол поворота фигуры
    private int setRotation(){
        Randome rand = new Randome(360);
        int angle = rand.setNumber();
        return angle;
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
    
    /*  TODO (Проверка№1 ЛР№2)
        - Возращаемый угол поворота фигуры треугольника может лежат в диапазоне от 0 до 360!
    */
        
}
