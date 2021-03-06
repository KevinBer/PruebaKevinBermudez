/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroLibros;

/**
 *
 * @author Bryan
 */
public class Menu extends javax.swing.JFrame implements ActionListener {
    private RegistroLibros registro;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setManejador();
        registro = new RegistroLibros();
    }
    
    public void setManejador(){
        jmiEstudiante.addActionListener(this);
        jmiLibro.addActionListener(this);
        jmiLibros.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==jmiLibro){
            System.out.println("OK");
            GUILibro guiLibro = new GUILibro();
            guiLibro.init(registro);
            guiLibro.setVisible(true);
            
        }else{
            if(e.getSource()==jmiLibros){
                GUIReportesLibro guiReportesLibro = new GUIReportesLibro();
                guiReportesLibro.init(registro);
                guiReportesLibro.setVisible(true);
            }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmRegistrar = new javax.swing.JMenu();
        jmiLibro = new javax.swing.JMenuItem();
        jmiEstudiante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiLibros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jmRegistrar.setText("Registrar");

        jmiLibro.setText("Libro");
        jmiLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLibroActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmiLibro);

        jmiEstudiante.setText("Estudiante");
        jmRegistrar.add(jmiEstudiante);

        jMenuBar1.add(jmRegistrar);

        jMenu2.setText("Reportes");

        jmiLibros.setText("Libros");
        jMenu2.add(jmiLibros);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiLibroActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmRegistrar;
    private javax.swing.JMenuItem jmiEstudiante;
    private javax.swing.JMenuItem jmiLibro;
    private javax.swing.JMenuItem jmiLibros;
    // End of variables declaration//GEN-END:variables
}
