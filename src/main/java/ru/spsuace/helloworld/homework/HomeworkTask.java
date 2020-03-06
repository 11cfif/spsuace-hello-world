package ru.spsuace.helloworld.homework;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        int n= (int) ((b-a)/delta);
        double S=0;
        for(int i=0;i<n+1;i=i+1){
            double x=a+delta*i;
            S=S+ function.applyAsDouble(x);
                }S=S*delta;
                return S;

    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        int count=0;
        int max=0;
        int b=0 ;
        int c=0;
        while (a!=0){
            count=count+1;
            b= (int) (a%10);
            if(b>=max){
                max=b;
                c=count;
                    }a=a/10;
                        }byte i = (byte) (count - c +1);
                            return i;

}


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double a=x3-x2;
        double b= x2-x1;
        double c =y2-y1;
        double y3=((a*c)/b)+y2;
        //double y3=((x3-x2)*(y2-y1) /(x2-x1))+y2;
        return y3;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 0;
    }

}
