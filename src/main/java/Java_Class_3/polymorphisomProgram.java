package Java_Class_3;

public class polymorphisomProgram {
    public static void main(String[] args) {

        car car =new car();
        car.wheel();

        cycle cycle=new cycle();
        cycle.wheel();
    }
}

class vehicle{
    public void wheel(){
        System.out.println("Vehicle has wheel");
    }
    public void sound(){
        System.out.println("Vehicle has sound");
    }
}

class car extends vehicle{
    public void wheel(){
        System.out.println("Car has 4 wheel");
    }

    public  void sound(){
        System.out.println("Car has horn");
    }
}
class cycle extends vehicle{
    public void wheel(){
        System.out.println("Cycle has 2 wheel");
    }
}
