package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double funcParameter = a;
        double result = 0;
        while (funcParameter <= b) {
            result += function.applyAsDouble(funcParameter) * delta;
            funcParameter += delta;
        }
        return result;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long remainder = a;
        long result = a;
        int counterAll = 0;
        int counterMax = 0;
        long maxValue = 0;
        while (result != 0) {
            remainder = result % 10;
            result = result / 10;
            counterAll += 1;
            if (remainder >= maxValue) {
                maxValue = remainder;
                counterMax = counterAll;
            }
        }
        return (byte) (counterAll - counterMax + 1);
    }
    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (((y2 - y1) * (x3 - x1)) / (double) (x2 - x1)) + y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double lengthBetweenTwoPoints (int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double lengthAB = lengthBetweenTwoPoints(x1, y1, x2, y2);
        double lengthBC = lengthBetweenTwoPoints(x2, y2, x3, y3);
        double lengthCD = lengthBetweenTwoPoints(x3, y3, x4, y4);
        double lengthDA = lengthBetweenTwoPoints(x1, y1, x4, y4);
        double lengthAC = lengthBetweenTwoPoints(x1, y1, x3, y3);
        double smallPerimetrABC = (lengthAB + lengthBC + lengthAC) / 2;
        double smallPerimetrACD = (lengthAC + lengthCD + lengthDA) / 2;
        double spaceTriangleABC = Math.sqrt(smallPerimetrABC * (smallPerimetrABC - lengthAB) * (smallPerimetrABC - lengthBC) * (smallPerimetrABC - lengthAC));
        double spaceTriangleACD = Math.sqrt(smallPerimetrACD * (smallPerimetrACD - lengthCD) * (smallPerimetrACD - lengthDA) * (smallPerimetrACD - lengthAC));
        return spaceTriangleABC + spaceTriangleACD;
    }

}
