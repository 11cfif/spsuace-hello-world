package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double s;
        double x;
        double step;
        step = (b - a) / delta;
        s = function.applyAsDouble(a) + function.applyAsDouble(b);
        for (int variable = 1; variable <= step - 1; variable += 2) {
            x = a + variable * delta;
            s = s + 4 * function.applyAsDouble(x);
        }
        for (int variable = 2; variable <= step - 2; variable += 2) {
            x = a + variable * delta;
            s = s + 2 * function.applyAsDouble(x);
        }
        return (delta / 3) * s;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long variable  = a;
        long maxNum = 0;
        long digitNum = 0;
        long digitMaxNum = 0;
        long remainder;
        while (variable > 0) {
            remainder = variable % 10;
            variable /= 10;
            digitNum++;
            if (remainder >= maxNum) {
                maxNum = remainder;
                digitMaxNum = digitNum;
            }
        }
        return (byte) (digitNum - digitMaxNum + 1);
    }

    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (((double)(y1 - y2) / (x1 - x2)) * x3 + (y1 -((double)(y1 - y2) / (x1 - x2)) * x1));
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 0.5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y4 + x4 * y1 - x2 * y1 - x3 * y2 - x4 * y3 - x1 * y4);
    }
}
