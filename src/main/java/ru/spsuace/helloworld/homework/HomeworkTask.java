package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double sum=0;
        for (double i = a; i< b;i = i + delta){
         sum+=function.applyAsDouble(i);
        }
        return delta*sum;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        int max=0;
        int maxNum=0;
        int numeral=0;
        for(int i =  String.valueOf(Math.abs(a)).length();i>0;--i) {
            numeral= (int) Math.abs(a % 10);
            if (numeral>=max){
                max=numeral;
                maxNum=i;
            }
            a=a/10;
        }
        return (byte) maxNum;
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        int x12=x2-x1;
        int y12=y2-y1;
        double x13=x3-x1;
       double k=x13/x12;
        return k*y12+y1;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int x12=x2-x1;
        int y12=y2-y1;
        int x23=x3-x2;
        int y23=y3-y2;
        int x34=x4-x3;
        int y34=y4-y3;
        int x41=x4-x1;
        int y41=y4-y1;
        double firstSide=Math.sqrt(Math.pow(x12,2)+Math.pow(y12,2));
        double secondSide=Math.sqrt(Math.pow(x23,2)+Math.pow(y23,2));
        double thirdSide=Math.sqrt(Math.pow(x34,2)+Math.pow(y34,2));
        double fourthSide=Math.sqrt(Math.pow(x41,2)+Math.pow(y41,2));
        double halfPerimeter=(firstSide+secondSide+thirdSide+fourthSide)/2;
        return Math.sqrt((halfPerimeter-firstSide)*(halfPerimeter-secondSide)*(halfPerimeter-thirdSide)*(halfPerimeter-fourthSide));
    }

}
