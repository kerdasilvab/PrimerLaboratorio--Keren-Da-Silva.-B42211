/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador_FRM_Autos;
import javax.swing.JOptionPane;

/**
 *
 * @author Keren
 */
public class FRM_Autos extends javax.swing.JFrame {
    
    Controlador_FRM_Autos controlador;
    
    public FRM_Autos()
    {
        initComponents();
        controlador=new Controlador_FRM_Autos(this);
        this.gUI_Botones1.agregarEventos(controlador);
        this.gUI_InformacionAutos1.agregarEventos(controlador);
        estadoInicial();
    }
    
     public String devolverRegistro()
     {
        return this.gUI_InformacionAutos1.devolverRegistro();
     }
     
    public String devolverNombre()
    {
        return this.gUI_InformacionAutos1.devolverNombre();
    }
    
    public String devolverCedula()
    {
        return this.gUI_InformacionAutos1.devolverCedula();
    }
    
    public String devolverPlaca(){
        return this.gUI_InformacionAutos1.devolverPlaca();
    }
    
    public void limpiar()
    {
        this.gUI_InformacionAutos1.limpiar();
    }
    
    public void estadoInicial()
    {
        this.gUI_Botones1.estadoInicial();
        this.gUI_InformacionAutos1.estadoInicial();
    }
    
    public void deshabilitarRegitro(){
        this.gUI_InformacionAutos1.deshabilitarRegistro();
    }
    
    public void habilitarOpciones()
    {
        this.gUI_Botones1.habilitarOpciones();
        this.gUI_InformacionAutos1.habilitarOpciones();
    }
    
    public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void habilitarAgregar()
    {
        this.gUI_Botones1.habilitarAgregar();
        this.gUI_InformacionAutos1.habilitarAgregar();
    }
    
    public void mostrarInformacion(String[] arreglo)
    {
        this.gUI_InformacionAutos1.mostrarInformacion(arreglo);
    }
    
    public String[] devolverInformacion()
    {
        return this.gUI_InformacionAutos1.devolverInformacion();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_InformacionAutos1 = new Vista.GUI_InformacionAutos();
        gUI_Botones1 = new Vista.GUI_Botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(gUI_InformacionAutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gUI_InformacionAutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRM_Autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Autos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_InformacionAutos gUI_InformacionAutos1;
    // End of variables declaration//GEN-END:variables

    public void deshabilitarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}