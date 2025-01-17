/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.awt.Cursor;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 *
 * @author Mauro Sanchez2
 */
public class VtnPA extends javax.swing.JFrame
{

    /**
     * Creates new form VtnPA
     */
    public VtnPA()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfExistencias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFechaCad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de productos perecederos");
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Nombre:");

        tfNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tfNombreActionPerformed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfNombreKeyTyped(evt);
            }
        });

        jLabel2.setText("Existencias:");

        tfExistencias.setEnabled(false);
        tfExistencias.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfExistenciasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfExistenciasKeyTyped(evt);
            }
        });

        jLabel3.setText("Fecha de caducidad:");

        tfFechaCad.setEnabled(false);
        tfFechaCad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfFechaCadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfFechaCadKeyTyped(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setEnabled(false);
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnAceptarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfFechaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(45, 45, 45)
                .addComponent(btnAceptar)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFechaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(64, 64, 64))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
         this.setCursor(Cursor.WAIT_CURSOR);
        String nom = tfNombre.getText();
        int existencia = 0;
        if (!Validaciones.verificaEntero(tfExistencias))
        {
            Mensaje.error(this, "se espraba un entero");
            CtrlInterfaz.cambia(tfExistencias);
        } else
        {
            existencia = Integer.parseInt(tfExistencias.getText());
            String fechaCad = tfFechaCad.getText();
            Perecederos obj = new Perecederos(0, nom, existencia, fechaCad);
           
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("S3MenusPU");
            PerecederosJpaController p = new PerecederosJpaController(emf);
            p.create(obj);
           
            Mensaje.exito(this, "dato insertado correctamente");
            btnCancelarActionPerformed(evt);
        }
         this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(tfNombre, tfExistencias, tfFechaCad);
        CtrlInterfaz.habilita(false, tfExistencias, tfFechaCad, btnAceptar);
        CtrlInterfaz.cambia(tfNombre);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfNombreKeyTyped
    {//GEN-HEADEREND:event_tfNombreKeyTyped
        if(tfNombre.getText().length()==5)
        {
            evt.consume();
        }else
        {
            Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfNombreKeyPressed
    {//GEN-HEADEREND:event_tfNombreKeyPressed
        Validaciones.enter(this, evt, tfExistencias);
    }//GEN-LAST:event_tfNombreKeyPressed

    private void tfExistenciasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfExistenciasKeyTyped
    {//GEN-HEADEREND:event_tfExistenciasKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_tfExistenciasKeyTyped

    private void tfExistenciasKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfExistenciasKeyPressed
    {//GEN-HEADEREND:event_tfExistenciasKeyPressed
        Validaciones.enterEntero(this, evt, tfExistencias, tfFechaCad);
    }//GEN-LAST:event_tfExistenciasKeyPressed

    private void tfFechaCadKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfFechaCadKeyTyped
    {//GEN-HEADEREND:event_tfFechaCadKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_tfFechaCadKeyTyped

    private void tfFechaCadKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfFechaCadKeyPressed
    {//GEN-HEADEREND:event_tfFechaCadKeyPressed
        Validaciones.enter(this, evt, btnAceptar);
    }//GEN-LAST:event_tfFechaCadKeyPressed

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tfNombreActionPerformed
    {//GEN-HEADEREND:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfExistencias;
    private javax.swing.JTextField tfFechaCad;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
