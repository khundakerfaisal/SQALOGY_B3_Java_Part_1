package Java_Class_3;

public class accessModifier {



    public String name;
    private int age;
    protected String city;
    String Country;
    public static void main(String[] args) {

        accessModifier accessModifier=new accessModifier();
        System.out.println(accessModifier.name="Raihan");
        System.out.println(accessModifier.age=25);
        System.out.println(accessModifier.city="Dhaka");
        System.out.println(accessModifier.Country="Bangladesh");

    }
}

class accessCheck{

    public static void main(String[] args) {
        accessModifier ap=new accessModifier();
        System.out.println(ap.name="Barsha");
        System.out.println(ap.city="Cumilla");
        System.out.println(ap.Country="Bangladesh");
    }
}
