package ru.spsuace.helloworld.task1;

/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    public static int sum(int n) {
        return (n * (n+1) / 2);
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int i = 0;
        if (height == top) {
            return 1;
        }
        if (top > bottom) {
        while (height > top) {
             height = height - ( top - bottom );
            i++;
        }
        return i + 1;
        }
        else {
            return Integer.MAX_VALUE;
        }

    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int i = 0;
        int j = 0;
        if ( n < 0 ) {
            n = Math.abs(n);
        }
        while (n != 0) {
            i = n % 10;
            n /= 10;
            j++;
            if (j == order) {
                break; }
        }
        return i;
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }


    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(factorial(4));
        System.out.println(kDecimal(1234, 2));
        System.out.println(snake(10, 10, 199));
    }
}
