package Backend;

import java.util.*;
import java.util.List;

public class Dungeon{
    private PlayerHomebase homebase;
    private Monster playerMonster;
    private Monster enemyMonster;
    private Scanner input = new Scanner(System.in);
    private Item item ;
    private List<Item> itemList;
    private List<Item> itemEnemy = new ArrayList<>();
    Random random = new Random();

    Monster enemyWater = new Water("Waterion");
    Monster enemyFire = new Fire("Charid");
    Monster enemyEarth = new Earth("Terrabyte");
    Monster enemyWind = new Wind("Flyer");
    Monster enemyIce = new Ice("Iceberg");
    public Monster [] enemy = {enemyWater, enemyFire, enemyEarth, enemyWind, enemyIce};

    public Dungeon(PlayerHomebase homebase, List<Item> itemList) {
        this.homebase = homebase;
        this.itemList = itemList;
    }
    public List<Monster> ChoosenMonster() {
        List<Monster> choosen = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("list monster");
        homebase.showMonsters();
        for (int i = 0; i < 3; i++) {
            System.out.println("Choose monster " + (i+1));
            int choice = input.nextInt();
            if(choice == 0) {
                break;
            }else if(choice > 0 && choice <= homebase.petMonsters.size()) {
                Monster pilihan = homebase.petMonsters.get(choice-1);
                choosen.add(pilihan);
                System.out.println(pilihan.getName() + " added to your team");
            }else{
                System.out.println("Monster not found");
                i--;
            }
        }
        return choosen;
    }
    public Monster getEnemyMonster() {
        for (Monster m : enemy) {
            m.heal();
            m.setLevel(random.nextInt(3) + 1);
        }
        return enemy[random.nextInt(5)];
    }
    public void setPlayerMonster(Monster playerMonster) {
        this.playerMonster = playerMonster;
    }

    
}
