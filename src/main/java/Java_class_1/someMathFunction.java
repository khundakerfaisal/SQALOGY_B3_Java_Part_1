package Java_class_1;

import java.util.Random;

public class someMathFunction {
    public static void main(String[] args) {
        double number = 20;
        double number2 = 40;

        double number3=60.40;

        System.out.println("sqrt value is : " + Math.sqrt(number2));

        System.out.println("Max value is : " + Math.max(number, number2));

        System.out.println("Min value is : " + Math.min(number, number2));

        System.out.println("Round Value is : " + Math.round(number3));

        System.out.println("Floor value is : " +Math.floor(number3));

        System.out.println("Ceil value is : " +Math.ceil(number3));


        System.out.println("Random value is :" +Math.random()*1000);


    }
}
