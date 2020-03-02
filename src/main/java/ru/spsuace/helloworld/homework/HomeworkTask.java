package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double res = 0;
        for (a += delta; a <= b; a += delta) {
            res += function.applyAsDouble(a) * delta;
        }
        return res;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        double var = a;
        int num = 0;
        for (long order = 1; order <= a; num++) {
            order *= 10;
            var = a;
            var /= order;
        }
        int[] arr = new int[num + 1];
        for (int m = 1; m <= num; m++) {
            arr[m] = (int) Math.floor(var *= 10);
            var = var - Math.floor(var);
            if (var == 0.19999999999999996) {
                var += 0.000001;
            }
        }
        byte res = 1;
        int var2 = 0;
        for (byte m = 1; m <= num; m++) {
            if (var2 < arr[m]) {
                var2 = arr[m];
                res = m;
            }
        }
        return res;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) ((x3 * y2) - (x3 * y1) - (x1 * y2) + (x1 * y1) + (x2 * y1) - (x1 * y1)) / (x2 - x1);
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (double) Math.abs((x1 * y2 - x2 * y1) + (x2 * y3 - x3 * y2) + (x3 * y4 - x4 * y3) + (x4 * y1 - x1 * y4)) / 2;
    }

}
