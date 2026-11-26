package Java_Class_2;

import java.util.HashSet;

public class hashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> values=new HashSet<>();
        values.add(10);
        values.add(20);
        values.add(10);
        values.add(30);
        System.out.println(values);
    }
}
