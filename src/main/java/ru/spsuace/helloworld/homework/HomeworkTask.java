package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
     double n = (b-a)/delta;
     double i = n;
     double q = 0;
     for (i=0; i<=n; i++) {
         q = q+function.applyAsDouble(a+i*delta);
     }
        return q*delta;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        double max = 0;
        double p = 0;
        long numb = a;
        while (numb != 0) {
            p = numb % 10;
            if (p>max) {
                max = p;
            }
        }
        return (byte) max;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double y3 = (y2 - y1)*(x3-x1)/(x2-x1)+y1;
        return y3;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double AB = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double BC = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double CD = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        double DA = Math.sqrt((x4 - x1) * (x4 - x1) + (y4 - y1) * (y4 - y1));
        double AC = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        double p1 = (AB+BC+AC)/2;
        double S1 = Math.sqrt(p1*(p1-AB)*(p1-BC)*(p1-AC));

        double p2 = (AC+CD+DA)/2;
        double S2 = Math.sqrt(p2*(p2-AC)*(p1-CD)*(p1-DA));
        return S1+S2;
    }

}
