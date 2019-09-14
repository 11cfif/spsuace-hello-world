package ru.spsuace.helloworld.task1;


import com.sun.javafx.runtime.async.AbstractRemoteResource;

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
    public static int sum(int n)
    {
        if(n>0)
            return sum(n - 1) + n;
        return 0;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom)
    {
        if((top - bottom <= 0) && (height > top))
            return  Integer.MAX_VALUE;

        int days =0, passed = 0;
        while(true)
        {
            days++;
            passed+=top;
            if(passed>=height)
                break;
            passed-=bottom;
        }

        return days;
    }


    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order)
    {
        for(int i = 1; i < order; i++)
            n = n / 10;
        return Math.abs(n % 10);
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n)
    {
        if (n <= 1)
            return 1;
        return  factorial((byte)(n -1)) *n;
    }
}
