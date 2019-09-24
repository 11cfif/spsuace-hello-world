package ru.spsuace.helloworld.homework;

import java.util.Collection;
import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        int n = (int) ((b - a) / delta);
        double valueOfY = 0;
        double valueOfX = a;
        for (int i = 0; i < n; i++) {
            valueOfY += function.applyAsDouble(valueOfX);
            valueOfX += delta;
        }
        return valueOfY * delta;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {

        long max = 0;
        long numberNew = a;
        long num = a;
        byte j = 1;
        byte index = j;
        int lengthOfNumber = Long.toString(a).toCharArray().length;
        do {
            if (((num /= Math.pow(10, lengthOfNumber -= 1)) >= max) && (num != max)) {
                max = num;
                index = j;
            }
            numberNew %= Math.pow(10, lengthOfNumber);
            num = numberNew;
            j++;
        } while (num != 0);

        return index;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) ((y2 - y1) * (x3 - x1)) / (x2 - x1) + y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 0;
    }
}
