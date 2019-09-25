package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {

        int step = (int) ( (b - a) / delta );
        double funcIntegarl = 0;

        for (int i = 0; i <= step; i++) {
            funcIntegarl = funcIntegarl + function.applyAsDouble(a + delta * i) ;
        }
        funcIntegarl = funcIntegarl * delta ;
        return funcIntegarl;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long biggest = 0;
        long maxTop = 0;
        String aString = Long.toString(a);
        long current =  Math.abs(a);

        for (int i = 0 ; ; i++) {
            biggest = current % 10;
            current = current / 10;
            if (maxTop < biggest) {
                maxTop = biggest;
            }
            if (a == 0) {
                break;
            }
        }
        String ef = Long.toString(maxTop);
        byte signIndex  = (byte)(aString.indexOf(ef) + 1);

        return signIndex;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {

        double a;
        double b;
        a = (double) (y2 - y1) / (x2 - x1);
        b = y1 - a * x1;
        return a * x3 + b;
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
