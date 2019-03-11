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
        int summa = 0;
        for (int i = 1; i <= n; i++)
            summa += i;
        return summa;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        if (top >= height) {
            return 1;
        } else if (top <= bottom) {
            return Integer.MAX_VALUE;
        }

        /**(height - top) преобразовывается в double
         *после чего делится на (top - bottom)
         */
        int lastdays = 1;
        double days = (double) (height - top) / (top - bottom);
        if (days % 1 > 0) {
            lastdays = 2;
        }

        return (int) days + lastdays;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */


    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int result = Math.abs((n % (int) Math.pow(10, order)) / (int) Math.pow(10, order - 1));
        return result;
    }

    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */

    public static long factorial(byte n) {
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}
