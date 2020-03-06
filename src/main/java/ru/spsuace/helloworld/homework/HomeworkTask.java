package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        //считаю методом трапеции, x1 это левая координата отрезка, x2 соответственно правая
        double x1 = a;
        double x2 = a + delta;
        double sum = 0;
        for (; x2 < b; ) {
            sum += function.applyAsDouble(x1) + function.applyAsDouble(x2);
            x1 += delta;
            x2 += delta;
        }
        return sum * delta / 2;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        // сначала находится количество цифр n, потом максимальное число number, а потом его порядок order(НЕ работает)
        byte order = 1;
        byte n = 1;
        byte number = 0;
        byte i = 1;
        for (; a - Math.pow(10, n) < 0; n++) {
        }
        n=15;
        for (; i == n; i++) {
            if ((byte) (a % Math.pow(10, i) / Math.pow(10, i - 1)) > number) {
                number = (byte) (a % Math.pow(10, i) / Math.pow(10, i - 1));
            }
        }
       i = 1;
        for (; i == n; n--) {
            if ((byte) (a % Math.pow(10, n) / Math.pow(10, n - 1)) == number) {
                break;
            }
            order++;
        }
        return order;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double)(x3-x1)*(y2-y1)/(x2-x1)+y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        //Площадь любого многоугольника определяется по формуле: Area= |((x1y2-y1x2)+ (x2y3-y2x3)...+ (xny1-ynx1) ) / 2|
        double s=(x1*y2-y1*x1)+(x2*y3-y2*x3)+(x3*y4-y3*x4)+(x4*y1-y4*x1);
        return Math.abs(s)/2;
    }

}
