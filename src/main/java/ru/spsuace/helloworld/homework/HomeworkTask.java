package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        int i;
        double result;

        result = 0;
        int n = (int) ((b - a) / delta);

        for (i = 0; i < n; i++) {
            result += function.applyAsDouble(a + delta * i);
        }
        result *= delta;
        return result;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        return 0;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double a = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - a * x1;
        return a * x3 + b;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double a = (double) Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
        double b = (double) Math.sqrt(Math.pow(y3 - y2, 2) + Math.pow(x3 - x2, 2));
        double c = (double) Math.sqrt(Math.pow(y4 - y3, 2) + Math.pow(x4 - x3, 2));
        double d = (double) Math.sqrt(Math.pow(y1 - y4, 2) + Math.pow(x1 - x4, 2));
        double p = (double) Math.sqrt(Math.pow(y3 - y1, 2) + Math.pow(x3 - x1, 2));
        double pp1 = (double) (a + b + p) / 2;
        double pp2 = (double) (c + d + p) / 2;
        double s1 = (double) Math.sqrt(pp1 * (pp1 - a) * (pp1 - b) * (pp1 - p));
        double s2 = (double) Math.sqrt(pp2 * (pp2 - c) * (pp2 - d) * (pp2 - p));
        return s1 + s2;
    }

}
