/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Camara.Camara;
import Clases.Datos;
import Clases.DatosIngreso;
import Clases.DatosSalida;
public class Tomarfoto extends javax.swing.JPanel {
    Camara cm = new Camara();
  Datos di =new DatosIngreso();
  Datos ds = new DatosSalida();
    public Tomarfoto() {
        initComponents();
        this.Apagar.setEnabled(false);
        this.Guardar.setEnabled(false);
        this.Capturar.setEnabled(false);
        cm.camera(this.panelfoto);
            di.obtenercedula(this.Combo);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfoto = new javax.swing.JPanel();
        encender = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        Capturar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Combo = new javax.swing.JComboBox<>();
        mostrarfotolabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(403, 415));

        panelfoto.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout panelfotoLayout = new javax.swing.GroupLayout(panelfoto);
        panelfoto.setLayout(panelfotoLayout);
        panelfotoLayout.setHorizontalGroup(
            panelfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        panelfotoLayout.setVerticalGroup(
            panelfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        encender.setBackground(new java.awt.Color(204, 255, 204));
        encender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Poweron.png"))); // NOI18N
        encender.setText("Encender");
        encender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        encender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        encender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encenderActionPerformed(evt);
            }
        });

        Apagar.setBackground(new java.awt.Color(204, 255, 204));
        Apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Apagar.png"))); // NOI18N
        Apagar.setText("Apagar");
        Apagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Apagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        Capturar.setBackground(new java.awt.Color(204, 255, 204));
        Capturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Capturar.png"))); // NOI18N
        Capturar.setText("Capturar");
        Capturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Capturar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Capturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapturarActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(204, 255, 204));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Guardar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una cedula" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        mostrarfotolabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOMAR FOTO PARA LA CEDULA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarfotolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encender, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Apagar)
                        .addGap(18, 18, 18)
                        .addComponent(Capturar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mostrarfotolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Apagar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(encender, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Capturar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void encenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encenderActionPerformed
        cm.encender();
        this.Apagar.setEnabled(true);
        this.Capturar.setEnabled(true);
    }//GEN-LAST:event_encenderActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        cm.apagar();
        this.Capturar.setEnabled(false);
        this.Apagar.setEnabled(false);
    }//GEN-LAST:event_ApagarActionPerformed

    private void CapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapturarActionPerformed
       cm.capturar(this.mostrarfotolabel);
       this.Guardar.setEnabled(true);
        
    }//GEN-LAST:event_CapturarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        cm.guardar(this.mostrarfotolabel,this.Combo);
        ds.subirfoto(this.Combo.getSelectedItem().toString(),this.Combo);
        this.repaint();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Capturar;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton encender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mostrarfotolabel;
    private javax.swing.JPanel panelfoto;
    // End of variables declaration//GEN-END:variables
}
