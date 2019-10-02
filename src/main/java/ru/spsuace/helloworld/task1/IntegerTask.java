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
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n--;
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
       int days = 0;
       long rise = 0;
        if (top >= height) {
            return 1;
        } else {
            if (top <= bottom) {
                return Integer.MAX_VALUE;
            } else {
                while (rise < height - bottom) {
                    days ++;
                    rise += top;
                    rise -= bottom;
                }
            return days;
            }
        }
   }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */

    public static int kDecimal(int n, int order) {
        return (int) (Math.abs(n) % Math.pow(10, order)) / (int) (Math.pow(10, order - 1));
    }

    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long res = 1;
        if (n == 1 || n == 0) {
            return res;
        } else {
            for (int i = 1; i <= n; i++) {
                res = res * i;
            }
            return res;
        }
    }
}
