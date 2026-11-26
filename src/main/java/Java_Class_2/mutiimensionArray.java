package Java_Class_2;

public class mutiimensionArray {
    public static void main(String[] args) {
        int [][] totalNumber={{10,12},{25,26}};

        for (int i=0;i<totalNumber.length;i++){
            for (int j=0;j<totalNumber.length;j++){
                System.out.println(totalNumber[i][j]);
            }
        }
    }
}
