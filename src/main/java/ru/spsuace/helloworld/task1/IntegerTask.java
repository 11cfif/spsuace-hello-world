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
        sum = n * (n + 1) / 2;
        return sum;

    }


    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int t = 0;
        if (top >= height) {
            t = 1;
        } else if (height > top ){
            if (top<= bottom) {
                t = Integer.MAX_VALUE;
            } else if (top> bottom){
                while (height>0){
                    t= t+1;
                    height=height-top;
                    if (height<= 0){
                        break;
                    }else height=height+bottom;
                }
            }
        }
        return t;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int m = Math.abs(n);
        int res = (int)(m % Math.pow(10,order)/Math.pow(10, order - 1));
        return res;
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long s = 1;
        for(int i = 1; i<= n; i++) {
            s *= i;
        }

        return s;
    }
}
