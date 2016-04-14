/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador_FRM_Autos;

/**
 *
 * @author Keren
 */
public class GUI_InformacionAutos extends javax.swing.JPanel {

    Controlador_FRM_Autos controlador;
    
    public GUI_InformacionAutos() {
        initComponents(); 
    }
    
    public void agregarEventos(Controlador_FRM_Autos controlador)
    {
    this.controlador=controlador;
    }
    
    public String[] devolverInformacion()
    {
        String arreglo[];
        arreglo =new String[4];
        
        arreglo[0]=this.jt_NumeroRegistro.getText();
        arreglo[1]=this.jt_Nombre.getText();
        arreglo[2]=this.jt_Cedula.getText();
        arreglo[3]=this.jt_Placa.getText();
        
        return arreglo;
    }
    public String devolverRegistro()
    {
        return this.jt_NumeroRegistro.getText();
    }
    
    public String devolverNombre()
    {
        return this.jt_Nombre.getText();
    }
    
    public String devolverCedula()
    {
        return this.jt_Cedula.getText();
    }
    
    public String devolverPlaca()
    {
        return this.jt_Placa.getText();
    }
    
    public void mostrarInformacion(String[] arreglo)
    {
        this.jt_Nombre.setText(arreglo[0]);
        this.jt_Cedula.setText(arreglo[1]);
        this.jt_Placa.setText(arreglo[2]);
    }
    
    public void limpiar()
    {
        this.jt_NumeroRegistro.setText("");
        this.jt_Nombre.setText("");
        this.jt_Placa.setText("");
    }
    
    public void estadoInicial()
    {
        this.jt_NumeroRegistro.setEnabled(true);
        this.jt_Nombre.setEnabled(false);
        this.jt_Cedula.setEnabled(false);
        this.jt_Placa.setEnabled(false);
    }
    
    public void deshabilitarPlaca(){
        this.jt_Placa.setEnabled(false);
    }
    
    public void habilitarOpciones()
    {
        this.jt_NumeroRegistro.setEnabled(false);
        this.jt_Nombre.setEnabled(true);
        this.jt_Cedula.setEnabled(true);
        this.jt_Placa.setEnabled(true);
    }
    
    public void habilitarAgregar()
    {
        this.jt_NumeroRegistro.setEnabled(false);
        this.jt_Nombre.setEnabled(true);
        this.jt_Cedula.setEnabled(true);
        this.jt_Placa.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroRegistro = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Cedula = new javax.swing.JLabel();
        jl_Placa = new javax.swing.JLabel();
        jt_NumeroRegistro = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Cedula = new javax.swing.JTextField();
        jt_Placa = new javax.swing.JTextField();

        jl_NumeroRegistro.setText("Número de registro");

        jl_Nombre.setText("Nombre del dueño");

        jl_Cedula.setText("Cédula del dueño");

        jl_Placa.setText("Placa del automóvil");

        jt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_NombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Placa)
                        .addGap(18, 18, 18)
                        .addComponent(jt_Placa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_NumeroRegistro)
                            .addComponent(jl_Nombre)
                            .addComponent(jl_Cedula))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_Nombre)
                            .addComponent(jt_Cedula)
                            .addComponent(jt_NumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroRegistro)
                    .addComponent(jt_NumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cedula)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Placa)
                    .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_NombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_NumeroRegistro;
    private javax.swing.JLabel jl_Placa;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_NumeroRegistro;
    private javax.swing.JTextField jt_Placa;
    // End of variables declaration//GEN-END:variables

    void deshabilitarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
