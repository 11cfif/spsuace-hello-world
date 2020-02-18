package ru.spsuace.helloworld.homework.task1;


import static java.lang.String.*;

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

        while (way < height) {
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
        if (n < 0) {
            n *= -1;
        }
        String str1 = valueOf(n);
        int count = str1.length();

        StringBuilder str = new StringBuilder(str1);
        str.reverse();
        if (str1.equals("2147483647")) {
            long longN = Long.parseLong(valueOf(str));
            if (order > count) {
                return 0;
            }

            int num1 = (int) Math.pow(10, count - order);

            Long result = (longN / num1) % 10;

            return Integer.parseInt(valueOf(result));
        } else {
            n = Integer.parseInt(valueOf(str));
            if (order > count) {
                return 0;
            }

            int num1 = (int) Math.pow(10, count - order);
            int result = (n / num1) % 10;

            System.out.println("результат" + result);
            return result;
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
