package Java_class_1;

import java.util.Scanner;

public class userNameInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Name : ");
        String firstName = sc.nextLine();

        System.out.println("Input Second Name :");
        String secondName = sc.nextLine();

        System.out.println("Input last Name :");
        String lastName = sc.nextLine();

        System.out.println("Full name is : " + firstName + " " + secondName + " " + lastName);
    }
}
