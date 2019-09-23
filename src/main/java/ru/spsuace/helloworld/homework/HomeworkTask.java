package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double I = 0;
        double i = a + delta/2;
        while (i < b) {
            I = function.applyAsDouble(i - delta / 2) + 4 * function.applyAsDouble(i) + function.applyAsDouble(i + delta / 2) + I;
            i = i + delta;
        }
        return delta/6 * (I);
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long b=0;
        byte numb = 0, maxnumb=0;
        while (a != 0) {
            numb = (byte) (numb + 1);
            if ((a % 10) >= b) {
                b = (a % 10);
                maxnumb=numb;
            }
            a = a / 10;
        }
        return (byte) (numb-maxnumb+1);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) (x1 * y2 - x2 * y1 + y1 * x3 - y2 * x3) / (x1 - x2);
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double i = (double) (x1 * y2 + x2 * y3 + x3 * y4 + x4 * y1 - x2 * y1 - x3 * y2 - x4 * y3 - x1 * y4) / 2;
        if (i < 0) {
            i = -i;
        }
        return i;
    }

}
