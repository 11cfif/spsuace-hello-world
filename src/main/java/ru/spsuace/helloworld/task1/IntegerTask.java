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
    //public static int sum(int n) {
      //  return 0;
    //}

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int DefHT = height - top;
        int DayRun = top - bottom;
        int SumDays = 1;
                if (height == 0){
                    return Integer.MAX_VALUE;
                }
                if (top == 0){
                    return Integer.MAX_VALUE;
                }
                if (DefHT < 0){
                    return SumDays = 1;
                }
                if (DayRun < 0){
                    return Integer.MAX_VALUE;
                }
                return SumDays = 1 + (DefHT / DayRun);


   }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    //public static int kDecimal(int n, int order) {
        //return 0;
    //}


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        //byte result = 1;
        // (byte i = 1; i <= n; i ++){
            //result = (byte) (result * i);
        //}
        //return result;
        if (n == 0) return 1;
        return n * factorial((byte) (n - 1));
    }
    public static void main(String[] args){
        System.out.println(factorial((byte) 12));
    }
}
