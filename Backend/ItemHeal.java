package Backend;

public class ItemHeal extends Item {

    private int effect = 15;
    private int maxUsed = 2;

    public ItemHeal(String nama, String type) {
        super(nama, type);
    }
    @Override
    public String getEffect(Monster monster, Monster target) {
        String s = "";
        if(maxUsed > 0) {
            monster.setHP(monster.getHP() + effect);
            s += "Heal " + effect + " HP to " + monster.getName();
            maxUsed--;
        }else{
            s += "Item ini sudah habis";
        }
        return s;
    }
    @Override
    public String getEffect(Monster monster, Monster target, Element element) {
        return null;
    }
    
}
