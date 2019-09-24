package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double space = 0;
        for (int step = 1; step < (b - a) / delta; step++) {
            space += delta * function.applyAsDouble(((a + (delta * step)) + (a + (delta * (step + 1)))) / 2);
        }
        return space;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long max = 0;
        byte maxPosition = 0;
        byte length = (byte) Math.ceil(Math.log10(a));
        if (length == 0) {
            return 1;
        }
        for (byte position = 1; position <= length; position++) {
            long beforePosition = (long) (Math.abs(a) % Math.pow(10, length - position + 1));
            long afterPosition = (long) Math.pow(10, length - position);
            if (max < (beforePosition / afterPosition)) {
                max = beforePosition / afterPosition;
                maxPosition = position;
            }
        }
        return maxPosition;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double a = (double) (y1 - y2) / (x1 - x2);
        double b = (double) y1 - a * x1;
        double res = a * x3 + b;
        return res;
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
