package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double simpsonInt = 0;
        double step = a + (delta / 2);
        do {
            simpsonInt = simpsonInt + function.applyAsDouble(step + delta / 2)
                    + (4 * function.applyAsDouble(step))
                    + function.applyAsDouble(step - delta / 2);
            step += delta;
        } while (step < b);
        return (delta / 6) * simpsonInt;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {

        byte maxLocation = 0;
        long maxNum = 0;
        byte length = (byte) Math.ceil((double) Math.log10(a));
        if (length == 0) {
            return 1;
        }
        for (byte location = 1; location <= length; location++) {

            long beforeLocation = (long) (Math.abs(a) % Math.pow(10, length - location + 1));
            long afterLocation = (long) Math.pow(10, length - location);
            if (maxNum < (beforeLocation / afterLocation)) {
                maxNum = beforeLocation / afterLocation;
                maxLocation = location;
            }
        }
        return maxLocation;
    }

    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) (x3 - x1) / (x2 - x1) * (y2 - y1) + y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double intervalAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
        double intervalAD = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow(y4 - y1, 2));
        double intervalCD = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow(y4 - y3, 2));
        double intervalAC = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow(y3 - y1, 2));
        double intervalBC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow(y3 - y2, 2));
        double perimeterABC = (intervalAB + intervalAC + intervalBC) / 2;
        double perimeterACD = (intervalAC + intervalCD + intervalAD) / 2;
        double areaABC = Math.sqrt(perimeterABC * (perimeterABC - intervalAB) *
                (perimeterABC - intervalAC) * (perimeterABC - intervalBC));

        double areaACD = Math.sqrt(perimeterACD * (perimeterACD - intervalAC) *
                (perimeterACD - intervalAD) * (perimeterACD - intervalCD));

        return areaABC + areaACD;
    }

}
