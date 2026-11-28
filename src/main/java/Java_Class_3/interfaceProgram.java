package Java_Class_3;

public interface interfaceProgram {

    void turnOn();
    void turnOff();
}

class Engine implements interfaceProgram{
    public void turnOn(){
        System.out.println("Vehicle engine turn on");
    }

    public void turnOff(){
        System.out.println("Vehicle engine turn off");
    }
}

class Main{
    public static void main(String[] args) {
        Engine engine=new Engine();
        engine.turnOn();
        engine.turnOff();
    }
}


