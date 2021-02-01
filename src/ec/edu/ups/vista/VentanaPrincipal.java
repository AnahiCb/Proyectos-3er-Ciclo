/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorBienes;
import ec.edu.ups.controlador.ControladorHipoteca;
import ec.edu.ups.controlador.ControladorPersonas;

/**
 *
 * @author Anahi
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorPersonas controladorPersonas;
    private ControladorBienes controladorBienes;
    private ControladorHipoteca controladorHipoteca;
    
    private VentanaPersonas ventanaPersonas;
    private VentanaBienes ventanaBienes;
    private VentanaHipoteca ventanaHipoteca;
    /**
     * Creates new form VtnPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        controladorPersonas = new ControladorPersonas();
        controladorBienes = new ControladorBienes();
        controladorHipoteca = new ControladorHipoteca();
        
        ventanaPersonas = new VentanaPersonas(controladorPersonas);
        ventanaBienes = new VentanaBienes(controladorBienes);
        ventanaHipoteca = new VentanaHipoteca(controladorHipoteca, controladorPersonas, controladorBienes);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuItemPersona = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        menuItemHipoteca = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        menuItemPersona.setMnemonic('o');
        menuItemPersona.setText("Gestion Persona");
        menuItemPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPersonaActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemPersona);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Bienes");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        menuItemHipoteca.setMnemonic('a');
        menuItemHipoteca.setText("Hipoteca");
        menuItemHipoteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHipotecaActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemHipoteca);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menuItemPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPersonaActionPerformed
        desktopPane.add(ventanaPersonas);
        ventanaPersonas.setVisible(true);
    }//GEN-LAST:event_menuItemPersonaActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        desktopPane.add(ventanaBienes);
        ventanaBienes.setVisible(true);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void menuItemHipotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHipotecaActionPerformed
        desktopPane.add(ventanaHipoteca);
        ventanaHipoteca.setVisible(true);
    }//GEN-LAST:event_menuItemHipotecaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemHipoteca;
    private javax.swing.JMenuItem menuItemPersona;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
