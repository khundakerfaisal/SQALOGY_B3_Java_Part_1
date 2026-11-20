package Java_class_1;

import java.util.Scanner;

public class statementProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int amount=sc.nextInt();

        if (amount>50 ){
            System.out.println("Can Buy cone ice-cream");
        }
        else if (amount>25 & amount<49){
            System.out.println("can buy chock-bar ice-cream");
        }
        else {
            System.out.println("can not enough amount !! Need more money !!!");
        }

    }
}
