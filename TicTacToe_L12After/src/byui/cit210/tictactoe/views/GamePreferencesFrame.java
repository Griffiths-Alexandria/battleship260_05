/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit210.tictactoe.views;

import byui.cit210.tictactoe.controls.GamePreferencesMenuControl;
import byui.cit210.tictactoe.exceptions.GameException;
import byui.cit210.tictactoe.models.Game;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacksonrkj
 */
public class GamePreferencesFrame extends javax.swing.JFrame {
    private GamePreferencesMenuControl gamePreferenceCommands;
    private GameFrame gameFrame = null;
    private Game game = null;

    /**
     * Creates new form GamePreferencesFrame
     */
    public GamePreferencesFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public GamePreferencesFrame(Game game, GameFrame gameFrame) {
        this();
        this.game = game;
        this.gameFrame = gameFrame;
        this.gamePreferenceCommands = new GamePreferencesMenuControl(game);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtRowCount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtColumnCount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlPlayerA = new javax.swing.JLabel();
        jlPlayerB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtPlayerA = new javax.swing.JTextField();
        jtPlayerB = new javax.swing.JTextField();
        jbCancel = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Game Preferences");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel3.setText("Number of rows (3-10)");
        jLabel3.setAlignmentY(0.0F);

        jtRowCount.setMinimumSize(new java.awt.Dimension(12, 28));
        jtRowCount.setPreferredSize(new java.awt.Dimension(12, 28));
        jtRowCount.setSize(new java.awt.Dimension(84, 24));

        jLabel4.setText("Number of columns (3-10)");
        jLabel4.setAlignmentY(0.0F);

        jtColumnCount.setAlignmentY(0.0F);
        jtColumnCount.setAutoscrolls(false);
        jtColumnCount.setMinimumSize(new java.awt.Dimension(12, 28));
        jtColumnCount.setPreferredSize(new java.awt.Dimension(12, 28));

        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Size of Board:");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jLabel3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jtRowCount, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .add(jtColumnCount, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jtColumnCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(jtRowCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(59, 59, 59))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jlPlayerA.setText("Player1");

        jlPlayerB.setText("Player2");

        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Players Markers:");

        jtPlayerA.setMinimumSize(new java.awt.Dimension(12, 28));
        jtPlayerA.setPreferredSize(new java.awt.Dimension(12, 28));
        jtPlayerA.setSize(new java.awt.Dimension(24, 24));

        jtPlayerB.setMaximumSize(new java.awt.Dimension(14, 28));
        jtPlayerB.setMinimumSize(new java.awt.Dimension(12, 28));
        jtPlayerB.setPreferredSize(new java.awt.Dimension(12, 28));
        jtPlayerB.setSize(new java.awt.Dimension(84, 24));

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel6))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlPlayerA)
                            .add(jlPlayerB))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jtPlayerB, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jtPlayerA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel6)
                        .add(3, 3, 3)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlPlayerA)
                            .add(jtPlayerA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jlPlayerB)
                        .add(20, 20, 20))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jtPlayerB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(14, 14, 14))))
        );

        jbCancel.setText("Cancel");
        jbCancel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jbSave.setText("Save");
        jbSave.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jbSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSaveMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Tic-Tac-Toe Game Preferences");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jLabel1)
                .add(0, 6, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jbCancel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbSave, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jbCancel))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jlPlayerA.setText(this.game.getPlayerA().getName());
        this.jlPlayerB.setText(this.game.getPlayerB().getName());
        this.jtPlayerA.setText(this.game.getPlayerA().getMarker());
        this.jtPlayerB.setText(this.game.getPlayerB().getMarker());
        
        this.jtRowCount.setText(((Integer) this.game.getBoard().getRowCount()).toString());
        this.jtColumnCount.setText(((Integer) this.game.getBoard().getColumnCount()).toString());
        
    }//GEN-LAST:event_formWindowOpened

    private void jbSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSaveMouseClicked
        this.savePreferences();
    }//GEN-LAST:event_jbSaveMouseClicked

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelActionPerformed

    
    private void savePreferences() {
        String playerAMarker = this.jtPlayerA.getText();
        String playerBMarker = this.jtPlayerB.getText();
        String rowCount  = this.jtRowCount.getText();
        String columnCount = this.jtColumnCount.getText();
        
        try {
            Dimension boardDimensions = 
                    this.gamePreferenceCommands.savePreferences(playerAMarker, 
                                                                playerBMarker, 
                                                                rowCount, 
                                                                columnCount);
            if (boardDimensions != null) {

                
                Dimension tableSize = this.gameFrame.getTicTacToeTable().getSize();
//                Dimension frameSize = this.gameFrame.getSize();
                Dimension contentPaneSize = this.gameFrame.getContentPane().getSize();
           
                // update board table model
                DefaultTableModel tableModel = 
                        new DefaultTableModel(boardDimensions.width, boardDimensions.height);               
                this.gameFrame.getTicTacToeTable().setModel(tableModel);
                this.gameFrame.initializeFrame();
                
                tableSize = this.gameFrame.getTicTacToeTable().getSize();
                contentPaneSize.width += tableSize.width;
                contentPaneSize.height += tableSize.height;   
                this.gameFrame.pack();
                this.gameFrame.getContentPane().revalidate();
               
               
            }
        }
        catch (GameException gex) {
            JOptionPane.showMessageDialog(this, gex.getMessage(), "Game Preferences", JOptionPane.ERROR_MESSAGE);
        }
        finally {
             this.dispose();
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbSave;
    private javax.swing.JLabel jlPlayerA;
    private javax.swing.JLabel jlPlayerB;
    private javax.swing.JTextField jtColumnCount;
    private javax.swing.JTextField jtPlayerA;
    private javax.swing.JTextField jtPlayerB;
    private javax.swing.JTextField jtRowCount;
    // End of variables declaration//GEN-END:variables
}
