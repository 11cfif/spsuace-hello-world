package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double step = (b - a) / delta;
        double res = 0;
        for (int i = 0; i <= step; i++) {
            res += function.applyAsDouble(a + delta * i) * delta;
        }
        return res;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        if (a == 0) {
            return 1;
        }
        long res = 0;
        int counter = 0;
        int countMax = 0;
        while (a > 0) {
            if (a % 10 >= res) {
                res = a % 10;
                countMax = counter;
            }
            a /= 10;
            counter++;
        }
        return (byte) (counter - countMax);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return -((x1 * y2 - x2 * y1) + (y1 - y2) * x3) / (double) (x2 - x1);
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double d1 = Math.sqrt(Math.pow(Math.abs(x3 - x1), 2) + Math.pow(Math.abs(y3 - y1), 2));
        double d2 = Math.sqrt(Math.pow(Math.abs(x4 - x2), 2) + Math.pow(Math.abs(y4 - y2), 2));
        double a1 = y1 - y3;
        double a2 = y2 - y4;
        double b1 = x3 - x1;
        double b2 = x4 - x2;
        double s = (1.0 / 2.0) * d1 * d2 * Math.sqrt(1 - Math.pow((a1 * a2 + b1 * b2) / (Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2)) * Math.sqrt(Math.pow(a2, 2) + Math.pow(b2, 2))), 2));
        if ((d1 == 0) | (d2 == 0)) {
            return 0.0;
        } else {
            return s;
        }
    }

}
