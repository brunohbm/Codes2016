/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassMarca;
import br.edu.grupointegrado.ferramentas.PreencherJTableGenerico;
import javax.swing.JOptionPane;

/**
 *
 * @author CrasyFox
 */
public class MarcaJFrame extends javax.swing.JDialog {

    PreencherJTableGenerico fill = new PreencherJTableGenerico();
    ClassMarca marca = new ClassMarca();

    public MarcaJFrame(java.awt.Frame parent, boolean modal, ClassMarca marca) {
        super(parent, modal);
        initComponents();
        this.marca = marca;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsultaMarca = new javax.swing.JTable();
        jBInserir = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jTFDescricao = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jCBTipo = new javax.swing.JComboBox<>();
        jBCancelar = new javax.swing.JButton();
        jBSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTConsultaMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descricão", "Data", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTConsultaMarca);

        jBInserir.setText("Inserir");

        jBDeletar.setText("Deletar");

        jBAlterar.setText("Alterar");

        jTFDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDescricaoActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Código", "Descrição" }));

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBSelecionar.setText("Selecionar");
        jBSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSelecionar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesquisar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBPesquisar)
                        .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir)
                    .addComponent(jBAlterar)
                    .addComponent(jBDeletar)
                    .addComponent(jBCancelar)
                    .addComponent(jBSelecionar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDescricaoActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        switch (jCBTipo.getSelectedIndex()) {
            case 0:
                fill.preencherJtableGenerico(jTConsultaMarca, marca.consultaGeral());
                break;
            case 1:
                marca.setCdMarca(Integer.parseInt(jTFDescricao.getText()));
                fill.preencherJtableGenerico(jTConsultaMarca, marca.consultaCod());
                break;
            case 2:
                marca.setDsMarca(jTFDescricao.getText());
                fill.preencherJtableGenerico(jTConsultaMarca, marca.consultaDescricao());
                break;
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed
        if (jTConsultaMarca.getSelectedRow() >= 0) {
            marca.setCdMarca(Integer.parseInt(jTConsultaMarca.getModel().getValueAt(jTConsultaMarca.getSelectedRow(), 0).toString()));
            marca.setDsMarca(jTConsultaMarca.getModel().getValueAt(jTConsultaMarca.getSelectedRow(), 1).toString());
            marca.setDtCadastro(jTConsultaMarca.getModel().getValueAt(jTConsultaMarca.getSelectedRow(), 2).toString());
            marca.setInSituacao(jTConsultaMarca.getModel().getValueAt(jTConsultaMarca.getSelectedRow(), 3).toString());
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "A pesquisa não retorna valores");
        }
    }//GEN-LAST:event_jBSelecionarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        marca.setCdMarca(0);
        marca.setDsMarca(null);
        marca.setDtCadastro(null);
        marca.setInSituacao(null);
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTConsultaMarca;
    private javax.swing.JTextField jTFDescricao;
    // End of variables declaration//GEN-END:variables
}
