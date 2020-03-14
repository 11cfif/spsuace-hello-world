package ru.spsuace.helloworld.task1;


/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    public IntegerTask() {
    }

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

        if (height <= top)
        return 1 ;{
        }
        if (top <= bottom) {
            return Integer.MAX_VALUE;
        }
        int position = 0;
        int day = 1;
        for (; position < height; day++) {
            position += top;
            if (position >= height) {
                return day;
            }

            position -= bottom;
        }
        return day;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int count = 0;
        int h = 0;
        int g = 0;
        int s;
        int numer = n;
        while (numer != 0) {
            count++;
            s = numer % 10;
            if (count == order) {
                h = Math.abs(s);
            }
            numer /= 10;
        }
        return h;
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long result = 1;
        for (byte i = 1; i <= n; i++) {
            result = (long) (result * i);
        }
        return result;
    }


}
