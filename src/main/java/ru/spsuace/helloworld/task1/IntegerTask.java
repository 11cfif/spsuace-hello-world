package ru.spsuace.helloworld.task1;


/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    public static void main(String[] args) {
        System.out.println(sum(5));

        System.out.println(snake(10,3,2));

        System.out.println(kDecimal(454355,4));

        System.out.println(factorial(5));
    }
    /**
     * Сумма чисел от 1 до n (1 + 2 + 3 + ... + n)
     * Пример: (5) -> 15
     */
    public static int sum(int n) {
        int s = 0;
        while (n>0){
            s=s+n;
            n--;
        }
        return s;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        if (bottom >= top)
            return Integer.MAX_VALUE;
        return height/(top-bottom)+height%(top-bottom);
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        return n/(int)Math.pow(10, order-1)%10;

    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(int n) {
        int s = 1;
        while (n>0){
            s=s*n;
            n--;
        }
        return s;
    }
}
