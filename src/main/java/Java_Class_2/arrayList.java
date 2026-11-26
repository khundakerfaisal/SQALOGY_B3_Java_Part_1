package Java_Class_2;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("jack fruits");
        fruits.add("Lichhi");
        fruits.add("Dragon");

        fruits.remove("jack fruits");
        System.out.println(fruits);

//        System.out.println(fruits.get(2));
    }
}
