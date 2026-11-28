package Java_Class_3;

public class overloadingProgram {

    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a, int b,int c){
        return a+b+c;
    }

    public int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        overloadingProgram overloadingProgram=new overloadingProgram();
        int grossAmount=overloadingProgram.sum(10,20,40);

        System.out.println(grossAmount);
    }
}
