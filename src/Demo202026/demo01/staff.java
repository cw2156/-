package Demo202026.demo01;

public class staff {
    private  String name ;
    private  int  ID;

    public staff(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }


    public staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void method(){
        System.out.println("员工");
    }
}
