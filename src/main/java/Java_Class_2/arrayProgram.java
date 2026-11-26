package Java_Class_2;

import java.util.Arrays;

public class arrayProgram {
    public static void main(String[] args) {

        int [] arrNumber={20,25,10,30,15,12,40};

        Arrays.sort(arrNumber);

        for (int i=0;i<arrNumber.length;i++){
            System.out.println(arrNumber[i]);
        }

    }
}
