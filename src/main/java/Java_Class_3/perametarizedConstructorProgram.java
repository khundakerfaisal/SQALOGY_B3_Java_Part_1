package Java_Class_3;

public class perametarizedConstructorProgram {

    int overtime;

    public perametarizedConstructorProgram(int overtime){
        this.overtime=overtime;
    }

    public int getSalary(int salary,int hour){
      return salary*hour+overtime;
    }


    public static void main(String[] args) {

        perametarizedConstructorProgram perametarizedConstructorProgram=new perametarizedConstructorProgram(2000);
        int grossSalary=perametarizedConstructorProgram.getSalary(3000,8);

        System.out.println(grossSalary);

    }
}
