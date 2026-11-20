package Java_class_1;

public class breakContinueProgram {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Value is :" + i);
        }
    }
}
