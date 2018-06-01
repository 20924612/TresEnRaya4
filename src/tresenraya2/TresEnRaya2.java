/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya2;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

/**
 *
 * @author lidia
 */
public class TresEnRaya2 extends javax.swing.JFrame {

    /**
     * Creates new form TresEnRaya
     */
    public static final char JUGADOR1 = 'X';
    public static final char JUGADOR2 = 'O';
    private int tiradas;
    public boolean gameOver;

    /**
     * Creates new form TresEnRaya
     */
    public TresEnRaya2() {
        initComponents();
        colorBoton();
        tiradas = 0;
        gameOver = false;
    }

    public void colorBoton() {

        /*JButton[] boton;
        boton = new JButton[8];
        for(int i=0; i<= boton.length; i++){
            boton[i].setBackground(java.awt.Color.pink);
        }*/
        jButton1.setBackground(Color.yellow);
        jButton2.setBackground(Color.orange);
        jButton3.setBackground(Color.red);
        jButton4.setBackground(Color.magenta);
        jButton5.setBackground(Color.black);
        jButton6.setBackground(Color.pink);
        jButton7.setBackground(Color.green);
        jButton8.setBackground(Color.cyan);
        jButton9.setBackground(Color.blue);

    }

    public void actionPerformed(JButton button) {

        if (!button.getText().equals("")) {
            return;
        }
        if (tiradas % 2 == 0) {
            button.setText("" + JUGADOR1);
        } else {
            button.setText("" + JUGADOR2);
        }
        tiradas++;
        writeBoard();

        if (checkLine(JUGADOR1)) {

            System.out.println("Jugador 1 es el ganador");
        } else {
            if (checkLine(JUGADOR2)){
            System.out.println("Jugador 2 es el ganador");
        }
        }
    }

    private void writeBoard() {
        int[][] board = new int[3][3];
        board[0][0] = jButton1.getText().equals("" + JUGADOR1) ? 1 : jButton1.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[0][1] = jButton2.getText().equals("" + JUGADOR1) ? 1 : jButton2.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[0][2] = jButton3.getText().equals("" + JUGADOR1) ? 1 : jButton3.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[1][0] = jButton4.getText().equals("" + JUGADOR1) ? 1 : jButton4.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[1][1] = jButton5.getText().equals("" + JUGADOR1) ? 1 : jButton5.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[1][2] = jButton6.getText().equals("" + JUGADOR1) ? 1 : jButton6.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[2][0] = jButton7.getText().equals("" + JUGADOR1) ? 1 : jButton7.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[2][1] = jButton8.getText().equals("" + JUGADOR1) ? 1 : jButton8.getText().equals("" + JUGADOR2) ? 0 : 9;
        board[2][2] = jButton9.getText().equals("" + JUGADOR1) ? 1 : jButton9.getText().equals("" + JUGADOR2) ? 0 : 9;

    }

    private boolean checkLine(Character jugador) {
        if (jButton1.getText().equals("" + jugador) && jButton2.getText().equals("" + jugador) && jButton3.getText().equals("" + jugador)) {
            return true;
        } else {
            if (jButton4.getText().equals("" + jugador) && jButton5.getText().equals("" + jugador) && jButton6.getText().equals("" + jugador)) {
                return true;
            } else {
                if (jButton7.getText().equals("" + jugador) && jButton8.getText().equals("" + jugador) && jButton9.getText().equals("" + jugador)) {
                    return true;
                } else {
                    if (jButton1.getText().equals("" + jugador) && jButton4.getText().equals("" + jugador) && jButton7.getText().equals("" + jugador)) {
                        return true;
                    } else {
                        if (jButton2.getText().equals("" + jugador) && jButton5.getText().equals("" + jugador) && jButton8.getText().equals("" + jugador)) {
                            return true;
                        } else {
                            if (jButton3.getText().equals("" + jugador) && jButton6.getText().equals("" + jugador) && jButton9.getText().equals("" + jugador)) {
                                return true;
                            } else {
                                if (jButton1.getText().equals("" + jugador) && jButton5.getText().equals("" + jugador) && jButton9.getText().equals("" + jugador)) {
                                    return true;
                                } else {
                                    if (jButton3.getText().equals("" + jugador) && jButton5.getText().equals("" + jugador) && jButton7.getText().equals("" + jugador)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuJugar = new javax.swing.JMenu();
        jMenuItemJugar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 102, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 153, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jMenuJugar.setText("Juego");

        jMenuItemJugar.setText("Jugar");
        jMenuItemJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJugarActionPerformed(evt);
            }
        });
        jMenuJugar.add(jMenuItemJugar);

        jMenuBar1.add(jMenuJugar);

        jMenu2.setText("Salir");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actionPerformed(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actionPerformed(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actionPerformed(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        actionPerformed(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        actionPerformed(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        actionPerformed(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        actionPerformed(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        actionPerformed(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        actionPerformed(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItemJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJugarActionPerformed

    }//GEN-LAST:event_jMenuItemJugarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TresEnRaya2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemJugar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuJugar;
    // End of variables declaration//GEN-END:variables
}
