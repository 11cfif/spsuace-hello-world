package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double integral = 0;
        double x = a + delta / 2;
        while (x < b) {
            integral += delta / 6 *( function.applyAsDouble(x - delta / 2) + 4 * function.applyAsDouble(x) +
                    function.applyAsDouble(x + delta / 2));
            x +=delta;
        }
        return integral;
    }
 /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long maxNumb = 0;
        long numbPosition = 0;
        long end = 0;
        long index = 0;
        long whole = a;
        while (whole > 0) {
            end = whole % 10;
            whole = whole / 10;
            numbPosition++;
            if (end >= maxNumb) {
                maxNumb = end;
                index = numbPosition;
            }
        }
        return (byte) (numbPosition - index + 1);
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
        return ((double) (Math.abs(x1 * y2 + x2 * y3 + x3 * y4 + x4 * y1 - x2 * y1 - x3 * y2 - x4 * y3 - x1 * y4))) / 2;
    }
}

