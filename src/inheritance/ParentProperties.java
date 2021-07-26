package inheritance;

public class ParentProperties {

    int id;
    String name;
    String address;


    public ParentProperties(int id, String name, String address){
        this.id  =id;
        this.name = name;
        this.address = address;
    }

    public void print(){
        System.out.printf("id = %d\nname = %s\naddress = %s\n", id, name, address);
    }
}
