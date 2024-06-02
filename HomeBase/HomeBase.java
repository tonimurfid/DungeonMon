package HomeBase;

import Dungeon.*;
import Home.HomeScreen;
import Backend.*;
import app.DungeonMon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Creates new form HomeBase
 */
public class HomeBase extends javax.swing.JFrame {


    public static Monster selectedMonster;
    public HomeBase() {
        initComponents();
        setLocationRelativeTo(null); // Center the window on the screen
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        btn_evo = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        btn_saveGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon("HomeBase/homebg.png")); // NOI18N

        jToggleButton1.setText("Heal");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Level Up");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        btn_evo.setText("Evolve");
        btn_evo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn_evoActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Shop");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("Dungeon");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        btn_saveGame.setText("Save Game");
        btn_saveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn_saveGameActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jToggleButton1, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(jToggleButton2, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(btn_evo, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(jToggleButton4, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(jToggleButton5, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(btn_saveGame, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_evo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_saveGame, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_saveGame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_evo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        DungeonEnter enter = new DungeonEnter();
        enter.setVisible(true);
        setVisible(false);
    }

    private void btn_evoActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Monster> monsters = (ArrayList<Monster>) DungeonMon.player.getHomeBase().listMonsters();
    
        // Create dialog to display monsters
        JDialog dialog = new JDialog(this, "Select Monster to Evolve", true);
        dialog.setSize(300, 400);
        dialog.setLocationRelativeTo(this);
    
        // Create list of monsters with their details
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Monster monster : monsters) {
            listModel.addElement(monster.getName() + " - Level: " + monster.getLevel() + " - EP: " + monster.getEP() + " - Max Evolves: " + monster.getMaxEvolve());
        }
        JList<String> monsterList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(monsterList);
    
        // Create evolve button
        JButton evolveButton = new JButton("Evolve");
        evolveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = monsterList.getSelectedIndex();
                if (selectedIndex != -1) {
                    selectedMonster = monsters.get(selectedIndex);
    
                    // Check if the monster can evolve
                    if (selectedMonster.getMaxEvolve() <= 0) {
                        JOptionPane.showMessageDialog(dialog, "This monster cannot evolve again at this level.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
    
                    // Show current element
                    String currentElement = selectedMonster.getElement().getName();
                    JOptionPane.showMessageDialog(dialog, "Current Element: " + currentElement, "Current Element", JOptionPane.INFORMATION_MESSAGE);
    
                    JDialog evolveDialog = new JDialog(dialog, "Evolve Options", true);
                    evolveDialog.setSize(300, 200);
                    evolveDialog.setLocationRelativeTo(dialog);
                    JButton evolveToFirstOption = new JButton();
                    JButton evolveToSecondOption = new JButton();
                    int index = DungeonMon.player.getHomeBase().listMonsters().indexOf(selectedMonster);
                    
                    // Implement evolution logic based on the current monster type
                    if (selectedMonster instanceof Wind) {
                        evolveToFirstOption.setText("Evolve to Water");
                        evolveToSecondOption.setText("Evolve to Fire");
                        evolveToFirstOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToWater(), evolveDialog, dialog));
                        evolveToSecondOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToFire(), evolveDialog, dialog));
                    } else if (selectedMonster instanceof Water) {
                        evolveToFirstOption.setText("Evolve to Wind");
                        evolveToSecondOption.setText("Evolve to Ice");
                        evolveToFirstOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToWind(), evolveDialog, dialog));
                        evolveToSecondOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToIce(), evolveDialog, dialog));
                    } else if (selectedMonster instanceof Ice) {
                        evolveToFirstOption.setText("Evolve to Earth");
                        evolveToSecondOption.setText("Evolve to Water");
                        evolveToFirstOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToEarth(), evolveDialog, dialog));
                        evolveToSecondOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToWater(), evolveDialog, dialog));
                    } else if (selectedMonster instanceof Fire) {
                        evolveToFirstOption.setText("Evolve to Wind");
                        evolveToSecondOption.setText("Evolve to Earth");
                        evolveToFirstOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToWind(), evolveDialog, dialog));
                        evolveToSecondOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToEarth(), evolveDialog, dialog));
                    } else if (selectedMonster instanceof Earth) {
                        evolveToFirstOption.setText("Evolve to Fire");
                        evolveToSecondOption.setText("Evolve to Ice");
                        evolveToFirstOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToFire(), evolveDialog, dialog));
                        evolveToSecondOption.addActionListener(evt -> evolveMonster(selectedMonster, index, selectedMonster.evolveToIce(), evolveDialog, dialog));
                    }
    
                    evolveDialog.setLayout(new GridLayout(1, 2));
                    evolveDialog.add(evolveToFirstOption);
                    evolveDialog.add(evolveToSecondOption);
                    evolveDialog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(dialog, "Please select a monster.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    
        // Layout setup
        dialog.setLayout(new BorderLayout());
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(evolveButton, BorderLayout.SOUTH);
    
        dialog.setVisible(true);
    }
    
    // Helper method to evolve monster and update UI
    // Helper method to evolve monster and update UI
    private void evolveMonster(Monster selectedMonster, int index, Monster evolvedMonster, JDialog evolveDialog, JDialog dialog) {
        // Kurangi maxEvolve dari monster yang dipilih
        if (selectedMonster.getMaxEvolve() <= 0) {
            JOptionPane.showMessageDialog(dialog, "This monster cannot evolve again.", "Error", JOptionPane.ERROR_MESSAGE);
            evolveDialog.dispose();
            dialog.dispose();
            return;
        }
        // Ganti monster yang dipilih dengan monster yang berevolusi
        System.out.println("Before evolving: maxEvolve = " + selectedMonster.getMaxEvolve());
        selectedMonster.useMaxEvolve();
        System.out.println("After evolving: maxEvolve = " + selectedMonster.getMaxEvolve());

        DungeonMon.player.getHomeBase().listMonsters().set(index, evolvedMonster);
        evolveDialog.dispose();
        dialog.dispose();
        
        // Tampilkan elemen baru
        String newElement = evolvedMonster.getElement().getName();
        JOptionPane.showMessageDialog(this, "Evolved to " + newElement + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    

// Metode untuk mengurangi maxEvolve dari monster
private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    // Panggil metode healing dari HomeBase
    DungeonMon.player.getHomeBase().healing();

    // Tampilkan pesan bahwa semua monster telah disembuhkan
    JOptionPane.showMessageDialog(this, "All monsters healed!", "Healing Complete", JOptionPane.INFORMATION_MESSAGE);
}

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Monster> monsters = (ArrayList<Monster>) DungeonMon.player.getHomeBase().listMonsters();

        // Create dialog to display monsters
        JDialog dialog = new JDialog(this, "Select Monster to Level Up", true);
        dialog.setSize(300, 400);
        dialog.setLocationRelativeTo(this);

        // Create list of monsters with their details
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Monster monster : monsters) {
            listModel.addElement(monster.getName() + " - Level: " + monster.getLevel() + " - EP: " + monster.getEP());
        }
        JList<String> monsterList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(monsterList);

        // Create level up button
        JButton levelUpButton = new JButton("Level Up");
        levelUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = monsterList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Monster selectedMonster = monsters.get(selectedIndex);
                    if (selectedMonster.getEP() < 100) {
                        JOptionPane.showMessageDialog(dialog, "EP tidak cukup", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        selectedMonster.levelUp();
                        JOptionPane.showMessageDialog(dialog, "Monster leveled up!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        // Update the list display
                        listModel.set(selectedIndex, selectedMonster.getName() + " - Level: " + selectedMonster.getLevel() + " - EP: " + selectedMonster.getEP());
                    }
                } else {
                    JOptionPane.showMessageDialog(dialog, "Please select a monster.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Layout setup
        dialog.setLayout(new BorderLayout());
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(levelUpButton, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }

    private void btn_saveGameActionPerformed(java.awt.event.ActionEvent evt) {
        Player currentPlayer = DungeonMon.player;
        String playerName = currentPlayer.getName();
        String path = "Savegame/" + playerName + ".txt";

        GameManager.saveGame(currentPlayer, path);
        HomeScreen homeScreen = new HomeScreen();
        setVisible(false);
        homeScreen.setVisible(true);
        homeScreen.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HomeBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeBase().setVisible(true);
            }
        });
    }

    private String getElementName(Monster monster) {
        if (monster instanceof Wind) {
            return "Wind";
        } else if (monster instanceof Water) {
            return "Water";
        } else if (monster instanceof Ice) {
            return "Ice";
        } else if (monster instanceof Fire) {
            return "Fire";
        } else if (monster instanceof Earth) {
            return "Earth";
        }
        return "Unknown";
    }
    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Monster> monsters = (ArrayList<Monster>) DungeonMon.player.getHomeBase().listMonsters();

    
        // Create dialog to display monsters
        JDialog dialog = new JDialog(this, "Select Monster for Shopping", true);
        dialog.setSize(300, 400);
        dialog.setLocationRelativeTo(this);
    
        // Create list of monsters with their details
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Monster monster : monsters) {
            listModel.addElement(monster.getName() + " - Level: " + monster.getLevel() + " - EP: " + monster.getEP());
        }
        JList<String> monsterList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(monsterList);
        
        // Create select button
        JButton selectButton = new JButton("Select Monster");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = monsterList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Monster selectedMonster = monsters.get(selectedIndex);
                    dialog.dispose(); // Close the monster selection dialog
                    
                    // Create shop dialog
                    JDialog shopDialog = new JDialog(HomeBase.this, "Shop", true);
                    shopDialog.setSize(300, 200);
                    shopDialog.setLocationRelativeTo(HomeBase.this);
                    
                    // Create item buttons
                    JButton healingPotionButton = new JButton("Healing Potion (+10 HP) 10 EP");
                    JButton elixirButton = new JButton("Elixir (+20 EP) 20 EP");
    
                    healingPotionButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            buyItem(selectedMonster, EnumItem.HEALING_ITEM);
                            shopDialog.dispose(); // Close the shop dialog after purchase
                        }
                    });
    
                    elixirButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            buyItem(selectedMonster, EnumItem.ELEMENT_ITEM);
                            shopDialog.dispose(); // Close the shop dialog after purchase
                        }
                    });
    
                    // Layout setup
                    shopDialog.setLayout(new GridLayout(2, 1));
                    shopDialog.add(healingPotionButton);
                    shopDialog.add(elixirButton);
                    
                    shopDialog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(dialog, "Please select a monster.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                DungeonMon.player.getHomeBase().showItems();
            }
        });
    
        // Layout setup
        dialog.setLayout(new BorderLayout());
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(selectButton, BorderLayout.SOUTH);
    
        dialog.setVisible(true);
    }
    
    // Helper method to handle item purchase
    public void buyItem(Monster monster, EnumItem type) {
        switch (type) {
            case HEALING_ITEM:
                if (monster.getEP() >= 10) {
                    monster.setEP(monster.getEP() - 10);
                    DungeonMon.player.getHomeBase().getListItem().add(new ItemHeal("Healing Potion", "Heal"));
                    JOptionPane.showMessageDialog(this, "Purchased Healing Potion! -10 EP", "Purchase Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Not enough EP", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case ELEMENT_ITEM:
                if (monster.getEP() >= 20) {
                    monster.setEP(monster.getEP() - 20);
                    DungeonMon.player.getHomeBase().getListItem().add(new ItemElement("Elixir", "Elemental"));
                    JOptionPane.showMessageDialog(this, "Purchased Elixir! -20 EP", "Purchase Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Not enough EP", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    

    private javax.swing.JToggleButton btn_evo;
    private javax.swing.JButton btn_saveGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
}
