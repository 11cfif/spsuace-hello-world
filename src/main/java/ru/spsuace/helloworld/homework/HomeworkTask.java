package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double s;
        double d;
        double xb;
        double xe;
        double x;
        String t;
        s = 0;
        d = (b - a) / delta;
        xb = a;
        t = String.valueOf(function);
        String(function) = "with (Math) {" + function + "}";
        for(int i = 0; i < delta; i++){
            xe = xb + d;
            x = (xb + xe) / 2;
            s = s + d * eval(function);
            xb = xe;
        }
        t = " Интеграл от " + t  + "  = " + s;
        return t;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        int i = 0;
        byte max = 0;
        int number = 0;
        do {
            i++;
            if (a % 10 >= max)
            {
                max = (byte) (a % 10);
                number = i;
        }
            a /= 10;
        }
        while (a > 0);
        //number = i - number + 1;
        return (byte) i;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return 0;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь правильного
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 0;
    }

}
