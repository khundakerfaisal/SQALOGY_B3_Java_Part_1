package Java_Class_3;

public class interitanceProgram {

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.Eat();
        cat.Sound();

    }


}

class Animal{
    public void Eat(){
        System.out.println("Animal can Eat");
    }
    public void Sound(){
        System.out.println("Animal has sound");
    }
}

class Cat extends Animal{

}
