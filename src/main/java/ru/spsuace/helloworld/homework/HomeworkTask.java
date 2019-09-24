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
        if (b < a) {
            double cash = a;
            a = b;
            b = cash;
        }

        double sum = 0;
        for (double i = a; i < b; i += delta) {
            sum += function.applyAsDouble(i) * delta;
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
        for(i = 1; ; i++) {
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
        int sign = 1;
        if ((coords.get(0).X > coords.get(1).X) && (coords.get(2).X < coords.get(3).X)){
            Coord cash = coords.get(0);
            coords.set(0, coords.get(1));
            coords.set(1, cash);
            sign *= -1;
        }


        ToDoubleFunction<Double> top = x -> (x - coords.get(0).X) * (coords.get(1).Y - coords.get(0).Y) / (coords.get(1).X - coords.get(0).X) + coords.get(0).Y;
        ToDoubleFunction<Double> bottom = x -> (x - coords.get(2).X) * (coords.get(3).Y - coords.get(2).Y) / (coords.get(3).X - coords.get(2).X) + coords.get(2).Y;

        ToDoubleFunction<Double> left = x -> (x - coords.get(0).X) * (coords.get(2).Y - coords.get(0).Y) / (coords.get(2).X - coords.get(0).X) + coords.get(0).Y;
        ToDoubleFunction<Double> right = x -> (x - coords.get(1).X) * (coords.get(3).Y - coords.get(1).Y) / (coords.get(3).X - coords.get(1).X) + coords.get(1).Y;

        double sBottom = calcIntegral(coords.get(0).X, coords.get(1).X, top, 1e-3);
        double sTop = calcIntegral(coords.get(2).X, coords.get(3).X, bottom, 1e-3);

        double sLeft = calcIntegral(coords.get(0).X, coords.get(2).X, left, 1e-3);
        double sRight = calcIntegral(coords.get(1).X, coords.get(3).X, right, 1e-3);

        return (sTop - sBottom) + Math.abs(sRight - sLeft);
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


