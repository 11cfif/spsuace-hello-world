package ru.spsuace.helloworld.homework;
import java.util.*;
import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double sum = 0;
        for (double x = a; x < b; x += delta) {
            sum += function.applyAsDouble(x) * delta;
        }
        return sum;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long copyA = a;
        int maxNumber = 1;
        int number;
        int invertResult = 1;
        int i;
        for (i = 1; ; i++) {
            number = (int) copyA % 10;
            if (number >= maxNumber) {
                maxNumber = number;
                invertResult = i;
            }
            if( copyA < 10) {
                break;
            } else {
                copyA /= 10;
            }
        }
        return (byte)(i + 1 - invertResult);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (x3 - x1) * (y2 - y1) / (x2 - x1) + y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        ArrayList<Coord> coords = new ArrayList<Coord>();
        coords.add(new Coord(x1, y1));
        coords.add(new Coord(x2, y2));
        coords.add(new Coord(x3, y3));
        coords.add(new Coord(x4, y4));

        Collections.sort(coords, new Coord(0,0));
        if ((coords.get(0).X > coords.get(1).X) && (coords.get(2).X < coords.get(3).X)){
            Coord cash = coords.get(0);
            coords.set(0, coords.get(1));
            coords.set(1, cash);
        }

        double d1 = Math.sqrt((Math.pow(coords.get(0).X - coords.get(3).X, 2) + Math.pow(coords.get(0).Y - coords.get(3).Y, 2)));
        double d2 = Math.sqrt((Math.pow(coords.get(1).X - coords.get(2).X, 2) + Math.pow(coords.get(1).Y - coords.get(2).Y, 2)));

        if (d1 == 0 || d2 == 0)
        {
            return 0;
        }

        Coord d1Vector = new Coord (coords.get(3).X - coords.get(0).X, coords.get(3).Y - coords.get(0).Y);
        Coord d2Vector = new Coord (coords.get(2).X - coords.get(1).X, coords.get(2).Y - coords.get(1).Y);

        double cosA = (d1Vector.X * d2Vector.X + d1Vector.Y * d2Vector.Y) / d1 / d2 ;
        double sinA = Math.sqrt(1 - cosA * cosA);

        return  d1 * d2 * sinA / 2;
    }

}

class Coord implements Comparator<Coord> {
    public int X;
    public int Y;

    public Coord(int x, int y) {
        X = x;
        Y = y;
    }

    @Override
    public int compare(Coord c1, Coord c2) {
        int deltaY = c1.Y - c2.Y;
        if (deltaY == 0){
            int deltaX = c1.X - c2.X;
            return  deltaX;
        } else {
            return  deltaY;
        }
    }
}


