package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerHomebase implements Serializable {
    List<Monster> petMonsters;
    List<Monster> copyMonsters = new ArrayList<>();
    List<Item> itemList = new ArrayList<>();

    public PlayerHomebase() {
        this.petMonsters = new ArrayList<>();
    }

    public List<Monster> listMonsters() {
        return petMonsters;
    }
    public void showMonsters() {
        System.out.println("Your monsters:");
        for (Monster monster : petMonsters) {
            System.out.println(monster.getName());
            System.out.println(monster.getElement());
        }
    }
    public void showItems() {
        System.out.println("Your items:");
        for (Item item : itemList) {
            System.out.println(item.getName());
        }
    }

    public void storeMonster(Monster monster) {
        petMonsters.add(monster);
    }

    public void removeMonster(Monster monster) {
        petMonsters.remove(monster);
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

public void copy() {
    for(Monster m : petMonsters) {
        copyMonsters.add(m);
    }
}
    public void healing() {
        for (Monster m : petMonsters) {
            m.heal();;
        }
    }
    
    public List<Item> getListItem(){
        return itemList;
    }

    public void levelUp(Monster monster) {
        if(monster.getEP() >= 100) {
            monster.setEP(monster.getEP() - 100);
            monster.levelUp();
            monster.addMaxEvolve();
            System.out.println(monster.getName() + " level up!");
        }else {
            System.out.println("Not enough EP");
        }
    }
    
    public void exploreDungeon() {
        Dungeon dungeon = new Dungeon(this, itemList);
        // dungeon.explore();
    }
    
    public Item buyItem(Monster monster, EnumItem type) throws EnumNotFoundException {
        Scanner input = new Scanner(System.in);
        int EP = 0;
        showMonsters();
        System.out.println("""
                Shop :
                1. Healing Potion (+10 HP) 10 EP
                2. Elixir (+20 EP) 20 EP
                """);
        
        switch (type) {
            case HEALING_ITEM:
                    if(monster.getEP() >= 10) {
                        monster.setEP(monster.getEP() - 10);
                    itemList.add(new ItemHeal("Healing Potion", "Heal"));
                    }else {
                        System.out.println("Not enough EP");
                    }
                break;
            case ELEMENT_ITEM:
                if(itemList.size() < 4) {
                    if(monster.getEP() >= 20) {
                        monster.setEP(monster.getEP() - 20);
                        itemList.add(new ItemElement("Elemental Grenade", "Elemental"));
                    }else {
                        System.out.println("Not enough EP");
                    }
                }
                break;
            default:
                throw new EnumNotFoundException("Invalid input");
        }
        return null;
    }
}
