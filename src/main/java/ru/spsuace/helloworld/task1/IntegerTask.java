package ru.spsuace.helloworld.task1;


/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    /**
     * Сумма чисел от 1 до n (1 + 2 + 3 + ... + n)
     * Пример: (5) -> 15
     */
    public static int sum(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int day = 0;
        for (int Up = 0; ; ) {
            day++;
            Up = Up + top;
            if (Up >= height) {
                return day;
            }
            Up = Up - bottom;
            //придумать что-нибудь ещё
            if (Up <= 0) {
                return Integer.MAX_VALUE;
            }
        }
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int res = 0;
        double a = 0;
        double b = 0;
        double remains = 0;
        if (n < 0) {
            n = -n;
        }
        for (int degree = 1; degree <= order; degree++) {
            a = n / Math.pow(10, degree);
            b = Math.floor(a);
            remains = (a - b);
            remains = remains + 0.00001;
            remains = remains * 10;
            res = (int) Math.floor(remains);
        }
        return res;
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        if (n == 0) {
            return 1;
        }
        long res = n;
        for (int i = n - 1; i > 0; --i) {
            res = res * i;
        }
        return res;
    }
}
