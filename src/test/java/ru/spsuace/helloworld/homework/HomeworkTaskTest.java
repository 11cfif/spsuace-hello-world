package ru.spsuace.helloworld.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTaskTest {

    @Test
    public void calcIntegral() {
        assertEquals( 1000.0 / 3.0, HomeworkTask.calcIntegral(0, 10, x -> x * x, 1e-4), 1e-2);
        assertEquals( 50.0, HomeworkTask.calcIntegral(0, 10, x -> x , 1e-4), 1e-2);
        assertEquals( 0.0,  HomeworkTask.calcIntegral(-10, 10, x -> x, 1e-4),1e-2);
        assertEquals( 2200.0,  HomeworkTask.calcIntegral(-10, 10, x -> 3 * x * x - 5 * x + 10, 1e-5),1e-2);
        assertEquals( 0,  HomeworkTask.calcIntegral(-Math.PI, Math.PI, Math::sin, 1e-5),1e-2);
        assertEquals( 60,  HomeworkTask.calcIntegral(-10, 10, x -> 3, 1e-5),1e-2);
        assertEquals( -1.08,  HomeworkTask.calcIntegral(-10, 10, Math::cos, 1e-6),1e-2);
        assertEquals( 20,  HomeworkTask.calcIntegral(-10, 10, x -> Math.sin(x) * Math.sin(x) + Math.cos(x) * Math.cos(x), 1e-4),1e-2);
    }

    @Test
    public void maxNumber() {
        assertEquals( 2, HomeworkTask.maxNumber(892347384743343L));
        assertEquals( 1, HomeworkTask.maxNumber(99999999999999L));
        assertEquals( 1, HomeworkTask.maxNumber(0L));
        assertEquals( 1, HomeworkTask.maxNumber(1L));
        assertEquals( 2, HomeworkTask.maxNumber(12L));
        assertEquals( 7, HomeworkTask.maxNumber(62467293));
        assertEquals( 5, HomeworkTask.maxNumber(62467237));
    }

    @Test
    public void lineFunction() {
        assertEquals( 10, HomeworkTask.lineFunction(0, 0, 3, 3, 10),  1e-2);
        assertEquals( 0, HomeworkTask.lineFunction(0, 0 , 2, 3, 0), 1e-2);
        assertEquals( 1, HomeworkTask.lineFunction(0, 0, -2, 2, 3), 1e-2);
        assertEquals( 1, HomeworkTask.lineFunction(1, 1, 23, 1, 3), 1e-2);
        assertEquals( 18, HomeworkTask.lineFunction(25, 28, -1, -2, 3), 1e-2);
    }
}