package Java_class_1;

import java.util.Scanner;

public class tryCatchProgram {
    public static void main(String[] args) {

        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Input the number : ");
            int value=sc.nextInt();
            System.out.println("Value is "+ value);
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }



    }
}
