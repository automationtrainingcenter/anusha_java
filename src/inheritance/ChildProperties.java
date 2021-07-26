package inheritance;

public class ChildProperties extends ParentProperties{

    /* if parent class contains parameterized constructor only then child also must contain parameterized constructor*/
    String panNum;

    public ChildProperties(int id, String name, String address) {
        super(id, name, address);
    }

    public ChildProperties(int id, String name, String address, String panNum) {
        this(id, name, address);
        this.panNum = panNum;
    }
}
