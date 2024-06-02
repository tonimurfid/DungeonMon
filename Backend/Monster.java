package Backend;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public abstract class Monster implements Battle, Serializable{
    protected String name;
    protected int level;
    protected int maxEvolve = 1;
    protected int HP;
    protected int EP;
    protected int atkPower;
    protected int specialAtkPower;
    protected int elementAtkPower;
    protected Element element;

    // CREATE MONSTER
    public Monster(String name) {
        this.name = name;
        this.level = 1;
        this.HP = 120;
        this.EP = 50;
        this.atkPower = 10;
        this.specialAtkPower = 23;
        this.elementAtkPower = 30;
    }
    // EVOLVE MONSTER
    public Monster(String name, int level, int HP, int EP, int atkPower, int specialAtkPower, int elementAtkPower) {
        this.name = name;
        this.level = level;
        this.maxEvolve = 0;
        this.HP = HP;
        this.EP = EP;
        this.atkPower = atkPower;
        this.specialAtkPower = specialAtkPower;
        this.elementAtkPower = elementAtkPower;
    }
    public void useMaxEvolve() {
        if (this.maxEvolve > 0) {
            this.maxEvolve--;
        }
    }
    public void addMaxEvolve() {
        this.maxEvolve++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHP(int HP) {
        int maxHP = 100 + (this.level * 20);
        this.HP = Math.min(HP, maxHP);
        this.HP = Math.max(HP, 0);
    }
    public void setLevel(int level) {
        this.level = Math.min(level, 99);
    }

    public void setElementAtkPower(int elementAtkPower) {
        this.elementAtkPower = elementAtkPower;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxEvolve() {
        return maxEvolve;
    }

    public int getHP() {
        return HP;
    }

    public int getEP() {
        return EP;
    }

    public int getAtkPower() {
        return atkPower;
    }

    public int getSpecialAtkPower() {
        return specialAtkPower;
    }

    public int getElementAtkPower() {
        return elementAtkPower;
    }

    public Element getElement() {
        return element;
    }

    public void levelUp() {
        this.level++;
        this.HP = 100 + (this.level * 20);
        this.EP -= 100;
        this.maxEvolve = 1;
        this.atkPower += 7;
        this.specialAtkPower += 5;
        this.elementAtkPower += 5;
    }
    public Monster evolveToFire() {
        return null;
    }
    public Monster evolveToWind() {
        return null;
    }
    public Monster evolveToEarth() {
        return null;
    }
    public Monster evolveToWater() {
        return null;
    }
    public Monster evolveToIce() {
        return null;
    }
    public void setEP(int EP) {
        this.EP = EP;
    }
    public void heal(){
        this.HP = 100 + (this.level * 20);
        System.out.println(this.getName() + " has been healed");
    }
    @Override
    public String basicAttack(Monster target) {
        target.setHP(target.getHP() - this.getAtkPower());
        String s = (this.getName() + " used Basic Attack on " + target.getName() + " with " + this.getAtkPower() + " damage");
        s += "\n" + target.getName() + " has " + target.getHP() + " HP left";
        return s;
    }

    @Override
    public String specialAttack(Monster target) {
        Random random = new Random();
        int chance = random.nextInt(5)+1;
        String s ="";
        if(chance > 3) {
            target.setHP(target.getHP() - this.getSpecialAtkPower());
            this.setHP((this.getHP()*90/100));
            s += this.getName() + " used Special Attack on " + target.getName() + " with " + this.getSpecialAtkPower() + " damage";
            s += "\n" + target.getName() + " has " + target.getHP() + " HP left";
        }else{
            s += this.getName() + " failed to use Special Attack on " + target.getName();
        }
        return s;
    }
    @Override
    public String elementAttack(Monster target) {
        int elementAttackPower = this.getElementAtkPower();
        String s = "";
        switch (this.getElement()) {
            case EARTH:
                if(target instanceof Water){
                    elementAttackPower = (int) (elementAttackPower * 1.2);
                }
                break;
            case WATER:
                if(target instanceof Fire){
                    elementAttackPower = (int) (elementAttackPower * 1.2);
                }
                break;
            case FIRE:
                if(target instanceof Ice){
                    elementAttackPower = (int) (elementAttackPower * 1.2);
                }
                break;
            case ICE:
                if(target instanceof Wind){
                    elementAttackPower = (int) (elementAttackPower * 1.2);
                }
                break;
            case WIND:
                if(target instanceof Earth){
                    elementAttackPower = (int) (elementAttackPower * 1.2);
                }
                break;
        }
        if(this.getEP() < 10) {
            return "EP not enough";
        }
        this.setHP(this.getHP() - 10);
        target.setHP(target.getHP() - elementAttackPower);
        s += this.getName() + " used Element Attack on " + target.getName() + " with " + elementAttackPower + " damage";
        s += "\n" + target.getName() + " has " + target.getHP() + " HP left";
        return s;
    }
    public String useItem(Monster target, Item item, Element element) {
        String s = "";
        s += "Item used: " + item.getName();
        s += "\n" + item.getEffect(this, target, element);
        return s;
    }
    @Override
    public String useItem(Monster target, Item item) {
        String s = "";
        s += "Item used: " + item.getName();
        s += "\n" + item.getEffect(this, target);
        return s;
    }

    @Override
    public String flee() {
        Random random = new Random();
        int chance = random.nextInt(5)+1;
        if(chance > 3) {
            return ("Fleeing from battle...");
        }else{
            return ("Failed to flee from battle...");
        }
    }
}
