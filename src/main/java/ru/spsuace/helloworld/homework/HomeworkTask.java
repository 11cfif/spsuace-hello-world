package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta)
    {
        double sum = 0;
        for (double i = a; i < b; i += delta) {
            sum += function.applyAsDouble(i) * delta;
        }
        return sum;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        byte maxNumber = 0;
        int number;
        byte invertResult = 0;
        byte i;
        for(i = 1; true; i++)
        {
            number = (int) a % 10;
            if (number >= maxNumber)
            {
                maxNumber = (byte) number;
                invertResult = i;
            }
            if( a < 10) {
                break;
            } else {
                a /= 10;
            }
        }
        return (byte)(i + 1 - invertResult);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        ToDoubleFunction<Integer> line = x -> (x - x1) * (y2 - y1) / (x2 - x1) + y1;
        return line.applyAsDouble(x3);
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
