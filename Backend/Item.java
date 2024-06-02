package Backend;

import java.io.Serializable;

public abstract class Item implements Serializable{

    private String name;
    private String type;
    private int effect;
    private int maxUsed;

    public Item(String nama, String type) {
        this.name = nama;
        this.type = type;
    }
    public abstract String getEffect(Monster monster, Monster target);

    public abstract String getEffect(Monster monster, Monster target, Element element);
    public String getName() {
        return name;
    }
    public int getMaxUsed() {
        return maxUsed;
    }
    public String getType() {
        return type;
    }
    public void printItem() {
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
    }
}
