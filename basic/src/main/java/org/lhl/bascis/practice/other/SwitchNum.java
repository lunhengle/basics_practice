package org.lhl.bascis.practice.other;

import java.lang.reflect.Field;

/**
 * 交换数据.
 * a =1 b=2
 * 交换后 变成 b=1 a=2
 * @author lunhengle
 */
public class SwitchNum {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        System.out.println("before==== a= " + a + " b= " + b);
        swap(a, b);
        System.out.println("after==== a= " + a + " b = " + b);
    }

    private static void swap(Integer num1, Integer num2) {
        try {
            Field field = Integer.class.getDeclaredField("value");
            field.setAccessible(true);
            int temp = num1;
            field.set(num1, num2);
            field.setInt(num2, temp);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
