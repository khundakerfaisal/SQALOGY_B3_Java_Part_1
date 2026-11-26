package Java_Class_2;

import java.util.Arrays;

public class sortArrayProgram {
    public static void main(String[] args) {
        int [] values={10,9,12,15,18,25};

        for (int i=0;i<values.length-1;i++){
            for (int j=i+1;j<values.length;j++){
               if (values[i]>values[j]){
                   int temporary=values[i];
                   values[i]=values[j];
                   values[j]=temporary;
               }
            }
        }
        System.out.println(Arrays.toString(values));

    }

}
