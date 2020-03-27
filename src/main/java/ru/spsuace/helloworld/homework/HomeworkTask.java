package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        int n = (int) ((b - a) / delta);
        double sumEvenPoints = 0, sumOddPoints = 0, firstPoint = function.applyAsDouble(a + delta),
                lastPoint = function.applyAsDouble(b - delta);

        for (int i = 1; i < n; i++) {
            double point = function.applyAsDouble(a + delta * i);

            if (i % 2 == 0) {
                sumEvenPoints += point;
            } else {
                sumOddPoints += point;
            }
        }

        double result = sumEvenPoints * 2 + sumOddPoints * 4 + firstPoint + lastPoint;
        result *= delta / 3;

        return result;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        if (a < 10) {
            return 1;
        }

        long currentValue = a;
        byte maxNumber = 0;
        byte maxNumberIndex = 0;
        byte index = 0;

        while (currentValue >= 10) {
            byte currentNumber = (byte) (currentValue % 10);
            currentValue = currentValue / 10;

            if (currentNumber >= maxNumber) {
                maxNumber = currentNumber;
                maxNumberIndex = index;
            }

            index++;
        }

        if (currentValue >= maxNumber)  {
            maxNumberIndex = index;
        }

        return (byte) (index - maxNumberIndex + 1);
    }

    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double a = y1 - y2;
        double b = x2 - x1;
        double c = x1 * y2 - x2 * y1;

        double y3 = (-a * x3 - c) / b;

        return y3;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double s1 = Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2d;
        double s2 = Math.abs((x1 - x4) * (y3 - y4) - (x3 - x4) * (y1 - y4)) / 2d;

        return s1 + s2;
    }

}
