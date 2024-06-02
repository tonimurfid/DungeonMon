package Monster_Selection;
import app.*;
import Backend.*;
import Home.*;
import HomeBase.HomeBase;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author owwl
 */
public class PokemonSelection extends javax.swing.JFrame {

    private List<JButton> selectedButtons;

    /**
     * Creates new form monster
     */
    public PokemonSelection() {
        initComponents();
        customizeFrame();
        selectedButtons = new ArrayList<>();
    }
    
    private void customizeFrame() {
        // Set the size of the JFrame
        setSize(712, 460);
        // Center the JFrame on the screen
        setLocationRelativeTo(null);
    }

    private void selectButton(JButton button) {
        selectedButtons.add(button);
        button.setEnabled(false);

        if (selectedButtons.size() == 3) {
            // Proceed to HomeBase
            System.out.println("Succeded");
            DungeonMon.player.getHomeBase().showMonsters();
            HomeBase home = new HomeBase();
            home.setVisible(true);
            this.dispose();
            // BattleScreen battleScreen = new BattleScreen(DungeonMon.player.getHomeBase(), DungeonMon.player.getHomeBase().getListItem());
            // HomeBase base = new HomeBase();
            // base.setVisible(true);
            // this.dispose();
        }
    }

    private void addMonsterAndSelect(JButton button, javax.swing.ImageIcon icon, Monster monster) {
        jLabel1.setIcon(icon);
        DungeonMon.player.addMonster(monster);
        selectButton(button);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Button_Air = new javax.swing.JButton();
        Button_Api = new javax.swing.JButton();
        Button_Angin = new javax.swing.JButton();
        Button_Es = new javax.swing.JButton();
        Button_Tanah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("MONSTER SELECTION");
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 30, 240, 31);
        
        Button_Air.setIcon(new javax.swing.ImageIcon(getClass().getResource("air.png"))); // NOI18N
        Button_Air.setText("Water");
        Button_Air.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AirActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Air);
        Button_Air.setBounds(74, 359, 100, 40);

        Button_Api.setIcon(new javax.swing.ImageIcon(getClass().getResource("api.png"))); // NOI18N
        Button_Api.setText("Fire");
        Button_Api.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ApiActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Api);
        Button_Api.setBounds(186, 359, 100, 40);

        Button_Angin.setIcon(new javax.swing.ImageIcon(getClass().getResource("angin.png"))); // NOI18N
        Button_Angin.setText("Wind");
        Button_Angin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AnginActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Angin);
        Button_Angin.setBounds(298, 359, 100, 40);

        Button_Es.setIcon(new javax.swing.ImageIcon(getClass().getResource("es.png"))); // NOI18N
        Button_Es.setText("Ice");
        Button_Es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EsActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Es);
        Button_Es.setBounds(410, 359, 100, 40);

        Button_Tanah.setIcon(new javax.swing.ImageIcon(getClass().getResource("tanah.png"))); // NOI18N
        Button_Tanah.setText("Earth");
        Button_Tanah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TanahActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Tanah);
        Button_Tanah.setBounds(522, 359, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("player_fire.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 50, 580, 420);
        //tes
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("background_selection.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AirActionPerformed
        addMonsterAndSelect(Button_Air, new javax.swing.ImageIcon(getClass().getResource("player_water.gif")), DungeonMon.waterMonster);
    }//GEN-LAST:event_Button_AirActionPerformed

    private void Button_ApiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ApiActionPerformed
        addMonsterAndSelect(Button_Api, new javax.swing.ImageIcon(getClass().getResource("player_fire.gif")), DungeonMon.fireMonster);
    }//GEN-LAST:event_Button_ApiActionPerformed

    private void Button_AnginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AnginActionPerformed
        addMonsterAndSelect(Button_Angin, new javax.swing.ImageIcon(getClass().getResource("player_wind.gif")), DungeonMon.windMonster);
    }//GEN-LAST:event_Button_AnginActionPerformed

    private void Button_EsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EsActionPerformed
        addMonsterAndSelect(Button_Es, new javax.swing.ImageIcon(getClass().getResource("player_ice.gif")), DungeonMon.iceMonster);
    }//GEN-LAST:event_Button_EsActionPerformed

    private void Button_TanahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TanahActionPerformed
        addMonsterAndSelect(Button_Tanah, new javax.swing.ImageIcon(getClass().getResource("player_earth.gif")), DungeonMon.earthMonster);
    }//GEN-LAST:event_Button_TanahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(PokemonSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                new PokemonSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Air;
    private javax.swing.JButton Button_Angin;
    private javax.swing.JButton Button_Api;
    private javax.swing.JButton Button_Es;
    private javax.swing.JButton Button_Tanah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
