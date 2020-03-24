package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double answer = 0;
        for (double lim = a; lim < b; lim = lim + delta) {
            answer += function.applyAsDouble(lim);
        }
        return answer * delta;
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
        double Kab = (y2 - y1) / (x2 - x1);
        double Y3 = Kab * (x3 - x2) + y2;

        return Y3;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double square = 0;
        double AB = Math.hypot(x2 - x1, y2 - y1);
        double BC = Math.hypot(x3 - x2, y3 - y2);
        double CD = Math.hypot(x4 - x3, y4 - y3);
        double DA = Math.hypot(x1 - x4, y1 - y4);
        double BD = Math.hypot(x4 - x2, y4 - y2);
        double square1 = Math .abs ((x2 - x1)*(y4 - y1) - (x4 - x1)*(y2 - y1)) / 2;
        double square2 = Math .abs ((x2 - x3)*(y4 - y3) - (x4 - x3)*(y2 - y3)) / 2;
        return square = square1 + square2 ;
    }

}
