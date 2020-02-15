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

        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        System.out.println(result);
        return result;

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

        if (top >= height) {
            System.out.println(days);
            return days;
        }

        if (bottom >= top) {
            return Integer.MAX_VALUE;
        }

        while (way < height){
            way += top;
            if (way >= height) {
                System.out.println(days);
                return days;
            }
            way -= bottom;
            days++;
        }

        System.out.println(days);
        return days;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {

        int count = 0;
        int result = 1;
        double value = 1;
        int j = n;

        while (j >= 1){
            count++;
            j /= 10;
        }

        if (order > count) {
            return Integer.MAX_VALUE;
        }

        for (int i = 1; i <= order; i++) {
            result *= 10;
        }

        value = (double) n / result;
        int res1 = (int)value;

        if (value == 1 && order < count) {
            return 0;
        }

        if (res1 != 0) {
            double res2 = value - res1;

            if (res2 <= 0) {
                while (true) {
                    value *= 10;
                    if ((int) value != 0) {
                        System.out.println(value);
                        return (int) value;
                    }
                }
            }

            result = result / 10;
            res2 = res2 / result;

            value = (int) res2;

            System.out.println(value);
            return (int) value;
        } else {

            while (true) {
                value *= 10;
                if ((int) value != 0) {
                    System.out.println((int)value);
                    return (int) value;
                }
            }
        }
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long result = 1L;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
        return result;
    }
}
