package app;

import Backend.Player;
import Home.HomeScreen;
import Backend.*;

public class DungeonMon {
    public static Player player = new Player("");
    public static Dungeon dungeon = new Dungeon(player.getHomeBase(), player.getHomeBase().getListItem());
    public static Monster waterMonster = new Water("Aquarion");
    public static Monster fireMonster = new Fire("Blazetalon");
    public static Monster earthMonster = new Earth("Terraquake");
    public static Monster windMonster = new Wind("Galehawk");
    public static Monster iceMonster = new Ice("Frosthorn");

    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.setVisible(true);
        homeScreen.setLocationRelativeTo(null);
        System.out.println("Welcome to the Dungeon-Mon game!");
    }
}
