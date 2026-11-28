package Java_Class_3;

public class abstractProgram {

    public static void main(String[] args) {
        Mango mango=new Mango();
        System.out.println(mango.taste());


        Lemon lemon=new Lemon();
        System.out.println(lemon.taste());
    }
}


abstract class Fruite{
    abstract String taste();
}

class Mango extends Fruite{
    String taste(){
        return "Mango is sweet";
    }
}

class Lemon extends Fruite{
    String taste(){
        return "Lemon is sour";
    }
}