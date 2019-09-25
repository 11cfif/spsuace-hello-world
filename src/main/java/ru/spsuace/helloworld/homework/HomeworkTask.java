package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        int n = (int) ((b - a) / delta);
        double sum = function.applyAsDouble(a) + function.applyAsDouble(b);
        for (int i = 1; i < n; i++) {
            sum += 2 * function.applyAsDouble(a + delta * i);
        }
        return sum * delta / 2;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long temp = a;
        int maxIndex = 1;
        int currentIndex = 1;
        int maxDigit = (int) temp % 10;
        while (temp > 10) {
            temp = temp / 10;
            currentIndex++;
            int currentDigit = (int) temp % 10;
            if (currentDigit >= maxDigit) {
                maxIndex = currentIndex;
                maxDigit = currentDigit;
            }
        }
        return (byte) (currentIndex - maxIndex + 1);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double y3;
        y3 = (double) ( x3 - x1 ) / ( x2 - x1 ) * ( y2 - y1 ) + y1;
        return y3;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double distAB = distance(x1, y1, x2, y2);
        double distAC = distance(x1, y1, x3, y3);
        double distBC = distance(x3, y3, x2, y2);
        double distAD = distance(x1, y1, x4, y4);
        double distCD = distance(x3, y3, x4, y4);
        double p1 = (distAB + distAC + distBC) / 2;
        double p2 = (distAC + distCD + distAD) / 2;
        double areaABC = Math.sqrt(p1 * (p1 - distAB) * (p1 - distAC) * (p1 - distBC));
        double areaACD = Math.sqrt(p2 * (p2 - distAC) * (p2 - distAD) * (p2 - distCD));
        return areaABC + areaACD;
    }

    private static double distance(int x1 , int y1, int x2, int y2) {
        return  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
