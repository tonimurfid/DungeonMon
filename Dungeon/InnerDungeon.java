package Dungeon;

import HomeBase.HomeBase;
import app.DungeonMon;
import Backend.Dungeon;
import Backend.Element;
import Backend.Item;
import Backend.ItemElement;
import Backend.Monster;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Creates new form Dungeon
 */
public class InnerDungeon extends javax.swing.JFrame {
    public static String playerEarth = "battle_asset/player_earth.gif";
    public static String playerFire = "battle_asset/player_fire.gif";
    public static String playerWater = "battle_asset/player_water.gif";
    public static String playerWind = "battle_asset/player_wind.gif";
    public static String playerIce = "battle_asset/player_ice.gif";

    public static String enemyEarth = "battle_asset/enemy_earth.gif";
    public static String enemyFire = "battle_asset/enemy_fire.gif";
    public static String enemyWater = "battle_asset/enemy_water.gif";
    public static String enemyWind = "battle_asset/enemy_wind.gif";
    public static String enemyIce = "battle_asset/enemy_ice.gif";
    private Dungeon dungeon;
    private List<Monster> chosenMonsters;
    private Monster playerMonster;
    private Monster enemyMonster;
    private JLabel playerImageLabel;
    private JLabel enemyImageLabel;

    public InnerDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
        initComponents();
        setLocationRelativeTo(null); // Set JFrame to center of screen
        chosenMonsters = new ArrayList<>();
        chooseMonstersPopup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Layer1Dung = new javax.swing.JLayeredPane();
        attackButton = new javax.swing.JButton();
        ElementAttackButton = new javax.swing.JButton();
        SpecialAttackButton = new javax.swing.JButton();
        itemButton = new javax.swing.JButton();
        fleeButton = new javax.swing.JButton();
        ExploreButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        playerImageLabel = new javax.swing.JLabel();
        enemyImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 530));
        setResizable(false);

        Layer1Dung.setPreferredSize(new java.awt.Dimension(1020, 520));

        attackButton.setText("Attack");
        attackButton.setEnabled(false);
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        ElementAttackButton.setText("Element Attack");
        ElementAttackButton.setEnabled(false);
        ElementAttackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElementAttackButtonActionPerformed(evt);
            }
        });

        SpecialAttackButton.setText("Special Attack");
        SpecialAttackButton.setEnabled(false);
        SpecialAttackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialAttackButtonActionPerformed(evt);
            }
        });

        itemButton.setText("Item");
        itemButton.setEnabled(false);
        itemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButtonActionPerformed(evt);
            }
        });

        fleeButton.setText("Flee");
        fleeButton.setEnabled(false);
        fleeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fleeButtonActionPerformed(evt);
            }
        });

        ExploreButton.setText("Explore");
        ExploreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExploreButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        // Set preferred size for jScrollPane2
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon("Dungeon/innerDungeon.png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1020, 520));

        playerImageLabel.setBounds(550, 150, 200, 200); // Position and size for the player's Pokemon image
        enemyImageLabel.setBounds(350, 150, 200, 200); // Position and size for the enemy monster image

        Layer1Dung.setLayer(attackButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(ElementAttackButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(SpecialAttackButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(itemButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(fleeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(ExploreButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(ExitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(jScrollPane2, javax.swing.JLayeredPane.POPUP_LAYER);
        Layer1Dung.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer1Dung.setLayer(playerImageLabel, javax.swing.JLayeredPane.POPUP_LAYER);
        Layer1Dung.setLayer(enemyImageLabel, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout Layer1DungLayout = new javax.swing.GroupLayout(Layer1Dung);
        Layer1Dung.setLayout(Layer1DungLayout);
        Layer1DungLayout.setHorizontalGroup(
            Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layer1DungLayout.createSequentialGroup()
                .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Layer1DungLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Layer1DungLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ElementAttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpecialAttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fleeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExploreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Layer1DungLayout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
            .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Layer1DungLayout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(playerImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(800, Short.MAX_VALUE)))
            .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layer1DungLayout.createSequentialGroup()
                    .addContainerGap(820, Short.MAX_VALUE)
                    .addComponent(enemyImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        Layer1DungLayout.setVerticalGroup(
            Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layer1DungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpecialAttackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fleeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExploreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ElementAttackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Layer1DungLayout.createSequentialGroup()
                    .addGap(330, 330, 330)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
            .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Layer1DungLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(playerImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
            .addGroup(Layer1DungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Layer1DungLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(enemyImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layer1Dung, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layer1Dung, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        String result = playerMonster.basicAttack(enemyMonster);
        jTextArea2.append(result + "\n");
        checkBattleStatus();
        if (enemyMonster.getHP() > 0) {
            enemyAttack();
        }
    }//GEN-LAST:event_attackButtonActionPerformed

    private void ElementAttackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElementAttackButtonActionPerformed
        String result = playerMonster.elementAttack(enemyMonster);
        jTextArea2.append(result + "\n");
        checkBattleStatus();
        if (enemyMonster.getHP() > 0) {
            enemyAttack();
        }
    }//GEN-LAST:event_ElementAttackButtonActionPerformed

    private void SpecialAttackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialAttackButtonActionPerformed
        String result = playerMonster.specialAttack(enemyMonster);
        jTextArea2.append(result + "\n");
        checkBattleStatus();
        if (enemyMonster.getHP() > 0) {
            enemyAttack();
        }
    }//GEN-LAST:event_SpecialAttackButtonActionPerformed
    
private void enemyAttack() {
    Random random = new Random();
    int attackType = random.nextInt(3);
    String result;
    switch (attackType) {
        case 0:
            result = enemyMonster.basicAttack(playerMonster);
            jTextArea2.append("Enemy: " + result + "\n");
            break;
        case 1:
            result = enemyMonster.elementAttack(playerMonster);
            jTextArea2.append("Enemy: " + result + "\n");
            break;
        case 2:
            result = enemyMonster.specialAttack(playerMonster);
            jTextArea2.append("Enemy: " + result + "\n");
            break;
    }
    checkBattleStatus();
}

private void checkBattleStatus() {
    if (playerMonster.getHP() <= 0) {
        JOptionPane.showMessageDialog(this, "Your monster has fainted. You lost!");
        returnToHomeBase();
    } else if (enemyMonster.getHP() <= 0) {
        playerMonster.setEP(playerMonster.getEP() + 60);
        DungeonMon.player.getHomeBase().storeMonster(enemyMonster);
        JOptionPane.showMessageDialog(this, "Enemy monster has fainted. You won!");
        returnToHomeBase();
    }
}
private void returnToHomeBase() {
    HomeBase home = new HomeBase();
    home.setVisible(true);
    this.setVisible(false);
}

private void itemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemButtonActionPerformed
    List<Item> availableItems = DungeonMon.player.getHomeBase().getListItem();
    
    if (availableItems.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No items available.");
        return;
    }
    
    JDialog dialog = new JDialog(this, "Select an Item", true);
    dialog.setLayout(new BorderLayout());
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(availableItems.size(), 1));
    
    ButtonGroup group = new ButtonGroup();
    JRadioButton[] radioButtons = new JRadioButton[availableItems.size()];
    
    for (int i = 0; i < availableItems.size(); i++) {
        Item item = availableItems.get(i);
        radioButtons[i] = new JRadioButton(item.getName());
        group.add(radioButtons[i]);
        panel.add(radioButtons[i]);
    }
    
    dialog.add(panel, BorderLayout.CENTER);
    
    JButton confirmButton = new JButton("Use Item");
    confirmButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < radioButtons.length; i++) {
                if (radioButtons[i].isSelected()) {
                    Item selectedItem = availableItems.get(i);
                    dialog.dispose();
                    handleItemUse(selectedItem);
                    break;
                }
            }
        }
    });
    
    dialog.add(confirmButton, BorderLayout.SOUTH);
    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}//GEN-LAST:event_itemButtonActionPerformed

private void selectElementForItem(Item item) {
    JDialog dialog = new JDialog(this, "Select Element", true);
    dialog.setLayout(new GridLayout(5, 1));
    ButtonGroup group = new ButtonGroup();
    JRadioButton fireButton = new JRadioButton("FIRE");
    JRadioButton windButton = new JRadioButton("WIND");
    JRadioButton waterButton = new JRadioButton("WATER");
    JRadioButton iceButton = new JRadioButton("ICE");
    JRadioButton earthButton = new JRadioButton("EARTH");

    group.add(fireButton);
    group.add(windButton);
    group.add(waterButton);
    group.add(iceButton);
    group.add(earthButton);

    dialog.add(fireButton);
    dialog.add(windButton);
    dialog.add(waterButton);
    dialog.add(iceButton);
    dialog.add(earthButton);

    JButton confirmButton = new JButton("Confirm");
    confirmButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Element selectedElement = null;
            if (fireButton.isSelected()) {
                selectedElement = Element.FIRE;
            } else if (windButton.isSelected()) {
                selectedElement = Element.WIND;
            } else if (waterButton.isSelected()) {
                selectedElement = Element.WATER;
            } else if (iceButton.isSelected()) {
                selectedElement = Element.ICE;
            } else if (earthButton.isSelected()) {
                selectedElement = Element.EARTH;
            }

            if (selectedElement != null) {
                String result = playerMonster.useItem(enemyMonster, item, selectedElement);
                jTextArea2.append(result + "\n");
                checkBattleStatus();
                if (enemyMonster.getHP() > 0) {
                    enemyAttack();
                }
                dialog.dispose();
            }
        }
    });

    dialog.add(confirmButton);
    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}

    private void handleItemUse(Item item) {
        if (item instanceof ItemElement) {
            selectElementForItem(item);
        } else {
            String result = playerMonster.useItem(enemyMonster, item);
            jTextArea2.append(result + "\n");
            checkBattleStatus();
            if (enemyMonster.getHP() > 0) {
                enemyAttack();
            }
        }
    }


    private void fleeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fleeButtonActionPerformed
        String result = playerMonster.flee();
        jTextArea2.append(result + "\n");
        if(result.equals("Fleeing from battle...")) {
            returnToHomeBase();
        }
        checkBattleStatus();
        if (enemyMonster.getHP() > 0) {
            enemyAttack();
        }
    }//GEN-LAST:event_fleeButtonActionPerformed

    private void ExploreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExploreButtonActionPerformed
        // Implement exploration logic here and update jTextArea2 with the action
        foundMonsterPopup();
    }//GEN-LAST:event_ExploreButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // Implement exit logic here and update jTextArea2 with the action
        HomeBase home = new HomeBase();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void chooseMonstersPopup() {
        List<Monster> availableMonsters = DungeonMon.player.getHomeBase().listMonsters();
        chosenMonsters.clear();
    
        JDialog dialog = new JDialog(this, "Choose 3 Monsters for the Dungeon", true);
        dialog.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(availableMonsters.size(), 1));
    
        JCheckBox[] checkboxes = new JCheckBox[availableMonsters.size()];
    
        for (int i = 0; i < availableMonsters.size(); i++) {
            Monster monster = availableMonsters.get(i);
            checkboxes[i] = new JCheckBox(monster.getName() + " (HP: " + monster.getHP() + ")");
            if (monster.getHP() == 0) {
                checkboxes[i].setEnabled(false);
                checkboxes[i].setToolTipText("This monster has fainted and cannot be selected.");
            }
            panel.add(checkboxes[i]);
        }
    
        dialog.add(panel, BorderLayout.CENTER);
    
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = 0;
                for (int i = 0; i < checkboxes.length; i++) {
                    if (checkboxes[i].isSelected()) {
                        chosenMonsters.add(availableMonsters.get(i));
                        count++;
                    }
                    if (count == 3) break;
                }
                if (count == 3) {
                    dialog.dispose();
                } else {
                    JOptionPane.showMessageDialog(dialog, "Please select exactly 3 monsters.");
                    chosenMonsters.clear();
                }
            }
        });
    
        dialog.add(confirmButton, BorderLayout.SOUTH);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private void foundMonsterPopup() {
        // Implement logic to show popup and select found monster for battle
        enemyMonster = dungeon.getEnemyMonster(); // Assuming this method exists
        JOptionPane.showMessageDialog(this, "A wild monster appeared: " + enemyMonster.getName());
        selectPlayerMonsterForBattle();
    }

    private void selectPlayerMonsterForBattle() {
        JDialog dialog = new JDialog(this, "Select a monster for battle", true);
        dialog.setLayout(new GridLayout(chosenMonsters.size(), 1));
    
        ButtonGroup group = new ButtonGroup();
        JRadioButton[] radioButtons = new JRadioButton[chosenMonsters.size()];
    
        for (int i = 0; i < chosenMonsters.size(); i++) {
            Monster monster = chosenMonsters.get(i);
            radioButtons[i] = new JRadioButton(monster.getName() + " (HP: " + monster.getHP() + ")");
            if (monster.getHP() == 0) {
                radioButtons[i].setEnabled(false);
                radioButtons[i].setToolTipText("This monster has fainted and cannot be selected.");
            }
            group.add(radioButtons[i]);
            dialog.add(radioButtons[i]);
        }
    
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < radioButtons.length; i++) {
                    if (radioButtons[i].isSelected()) {
                        playerMonster = chosenMonsters.get(i);
                        dialog.dispose();
                        enterBattleState();
                        break;
                    }
                }
            }
        });
    
        dialog.add(confirmButton);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private void enterBattleState() {
        // Enable/Disable appropriate buttons for battle state
        attackButton.setEnabled(true);
        ElementAttackButton.setEnabled(true);
        SpecialAttackButton.setEnabled(true);
        itemButton.setEnabled(true);
        fleeButton.setEnabled(true);
        ExploreButton.setEnabled(false);
        ExitButton.setEnabled(false);

        // Set images for player and enemy monsters
        if (playerMonster != null && enemyMonster != null) {
            playerImageLabel.setIcon(new ImageIcon(getPlayerPath(playerMonster))); // Assuming Monster class has getImagePath method
            enemyImageLabel.setIcon(new ImageIcon(getEnemyPath(enemyMonster)));   // Assuming Monster class has getImagePath method
        }
    }
    public String getPlayerPath(Monster playerMonster) {
        String path = "";
        switch (playerMonster.getElement()) {
            case FIRE:
                path = playerFire;
                break;
            case WATER:
                path = playerWater;
                break;
            case EARTH:
                path = playerEarth;
                break;
            case WIND:
                path = playerWind;
                break;
            case ICE:
                path = playerIce;
                break;
            default:
                path = null;
                break;
            }
            return path;
    }
    public String getEnemyPath(Monster enemyMonster) {
        String path = "";
        switch (enemyMonster.getElement()) {
            case FIRE:
                path = enemyFire;
                break;
            case WATER:
                path = enemyWater;
                break;
            case EARTH:
                path = enemyEarth;
                break;
            case WIND:
                path = enemyWind;
                break;
            case ICE:
                path = enemyIce;
                break;
            default:
                path = null;
                break;
        }
        return path;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ElementAttackButton;
    private javax.swing.JButton ExploreButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLayeredPane Layer1Dung;
    private javax.swing.JButton SpecialAttackButton;
    private javax.swing.JButton attackButton;
    private javax.swing.JButton fleeButton;
    private javax.swing.JButton itemButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        // Initialize Dungeon instance or retrieve it from another part of the application
        Dungeon dungeon = DungeonMon.dungeon; // Assuming this constructor exists and is appropriate
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InnerDungeon(dungeon).setVisible(true);
            }
        });
    }
}
