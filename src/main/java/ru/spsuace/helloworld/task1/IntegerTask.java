package ru.spsuace.helloworld.task1;


/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    public static void main(String[]args){

        System.out.println(sum(5)); //Проверка первого задания

        System.out.println(snake(1, 3, 4)); //Проверка второго задания

        System.out.println(kDecimal(454355, 4)); //Проверка третьего задания

        System.out.println(factorial((byte) 5)); //Проверка четвертого задания

    }
    /**
     * Сумма чисел от 1 до n (1 + 2 + 3 + ... + n)
     * Пример: (5) -> 15
     */

    public static int sum(int n) {

        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
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

        int i = 0; //Начала отсчета
        int day = 0; //Количество дней

        if (top >= height) {
            return 1;
        }

        if (top <= bottom) {
            return Integer.MAX_VALUE;
        }

        while (i < height) {

            if (day > 0) {
                i -= bottom; //Ночь
            }

            i += top; //День
            day++;
        }
        return day;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        //int N = String.valueOf(Math.abs(n)).length(); //Количество разрядов в числе
        int result = 0;

        for (int i = 1; i <= order; i++) {

           // result = Math.abs((n % (int)Math. pow(10, i))/(int)Math. pow(10, i - 1));

            //Первоначальный вариант
            result = Math.abs(n % (int) Math.pow(10, i));
            n -= result;
            //System.out.println(n + " " + result );
            result /= (int) Math.pow(10, i - 1);

        }

        return result;
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {

        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
