package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double s = 0;
        while (a <= b) {
            s += function.applyAsDouble(a) * delta;
            a += delta;
        }
        return s;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        byte length = (byte) Math.ceil(Math.log10(a));
        byte max = 0;
        byte i = 1;
        byte index = 1;

        while (i <= length) {
            if (max <  a / (long) Math.pow(10, (long) (length) - i) % 10) {
                max = (byte) (a / (long) Math.pow(10, (long) (length) - i) % 10);
                index = i;
            }
            a = a - (a / (long) Math.pow(10, (long) (length) - i) % 10) * (long) Math.pow(10, (long) (length - i));
            i++;
        }
        return index;
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
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));      //Стороны
        double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double c = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        double d = Math.sqrt(Math.pow((x1 - x4), 2) + Math.pow((y1 - y4), 2));
        double k1 = Math.sqrt(Math.pow((x3 - x1), 2)+Math.pow((y3 - y1), 2));       //Диагональ AC

        double p1 = (a + b + k1) / 2;
        double s1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - k1));                //ABC
        double p2 = (k1 + d + c) / 2;
        double s2 = Math.sqrt(p2 * (p2 - k1) * (p2 - d) * (p2 - c));                //ACD

        if (a < k1 && d > k1 || d < k1 && a > k1) {                                 //Проверка на выпуклость
            return s1 - s2;
        } else {
            return s1 + s2;
        }
    }

}
