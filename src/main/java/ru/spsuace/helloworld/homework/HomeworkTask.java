package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double s = 0;
        for (double position = a; position <= b; position += delta) {
            s += function.applyAsDouble(position) * delta;
        }
        return s;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long length = (long) Math.ceil(Math.log10(a));
        long max = 0;
        int i = 1;
        int index = 1;
        long numberInPosition;
        while (i <= length) {
            numberInPosition = a / (long) Math.pow(10, length - i) % 10;
            if (max <  numberInPosition) {
                max =  numberInPosition;
                index = i;
            }
            i++;
        }
        return (byte) index;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) ( - (y1 - y2) * x3 - (x1 * y2 - x2 * y1)) / (x2 - x1);
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double sideAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));             //Стороны
        double sideBC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double sideCD = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        double sideAD = Math.sqrt(Math.pow((x1 - x4), 2) + Math.pow((y1 - y4), 2));
        double diagonalAC = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));         //Диагональ AC

        double p1 = (sideAB + sideBC + diagonalAC) / 2;
        double areaABC = Math.sqrt(p1 * (p1 - sideAB) * (p1 - sideBC) * (p1 - diagonalAC));     //ABC
        double p2 = (diagonalAC + sideAD + sideCD) / 2;
        double areaACD = Math.sqrt(p2 * (p2 - diagonalAC) * (p2 - sideAD) * (p2 - sideCD));     //ACD

        return areaABC + areaACD;
    }

}
