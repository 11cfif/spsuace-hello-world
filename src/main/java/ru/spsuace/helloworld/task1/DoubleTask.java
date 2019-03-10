package ru.spsuace.helloworld.task1;

import ru.spsuace.helloworld.Main;

/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class DoubleTask {

    public static void main(String[] args) {
        String rez = equation(1, -3, 2);
        System.out.println("Задание 1. Ответ: " + rez);
        double R = length(1, -3, 2, 0);
        System.out.println("Задание 2. Ответ: " + R);
    }


        /**
         * Вывести два корня квадратного уравнения через запятую: a * x ^ 2 + b * x + c = 0;
         * Вывод менять не нужно, надо только посчитать x1 и x2, где x1 > x2
         * Пример: (1, 5, 4) -> "-1.0, -4.0"
         */
    public static String equation(double a, double b, double c) {
        double D = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        return x1 + ", " + x2;
    }

    /**
     * Нужно посчитать расстояние, между двумя точками (x1, y1) и (x2, y2)
     * Пример: (0, 0, 3, 4) -> 5.0
     */
    public static double length(double x1, double y1, double x2, double y2) {
        double r = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return r;
    }
}
