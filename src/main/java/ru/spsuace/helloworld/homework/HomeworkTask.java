package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double S = 0;
        for (double x = a; x < b; x = x + delta) {
            S += function.applyAsDouble(x);
        }
        return S * delta;
    }


    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        int count = 0;
        long iA = a;
        while (a != 0) {
            count++;
            a /= 10;
        }
        int[] array = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            array[i] = (int) (iA % 10);
            iA /= 10;
        }
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[k]) {
                k = i;
            }
        }
        return (byte) (k + 1);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        int x12 = x2 - x1;
        int y12 = y2 - y1;
        double x13 = x3 - x1;
        double j = x13 / x12;
        return j * y12 + y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double S = Math.abs(x1 * y2 + x2 * y3 + x3 * y4 + x4 * y1 - x2 * y1 - x3 * y2 - x4 * y3 - x1 * y4);
        return S / 2;
    }

}
