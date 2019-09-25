package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        int n = (int) ((b-a) / delta);
        double result = 0;
        for (int i = 0; i <= n; i++)
        {
            result = result+function.applyAsDouble(a + delta * i);
        }
        result *= delta;
        return result;

    }


    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        a = Math.abs(a);
        int length = String.valueOf(a).length();
        long[] result = new long[length];

        for(int i = 0; i < length; i++) {
            long res = a % 10;
            result[length - i - 1] = res;
            a /= 10;
        }
        long max = -1;
        int nomer = 0;
        for (int j = 0; j < length; j++) {
            if (result[j] > max) {
                max = result[j];
                nomer = j + 1;
            }
        }
        return (byte) nomer;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) (double) ((x3 - x1) * (y2 - y1)) / (x2 - x1) + y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь правильного
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 0;
    }

}
