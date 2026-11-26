package Java_Class_2;

public class methodProgram {


    public int sumOfAmount(int a, int b) {
        return a + b;
    }

    public static int multiplyStatic(int x, int y) {
        return x * y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int subtract(int c, int d) {
        return c - d;
    }

    public static void main(String[] args) {

        methodProgram values = new methodProgram(); //Create object
        int totalValues = values.subtract(20, 10);
        System.out.println("Total value is :" + totalValues);



        int multiplyValue=multiplyStatic(10,20); //using static method
        System.out.println(multiplyValue);


//        System.out.println(methodProgram.sumOfAmount(10,20));
//        System.out.println(methodProgram.multiply(20,20));


    }
}
