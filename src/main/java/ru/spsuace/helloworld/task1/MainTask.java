package ru.spsuace.helloworld.task1;

public class MainTask {

    /**
     * Сделать так, чтобы класс компилировался, при раскомментировании метода ниже
     * Так же, надо сделать так, что бы при запуске этого класса печаталась строка "It is work."
     */
    public static void main(String[] args) {
        System.out.println("It is work.");
        System.out.println("equation(1,5,4)="+DoubleTask.equation(1,5,4));
        System.out.println("length(0,0,3,4)="+DoubleTask.length(0,0,3,4));
        System.out.println("factorial(5)="+IntegerTask.factorial(5));
        System.out.println("kDecimal(454355,3)="+IntegerTask.kDecimal(454355,3));
        System.out.println("snake(10,3,2)="+IntegerTask.snake(10,3,2));
        System.out.println("sum(5)="+IntegerTask.sum(5));



    }
}
