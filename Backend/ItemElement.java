package Backend;

public class ItemElement extends Item {

    private int effect = 20;
    private int maxUsed = 1;

    public ItemElement(String nama, String type) {
        super(nama, type);
    }
    @Override
    public String getEffect(Monster user, Monster target, Element elementType) {
        String s = "";
        if(maxUsed == 0){
            s += "Item ini sudah habis";
            return s;
        }
    switch (elementType) {
        case EARTH:
            if(target instanceof Water){
                effect *= 1.5;
            }
            break;
        case WATER:
            if(target instanceof Fire){
                effect *= 1.5;
            }
            break;
        case FIRE:
            if(target instanceof Ice){
                effect *= 1.5;
            }
            break;
        case ICE:
            if(target instanceof Wind){
                effect *= 1.5;
            }
            break;
        case WIND:
            if(target instanceof Earth){
                effect *= 1.5;
            }
            break;
        default:
            break;
    }
    target.setHP(target.getHP() - effect);
    s += user.getName() + " used Item Element on " + target.getName() + " with " + effect + " damage";
    s += "\n" + target.getName() + " has " + target.getHP() + " HP left";
    maxUsed--;
    return s;
    }
    @Override
    public String getEffect(Monster monster, Monster target) {
        return getEffect(monster, target, null);
    }
}
