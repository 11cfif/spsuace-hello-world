package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        if (a > b) {
            double k = b;
            b = a;
            a = k;
        }
        double sum = 0;
        for (int i = 0; i < (b - a) / delta; i++) {
            sum += delta * (0.5 * (function.applyAsDouble(a + i * delta) + function.applyAsDouble(a + (i + 1) * delta)));
        }
        if (!Double.isNaN(sum)) {
            return sum;
        } else {
            System.out.println("Отрезок интегрирования не входит в область определения подыинтегральной функции");
            return 0;
        }
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long a1;
        int kolNumber = 0;
        int indexMaxNumber = 0;
        long maxNum = 0;
        while (a != 0) {
            a1 = a % 10;
            a /= 10;
            kolNumber++;
            if (a1 >= maxNum) {
                maxNum = a1;
                indexMaxNumber = kolNumber;
            }
        }
        ;
        return (byte) (kolNumber - indexMaxNumber + 1);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) ((x3 - x1) * (y2 - y1) + y1 * (x2 - x1)) / (x2 - x1);
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь правильного
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (Math.abs(x1 * y2 + x2 * y3 + x3 * y4 + x4 * y1 - x2 * y1 - x3 * y2 - x4 * y3 - x1 * y4)) / 2;
    }


}


