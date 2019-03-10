package ru.spsuace.helloworld.task1;


/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    public static void main(String[] args) {
        int rez = sum(7);
        System.out.println("Задание 1. Ответ: " + rez);

        int t = snake(10,3,2);
        System.out.println("Задание 2. Ответ: " + t);

        int k = kDecimal(454355, 3);
        System.out.println("Задание 3. Ответ: " + k);

        long f = factorial((byte) 5);
        System.out.println("Задание 4. Ответ: " + f);
    }

    /**
     * Сумма чисел от 1 до n (1 + 2 + 3 + ... + n)
     * Пример: (5) -> 15
     */
    public static int sum(int n) {
        int s=0;
        for (int i = 1 ; i <= n ; i++ ) {
            s += i;
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
        int hp = top - bottom;//высота подъёма за сутки
        int time;
        if ( hp > 0 ) {
            int pos = height - top; //высота, пройденная до последнего подъема
            time = (pos / hp) + 1; // время подъема

        } else {

            time = Integer.MAX_VALUE;
        }
        return time;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        int[] c = new int[10];
        int i=0;
       for (int a = n; a > 0; a/=10){
           c[i] = n % 10;
           n /= 10;
           i++;
       }
        return c[order-1];
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f*i;
        }
        return f;
    }
}
