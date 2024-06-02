package Backend;

public interface Battle {
    public String basicAttack(Monster target);
    public String elementAttack(Monster target);
    public String specialAttack(Monster target);
    public String useItem(Monster target, Item item);
    public String flee();
}
