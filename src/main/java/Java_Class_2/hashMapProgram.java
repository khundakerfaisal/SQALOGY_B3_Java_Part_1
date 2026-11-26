package Java_Class_2;

import java.util.Arrays;
import java.util.HashMap;

public class hashMapProgram {
    public static void main(String[] args) {
        HashMap<String,Integer> fruitsPrice=new HashMap<>();

        fruitsPrice.put("Apple",380);
        fruitsPrice.put("Guava",80);
        fruitsPrice.put("Dragon",150);
        fruitsPrice.put("Banana",10);


        System.out.println(fruitsPrice.get("Guava"));

    }
}
