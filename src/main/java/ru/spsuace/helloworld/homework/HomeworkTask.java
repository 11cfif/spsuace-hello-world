package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {

        int n = 0;
        double f = 0;
        double m = 0;
        n = (int) ((b - a)/delta);

        for (int i = 0; i <= n; i++) {
            f = f + function.applyAsDouble(a + delta * i) ;
        }
        f = f * delta ;
        return f;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long f = 0;
        long max_top = 0;
        String dc = Long.toString(a);
        a = Math.abs(a);

        for (int i = 0; ; i++) {
            f = a % 10;
            a = a / 10;
            if (max_top < f) {
                max_top = f;
            }
            if (a == 0) {
                break;
            }
        }
        String ef = Long.toString(max_top);
        byte t  = (byte)(dc.indexOf(ef) + 1);
        //dc.indexOf(ef)
        return t;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {

        double a, b, y3;
        a = (double)(y2-y1)/(x2-x1);
        b = y1 - a * x1;
        y3 = a * x3 + b;

        return y3;
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
