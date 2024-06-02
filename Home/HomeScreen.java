package Home;

import javax.swing.*;
import Backend.GameManager;
import Dungeon.DungeonEnter;
import HomeBase.HomeBase;
import Monster_Selection.PokemonSelection;
import app.DungeonMon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends javax.swing.JFrame {

    public HomeScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabelTitle = new javax.swing.JLabel();
        btn_load = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton(); // New exit button
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(777, 414));
        setMinimumSize(new java.awt.Dimension(777, 414));
        setPreferredSize(new java.awt.Dimension(777, 414));
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(777, 414));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(777, 414));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(777, 414));
        jLayeredPane1.setLayout(null); // Set layout to null for absolute positioning

        int buttonWidth = 120;
        int buttonHeight = 30;
        int xPosition = (jLayeredPane1.getPreferredSize().width - buttonWidth) / 2;

        btn_load.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // Smaller font size
        btn_load.setText("Load Game");
        btn_load.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))); // Thin black border
        btn_load.setOpaque(true);
        btn_load.setBackground(new java.awt.Color(102, 66, 47)); // Set button color
        btn_load.setForeground(new java.awt.Color(255, 255, 255)); // Set text color to white
        btn_load.setPreferredSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_load.setMinimumSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_load.setMaximumSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_load.setBounds(xPosition, 200, buttonWidth, buttonHeight); // Set bounds for button position and size
        btn_load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loadMouseClicked(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // Smaller font size
        btn_save.setText("New Game");
        btn_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))); // Thin black border
        btn_save.setOpaque(true);
        btn_save.setBackground(new java.awt.Color(102, 66, 47)); // Set button color
        btn_save.setForeground(new java.awt.Color(255, 255, 255)); // Set text color to white
        btn_save.setPreferredSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_save.setMinimumSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_save.setMaximumSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_save.setBounds(xPosition, 150, buttonWidth, buttonHeight); // Set bounds for button position and size
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // Smaller font size
        btn_exit.setText("Exit Game");
        btn_exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))); // Thin black border
        btn_exit.setOpaque(true);
        btn_exit.setBackground(new java.awt.Color(102, 66, 47)); // Set button color
        btn_exit.setForeground(new java.awt.Color(255, 255, 255)); // Set text color to white
        btn_exit.setPreferredSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_exit.setMinimumSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_exit.setMaximumSize(new Dimension(buttonWidth, buttonHeight)); // Smaller button size
        btn_exit.setBounds(xPosition, 250, buttonWidth, buttonHeight); // Set bounds for button position and size
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("evolve.png"))); // NOI18N
        jLabelBackground.setMaximumSize(new java.awt.Dimension(777, 414));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(777, 414));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(777, 414));
        jLabelBackground.setBounds(0, 0, 777, 414); // Set bounds for background image

        jLayeredPane1.add(btn_load);
        jLayeredPane1.add(btn_save);
        jLayeredPane1.add(btn_exit);
        jLayeredPane1.add(jLabelBackground);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {
        // This method is not needed as the mouseClicked event is used
    }

    private void btn_loadMouseClicked(java.awt.event.MouseEvent evt) {
        // Create a dialog to display save files
        JDialog dialog = new JDialog(this, "Select Save Game", true);
        dialog.setSize(300, 400);
        dialog.setLocationRelativeTo(this);

        // Get list of save files
        List<String> saveFiles = listSaveFiles("Savegame");

        // Create JList and JScrollPane
        JList<String> saveList = new JList<>(saveFiles.toArray(new String[0]));
        JScrollPane scrollPane = new JScrollPane(saveList);

        // Create load button
        JButton loadButton = new JButton("Load");
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFile = saveList.getSelectedValue();
                if (selectedFile != null) {
                    DungeonMon.player = GameManager.loadGame("Savegame/" + selectedFile + ".txt");
                    HomeBase home = new HomeBase();
                    home.setVisible(true);
                    dialog.dispose();
                    setVisible(false);
                    DungeonMon.player.getHomeBase().showMonsters();
                } else {
                    JOptionPane.showMessageDialog(dialog, "Please select a save file.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Layout setup
        dialog.setLayout(new BorderLayout());
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(loadButton, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {
        String name = JOptionPane.showInputDialog(this, "Enter your name:", "New Game", JOptionPane.PLAIN_MESSAGE);
        DungeonMon.player.setName(name);
        if (name != null && !name.trim().isEmpty()) {
            PokemonSelection selection = new PokemonSelection();
            selection.setVisible(true);
            setVisible(false);
        }
    }

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {
        // GameManager.saveGame(DungeonMon.player, "Savegame/" + DungeonMon.player.getName() + ".txt"); // Save the player's game
        System.exit(0); // Exit the application
    }

    // Helper method to list save files in a directory
    private List<String> listSaveFiles(String directoryPath) {
        List<String> saveFiles = new ArrayList<>();
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
            if (files != null) {
                for (File file : files) {
                    saveFiles.add(file.getName().split(".txt")[0]);
                }
            }
        }
        return saveFiles;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeScreen homeScreen = new HomeScreen();
                homeScreen.setVisible(true);
                homeScreen.setLocationRelativeTo(null); // Menempatkan jendela di tengah layar
            }
        });
    }

    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_exit; // New exit button
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLayeredPane jLayeredPane1;
}
