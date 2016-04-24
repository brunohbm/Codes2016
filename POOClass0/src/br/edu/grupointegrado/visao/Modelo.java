/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassMarca;
import br.edu.grupointegrado.controle.ClassModel;
import br.edu.grupointegrado.ferramentas.PreencherJTableGenerico;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author CrasyFox
 */
public class Modelo extends javax.swing.JFrame {

    ClassModel modelo = new ClassModel();
    ClassMarca marca = new ClassMarca();
    private int chave[];
    PreencherJTableGenerico fill = new PreencherJTableGenerico();

    public Modelo() {
        initComponents();
        jTFCod.setText(modelo.autoIncrem("CAD_MODELO", "CD_MODELO"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jTFData = new javax.swing.JTextField();
        jTFModelo = new javax.swing.JTextField();
        jTFCod = new javax.swing.JTextField();
        jCBSituacao = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFCodMarca = new javax.swing.JTextField();
        jTFDSMarca = new javax.swing.JTextField();
        jBPesquisaMarca = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jTFPesquisa = new javax.swing.JTextField();
        jBPesquisa = new javax.swing.JToggleButton();
        jCBTPConsulta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTFData.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jTFModelo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTFModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));
        jTFModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFModeloActionPerformed(evt);
            }
        });

        jTFCod.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTFCod.setText("   ");
        jTFCod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTFCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodActionPerformed(evt);
            }
        });

        jCBSituacao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCBSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jCBSituacao.setBorder(null);
        jCBSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSituacaoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton5.setText("Cancelar");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Codigo Marca:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Situação");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Cod:");

        jTFCodMarca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTFCodMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodMarcaFocusLost(evt);
            }
        });

        jTFDSMarca.setEditable(false);
        jTFDSMarca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jBPesquisaMarca.setText("...");
        jBPesquisaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFModelo)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCod, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCodMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDSMarca))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFCod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFCodMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDSMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisaMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addGap(71, 71, 71)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jTabbedPane3.addTab("Cadastro", jPanel7);

        jTFPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jBPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jBPesquisa.setText("Pesquisar");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        jCBTPConsulta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCBTPConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Modelo", "Marca" }));

        jTableConsulta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Marca", "Modelo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsulta);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCBTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBPesquisa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("Consulta", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFModeloActionPerformed

    private void jTFCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodActionPerformed

    private void jCBSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSituacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modelo.setCdMarca(Integer.parseInt(jTFCodMarca.getText()));
        modelo.setDsModelo(jTFModelo.getText());
        modelo.setDtCadastro(jTFData.getText());
        if (jCBSituacao.getSelectedIndex() == 0) {
            modelo.setInSituacao("A");
        } else {
            modelo.setInSituacao("I");
        }
        modelo.cadastrar();
        zerar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.setCdModelo(Integer.parseInt(jTFCod.getText()));
        modelo.setCdMarca(Integer.parseInt(jTFCodMarca.getText()));
        modelo.setDsModelo(jTFModelo.getText());
        modelo.setDtCadastro(jTFData.getText());
        if (jCBSituacao.getSelectedIndex() == 0) {
            modelo.setInSituacao("A");
        } else {
            modelo.setInSituacao("I");
        }
        modelo.alterar();
        zerar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modelo.setCdModelo(Integer.parseInt(jTFCod.getText()));
        modelo.setCdMarca(Integer.parseInt(jTFCodMarca.getText()));
        modelo.deletar();
        zerar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        switch (jCBTPConsulta.getSelectedIndex()) {
            case 0:
                fill.preencherJtableGenerico(jTableConsulta, modelo.consultaGeral());
                break;
            case 1:
                modelo.setDsModelo(jTFPesquisa.getText());
                fill.preencherJtableGenerico(jTableConsulta, modelo.cansultaModelo());
                break;
            case 2:
                modelo.setDsMarca(jTFPesquisa.getText());
                fill.preencherJtableGenerico(jTableConsulta, modelo.cansultaMarca());
                break;
        }
    }//GEN-LAST:event_jBPesquisaActionPerformed

    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
        if (evt.getClickCount() >= 2) {
            String cod = (String) jTableConsulta.getModel().getValueAt(jTableConsulta.getSelectedRow(), 0);
            modelo.setCdModelo(Integer.parseInt(cod));
            modelo.retornaModelo();
            fillModelo();
            jTabbedPane3.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void jTFCodMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodMarcaFocusLost
        modelo.setCdMarca(Integer.parseInt(jTFCodMarca.getText()));
        fill.preencherTwoJTfild("DS_MARCA", jTFDSMarca, modelo.getMarca().consultaCod());
    }//GEN-LAST:event_jTFCodMarcaFocusLost

    private void jBPesquisaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaMarcaActionPerformed
        MarcaJFrame jFrameMarca = new MarcaJFrame(this, true, marca);
        jFrameMarca.setVisible(true);

        jFrameMarca.addWindowListener(
                new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jTFCodMarca.setText(Integer.toString(marca.getCdMarca()));
                jTFDSMarca.setText(marca.getDsMarca());
                
            }
        }
        );
    }//GEN-LAST:event_jBPesquisaMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBPesquisa;
    private javax.swing.JButton jBPesquisaMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jCBSituacao;
    private javax.swing.JComboBox<String> jCBTPConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCod;
    private javax.swing.JTextField jTFCodMarca;
    private javax.swing.JTextField jTFDSMarca;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFModelo;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTableConsulta;
    // End of variables declaration//GEN-END:variables

    private void zerar() {
        jTFCod.setText(modelo.autoIncrem("CAD_MODELO", "CD_MODELO"));
        jTFModelo.setText("");
        jTFData.setText("");
    }

    private void fillModelo() {
        jTFCod.setText(Integer.toString(modelo.getCdModelo()));
        jTFCodMarca.setText(Integer.toString(modelo.getMarca().getCdMarca()));
        jTFDSMarca.setText(modelo.getMarca().getDsMarca());
        jTFModelo.setText(modelo.getDsModelo());
        jTFData.setText(modelo.getDtCadastro());
        if (modelo.getInSituacao().equalsIgnoreCase("A")) {
            jCBSituacao.setSelectedIndex(0);
        } else {
            jCBSituacao.setSelectedIndex(1);
        }
    }
}
