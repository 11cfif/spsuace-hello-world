package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double result = 0;

        for (int i = 0; i < (int) ((b - a) / delta); i++) {
            result += function.applyAsDouble(a + delta * i);
        }
        result *= delta;
        return result;

    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        return 0;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double a = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - a * x1;
        return a * x3 + b;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double ab = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double bc = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double cd = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        double da = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
        double ac = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double pp1 = (ab + bc + ac) / 2;
        double pp2 = (ac + cd + da) / 2;
        double tr1 = Math.sqrt((pp1) * (pp1 - ab) * (pp1 - bc) * (pp1 - ac));
        double tr2 = Math.sqrt((pp2) * (pp2 - ac) * (pp2 - cd) * (pp2 - da));

        return tr1 + tr2;

    }

}
