package Java_Class_2;

public class maxProgram {
    public static void main(String[] args) {
        int [] number1={20,60,50,40};
        int [] number2={70,50,30};

        int maxValue1=0;
        int maxValue2=0;

        for (int i=0;i<number1.length;i++){
            if (number1[i]>maxValue1){
                maxValue1=number1[i];
            }
        }

        for (int j=0;j<number2.length;j++){
            if (number2[j]>maxValue2){
                maxValue2=number2[j];
            }
        }


        System.out.println(Math.max(maxValue1,maxValue2));

    }
}
