package ru.spsuace.helloworld.task1;

import java.lang.Math;
/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int days = 1;
        int way = 0;
        if (bottom >= top) {
            if (bottom <= height) {
                return Integer.MAX_VALUE;
            }
            else {
                return 1;
            }
        }
        do {
            way += top;
            if (way >= height) {
                break;
            }
            way -= bottom;
            days++;
        } while (height >= way);
        return days;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int absn = Math.abs(n);
        int ten = (int) Math.pow(10, order);
        int result1 = absn % ten ;
        int ten2 = (int) Math.pow(10, order-1);
        return result1 / ten2 ;
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long result = 1;
        for (int factorial = 2; factorial <=n; factorial++) {
            result = result * factorial;
        }
        return result;
    }
}
