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
        return n * (n + 1) / 2;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int d = 0;
        if (top >= height) {
            d = 1;
        } else if (height > top) {
            if (top <= bottom) {
                d = Integer.MAX_VALUE;
            } else if (top > bottom) {
                while (height > 0) {
                    d = d + 1;
                    height = height - top;
                    if (height <= 0) {
                        break;
                    } else height = height + bottom;
                }
            }
        }
        return d;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int k = 0;
        int c = 0;
        int p = 0;
        int numb = n;
        while (numb != 0) {
            k++;
            p = numb % 10;
            if (k == order) {
                c = Math.abs(p);
            }
            numb /= 10;
        }
        return c;
    }

    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long res = 1;
        for (long i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}
