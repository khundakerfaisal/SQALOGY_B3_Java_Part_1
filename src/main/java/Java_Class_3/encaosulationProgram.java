package Java_Class_3;

public class encaosulationProgram {

    public String name;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    private  int nid;


    public static void main(String[] args) {

        encaosulationProgram ep=new encaosulationProgram();
        System.out.println(ep.name="Naieem");


        ep.setNid(484656);


        System.out.println(ep.getNid());

    }
}
