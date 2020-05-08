/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import cjb.ci.Mensaje;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import s3.ManipulaArchivos;
import s3.NoPerecederos;
import s3.Perecederos;
import s3.Productos;

/**
 *
 * @author Mauro Sanchez2
 */
public class VtnP extends javax.swing.JFrame
{

    public static Productos p[] = null;

    /**
     * Creates new form VtnP
     */
    public VtnP()
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

        jtbP = new javax.swing.JToolBar();
        jtbIPA = new javax.swing.JToggleButton();
        jtbIPB = new javax.swing.JToggleButton();
        jtbIPC = new javax.swing.JToggleButton();
        jtbIPM = new javax.swing.JToggleButton();
        jtbP1 = new javax.swing.JToolBar();
        jtbIPA1 = new javax.swing.JToggleButton();
        jtbIPB1 = new javax.swing.JToggleButton();
        jtbIPC1 = new javax.swing.JToggleButton();
        jtbIPM1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPerecederos = new javax.swing.JMenu();
        mnuPAltas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPBajas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuPConsultas = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuPModificaciones = new javax.swing.JMenuItem();
        mnuNoPerecederos = new javax.swing.JMenu();
        mnuNPAltas = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuNPBajas = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuNPConsultas = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuNPModificaciones = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        mnuSSalir = new javax.swing.JMenuItem();
        mnuChBP = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de productos");
        addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jtbP.setRollover(true);

        jtbIPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.jpg"))); // NOI18N
        jtbIPA.setToolTipText("alta de productos perecederos");
        jtbIPA.setFocusable(false);
        jtbIPA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPAActionPerformed(evt);
            }
        });
        jtbP.add(jtbIPA);

        jtbIPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goma.jpg"))); // NOI18N
        jtbIPB.setToolTipText("baja de productos perecederos");
        jtbIPB.setFocusable(false);
        jtbIPB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPBActionPerformed(evt);
            }
        });
        jtbP.add(jtbIPB);

        jtbIPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.jpg"))); // NOI18N
        jtbIPC.setToolTipText("consulta de productos perecederos");
        jtbIPC.setFocusable(false);
        jtbIPC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPC.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPCActionPerformed(evt);
            }
        });
        jtbP.add(jtbIPC);

        jtbIPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libreta.jpg"))); // NOI18N
        jtbIPM.setToolTipText("modificaciones de productos perecederos");
        jtbIPM.setFocusable(false);
        jtbIPM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPM.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPM.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPMActionPerformed(evt);
            }
        });
        jtbP.add(jtbIPM);

        jtbP1.setRollover(true);

        jtbIPA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.jpg"))); // NOI18N
        jtbIPA1.setToolTipText("alta de productos perecederos");
        jtbIPA1.setFocusable(false);
        jtbIPA1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPA1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPA1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPA1ActionPerformed(evt);
            }
        });
        jtbP1.add(jtbIPA1);

        jtbIPB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goma.jpg"))); // NOI18N
        jtbIPB1.setToolTipText("baja de productos perecederos");
        jtbIPB1.setFocusable(false);
        jtbIPB1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPB1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPB1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPB1ActionPerformed(evt);
            }
        });
        jtbP1.add(jtbIPB1);

        jtbIPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.jpg"))); // NOI18N
        jtbIPC1.setToolTipText("consulta de productos perecederos");
        jtbIPC1.setFocusable(false);
        jtbIPC1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPC1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPC1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPC1ActionPerformed(evt);
            }
        });
        jtbP1.add(jtbIPC1);

        jtbIPM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libreta.jpg"))); // NOI18N
        jtbIPM1.setToolTipText("modificaciones de productos perecederos");
        jtbIPM1.setFocusable(false);
        jtbIPM1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbIPM1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbIPM1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtbIPM1ActionPerformed(evt);
            }
        });
        jtbP1.add(jtbIPM1);

        mnuPerecederos.setText("Perecederos");

        mnuPAltas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuPAltas.setText("Altas");
        mnuPAltas.setToolTipText("altas de materiales perecederos");
        mnuPAltas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuPAltas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPAltasActionPerformed(evt);
            }
        });
        mnuPerecederos.add(mnuPAltas);
        mnuPerecederos.add(jSeparator1);

        mnuPBajas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnuPBajas.setText("Bajas");
        mnuPBajas.setToolTipText("bajas de materiales perecederos");
        mnuPBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuPBajas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPBajasActionPerformed(evt);
            }
        });
        mnuPerecederos.add(mnuPBajas);
        mnuPerecederos.add(jSeparator2);

        mnuPConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuPConsultas.setText("Consultas");
        mnuPConsultas.setToolTipText("consultas de materiales perecederos");
        mnuPConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuPConsultas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPConsultasActionPerformed(evt);
            }
        });
        mnuPerecederos.add(mnuPConsultas);
        mnuPerecederos.add(jSeparator3);

        mnuPModificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuPModificaciones.setText("Modificaciones");
        mnuPModificaciones.setToolTipText("modificaciones de materiales perecederos");
        mnuPModificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuPModificaciones.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPModificacionesActionPerformed(evt);
            }
        });
        mnuPerecederos.add(mnuPModificaciones);

        jMenuBar1.add(mnuPerecederos);

        mnuNoPerecederos.setText("No Perecederos");

        mnuNPAltas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mnuNPAltas.setText("Altas");
        mnuNPAltas.setToolTipText("altas de materiales no perecederos");
        mnuNPAltas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuNoPerecederos.add(mnuNPAltas);
        mnuNoPerecederos.add(jSeparator5);

        mnuNPBajas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        mnuNPBajas.setText("Bajas");
        mnuNPBajas.setToolTipText("bajas de materiales no perecederos");
        mnuNPBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuNoPerecederos.add(mnuNPBajas);
        mnuNoPerecederos.add(jSeparator6);

        mnuNPConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        mnuNPConsultas.setText("Consultas");
        mnuNPConsultas.setToolTipText("consultas de materiales no perecederos");
        mnuNPConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuNoPerecederos.add(mnuNPConsultas);
        mnuNoPerecederos.add(jSeparator7);

        mnuNPModificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        mnuNPModificaciones.setText("Modificaciones");
        mnuNPModificaciones.setToolTipText("modificaciones de materiales no perecederos");
        mnuNPModificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuNoPerecederos.add(mnuNPModificaciones);

        jMenuBar1.add(mnuNoPerecederos);

        mnuSalir.setText("Salir");

        mnuSSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mnuSSalir.setText("Salir");
        mnuSSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuSSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuSSalirActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuSSalir);

        mnuChBP.setSelected(true);
        mnuChBP.setText("Perecederos");
        mnuChBP.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                mnuChBPStateChanged(evt);
            }
        });
        mnuChBP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuChBPActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuChBP);

        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtbP, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbP1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtbP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 405, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuSSalirActionPerformed
    {//GEN-HEADEREND:event_mnuSSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuSSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        p = (Productos[]) ManipulaArchivos.carga("datos1.dat");
    }//GEN-LAST:event_formWindowOpened

    private void mnuPConsultasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPConsultasActionPerformed
    {//GEN-HEADEREND:event_mnuPConsultasActionPerformed
        new VtnPC().setVisible(true);
    }//GEN-LAST:event_mnuPConsultasActionPerformed

    private void mnuPAltasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPAltasActionPerformed
    {//GEN-HEADEREND:event_mnuPAltasActionPerformed
        VtnPA vpa = new VtnPA();
        vpa.setVisible(true);
    }//GEN-LAST:event_mnuPAltasActionPerformed

    private void mnuPBajasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPBajasActionPerformed
    {//GEN-HEADEREND:event_mnuPBajasActionPerformed
        new VtnPB().setVisible(true);
    }//GEN-LAST:event_mnuPBajasActionPerformed

    private void mnuPModificacionesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPModificacionesActionPerformed
    {//GEN-HEADEREND:event_mnuPModificacionesActionPerformed
        new VtnPM().setVisible(true);
    }//GEN-LAST:event_mnuPModificacionesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        ManipulaArchivos.guarda(p, "datos1.dat");
    }//GEN-LAST:event_formWindowClosed

    private void jtbIPAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPAActionPerformed
    {//GEN-HEADEREND:event_jtbIPAActionPerformed
        mnuPAltasActionPerformed(evt);
    }//GEN-LAST:event_jtbIPAActionPerformed

    private void jtbIPBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPBActionPerformed
    {//GEN-HEADEREND:event_jtbIPBActionPerformed
        mnuPBajasActionPerformed(evt);
    }//GEN-LAST:event_jtbIPBActionPerformed

    private void jtbIPCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPCActionPerformed
    {//GEN-HEADEREND:event_jtbIPCActionPerformed
        mnuPConsultasActionPerformed(evt);
    }//GEN-LAST:event_jtbIPCActionPerformed

    private void jtbIPMActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPMActionPerformed
    {//GEN-HEADEREND:event_jtbIPMActionPerformed
        mnuPModificacionesActionPerformed(evt);
    }//GEN-LAST:event_jtbIPMActionPerformed

    private void jtbIPA1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPA1ActionPerformed
    {//GEN-HEADEREND:event_jtbIPA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbIPA1ActionPerformed

    private void jtbIPB1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPB1ActionPerformed
    {//GEN-HEADEREND:event_jtbIPB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbIPB1ActionPerformed

    private void jtbIPC1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPC1ActionPerformed
    {//GEN-HEADEREND:event_jtbIPC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbIPC1ActionPerformed

    private void jtbIPM1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtbIPM1ActionPerformed
    {//GEN-HEADEREND:event_jtbIPM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbIPM1ActionPerformed

    private void mnuChBPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuChBPActionPerformed
    {//GEN-HEADEREND:event_mnuChBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuChBPActionPerformed

    private void mnuChBPStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_mnuChBPStateChanged
    {//GEN-HEADEREND:event_mnuChBPStateChanged
        if (jtbP.isEnabled())
        {
            jtbP.setEnabled(false);
            jtbP.setVisible(false);
        } else
        {
            jtbP.setEnabled(true);
            jtbP.setVisible(true);
        }

    }//GEN-LAST:event_mnuChBPStateChanged

    private void formFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_formFocusGained
    {//GEN-HEADEREND:event_formFocusGained
        activaMnu(mnuPBajas,mnuPConsultas,mnuPModificaciones);
        activaJTB(jtbIPB,jtbIPC,jtbIPM);
    }//GEN-LAST:event_formFocusGained

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
            java.util.logging.Logger.getLogger(VtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnP().setVisible(true);
            }
        });
    }

    public static void activaMnu(JMenuItem... obj)
    {
        boolean b = true;
        if (p == null)
        {
            b = false;
        }
        for (int i = 0; i < obj.length; i++)
        {
            obj[i].setEnabled(b);
        }
    }
    
    public static void activaJTB(JToggleButton... obj)
    {
        boolean b = true;
        if (p == null)
        {
            b = false;
        }
        for (int i = 0; i < obj.length; i++)
        {
            obj[i].setEnabled(b);
        }
    }

    public static int busca(int opc, String s, JFrame jf)
    {

        if (p == null)
        {
            Mensaje.error(jf, "No hay datos que " + s + " ...");
        } else
        {
            String nom = JOptionPane.showInputDialog(jf,
                    "Dame el nombre a " + s + " :");
            if (nom != null)
            {
                for (int i = 0; i < p.length; i++)
                {
                    if (p[i] instanceof Perecederos && opc == 1
                            && nom.equals(p[i].getNom()))
                    {
                        return i;
                    } else
                    {
                        if (p[i] instanceof NoPerecederos && opc == 2
                                && nom.equals(p[i].getNom()))
                        {
                            return i;
                        }
                    }
                }
                Mensaje.error(jf, "Dato no encontrado...");
            }
        }
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToggleButton jtbIPA;
    private javax.swing.JToggleButton jtbIPA1;
    private javax.swing.JToggleButton jtbIPB;
    private javax.swing.JToggleButton jtbIPB1;
    private javax.swing.JToggleButton jtbIPC;
    private javax.swing.JToggleButton jtbIPC1;
    private javax.swing.JToggleButton jtbIPM;
    private javax.swing.JToggleButton jtbIPM1;
    private javax.swing.JToolBar jtbP;
    private javax.swing.JToolBar jtbP1;
    private javax.swing.JCheckBoxMenuItem mnuChBP;
    private javax.swing.JMenuItem mnuNPAltas;
    private javax.swing.JMenuItem mnuNPBajas;
    private javax.swing.JMenuItem mnuNPConsultas;
    private javax.swing.JMenuItem mnuNPModificaciones;
    private javax.swing.JMenu mnuNoPerecederos;
    private javax.swing.JMenuItem mnuPAltas;
    private javax.swing.JMenuItem mnuPBajas;
    private javax.swing.JMenuItem mnuPConsultas;
    private javax.swing.JMenuItem mnuPModificaciones;
    private javax.swing.JMenu mnuPerecederos;
    private javax.swing.JMenuItem mnuSSalir;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}