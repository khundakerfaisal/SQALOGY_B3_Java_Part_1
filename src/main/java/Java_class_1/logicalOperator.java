package Java_class_1;

import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input age : ");
        int age=sc.nextInt();

        if (age<18){
            System.out.println("Your are not eligible to enter the site !!!");
        }
        else {
            System.out.println("Congratulation!! you enter the correct age");
        }
    }


}
