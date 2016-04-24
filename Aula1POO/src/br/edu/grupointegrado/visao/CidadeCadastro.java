package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassCidade;
import br.edu.grupointegrado.controle.ClassUF;
import br.edu.grupointegrado.ferramentas.LimparCampos;
import br.edu.grupointegrado.ferramentas.PreencherJTableGenerico;
import br.edu.grupointegrado.ferramentas.Rotinas;
import br.edu.grupointegrado.ferramentas.ValidaCampos;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CrasyFox
 */
public class CidadeCadastro extends javax.swing.JFrame {

    ClassCidade cidade = new ClassCidade();
    PreencherJTableGenerico preencherJT = new PreencherJTableGenerico();
    ClassUF uf = new ClassUF();
    private int chave[];
    int situacao;
    LimparCampos limpar = new LimparCampos();
    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    ValidaCampos validaCampos = new ValidaCampos();
    
    public CidadeCadastro() {
        initComponents();
        situacao = Rotinas.PADRAO;
        preencherJT.alinharJTable(jTConsulta, new int[]{80, 200, 80});
        jTFCodigo.setText(cidade.autoIncrem("CIDADE", "CD_CIDADE"));
        jTFData.setText(formatador.format(data));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPCidade = new javax.swing.JTabbedPane();
        jPCadastro = new javax.swing.JPanel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBTNovo = new javax.swing.JButton();
        jBTCancelar = new javax.swing.JButton();
        jBTAlterar = new javax.swing.JButton();
        jBTExcluir = new javax.swing.JButton();
        jBTGravar = new javax.swing.JButton();
        jLCidade = new javax.swing.JLabel();
        JTFUF = new javax.swing.JTextField();
        JTFDescricao = new javax.swing.JTextField();
        JBPesquisaEstado = new javax.swing.JButton();
        jTFData = new javax.swing.JTextField();
        jBCarregar = new javax.swing.JButton();
        jPConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsulta = new javax.swing.JTable();
        jCbTipo = new javax.swing.JComboBox<>();
        jTFConsulta = new javax.swing.JTextField();
        jBTConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de cidade");

        jTPCidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTPCidadeStateChanged(evt);
            }
        });

        jTFCodigo.setColumns(1);

        jLabel1.setText("Código");

        jTFCidade.setToolTipText("Descrição da cidade");
        jTFCidade.setName("DS_CIDADE"); // NOI18N
        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Cidade");

        jLabel3.setText("Estado");

        jBTNovo.setText("Novo");
        jBTNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNovoActionPerformed(evt);
            }
        });

        jBTCancelar.setText("Cancelar");

        jBTAlterar.setText("Alterar");
        jBTAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAlterarActionPerformed(evt);
            }
        });

        jBTExcluir.setText("Excluir");
        jBTExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTExcluirActionPerformed(evt);
            }
        });

        jBTGravar.setText("Gravar");
        jBTGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTGravarActionPerformed(evt);
            }
        });

        jLCidade.setText("Cidade");

        JTFUF.setEditable(false);

        JTFDescricao.setEditable(false);
        JTFDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescricaoActionPerformed(evt);
            }
        });

        JBPesquisaEstado.setText("...");
        JBPesquisaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisaEstadoActionPerformed(evt);
            }
        });

        jBCarregar.setText("Carregar");

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(JTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBPesquisaEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCidade)
                                    .addGroup(jPCadastroLayout.createSequentialGroup()
                                        .addComponent(JTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(jTFData, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBCarregar))))))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jBTAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jBTExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jBTGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jBTCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCadastroLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jBTNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(593, Short.MAX_VALUE)))
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLCidade))
                .addGap(2, 2, 2)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisaEstado)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCarregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBTCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jBTExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jBTAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                    .addContainerGap(208, Short.MAX_VALUE)
                    .addComponent(jBTNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTPCidade.addTab("Cadastro", jPCadastro);

        jPConsulta.setOpaque(false);

        jTConsulta.setAutoCreateRowSorter(true);
        jTConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cidade", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTConsulta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTConsulta);

        jCbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Código", "Descrição" }));
        jCbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTipoActionPerformed(evt);
            }
        });

        jBTConsulta.setText("Consultar");
        jBTConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBTConsulta)
                .addGap(24, 24, 24))
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTConsulta))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPCidade.addTab("Consulta", jPConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPCidade)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPCidade)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(716, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBTConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTConsultaActionPerformed
        switch (jCbTipo.getSelectedIndex()) {
            case 0:
                preencherJT.preencherJtableGenerico(jTConsulta, cidade.consultaGeral());
                break;

            case 1:
                cidade.setCodcidade(Integer.parseInt(jTFConsulta.getText()));
                preencherJT.preencherJtableGenerico(jTConsulta, cidade.consultaCodigo());
                break;

            case 2:
                cidade.setDescidade(jTFConsulta.getText());
                preencherJT.preencherJtableGenerico(jTConsulta, cidade.consultaDescricao());
                break;
        }
    }//GEN-LAST:event_jBTConsultaActionPerformed

    private void jCbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbTipoActionPerformed

    private void jTPCidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTPCidadeStateChanged

    }//GEN-LAST:event_jTPCidadeStateChanged

    private void jTConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTConsultaMouseClicked
        if (evt.getClickCount() >= 2) {
            String x = (String) jTConsulta.getValueAt(jTConsulta.getSelectedRow(), 0);
            cidade.setCodcidade(Integer.parseInt(x));
            cidade.retornaCidade();
            this.fillCampos();
            jTPCidade.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jTConsultaMouseClicked

    private void jBTGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTGravarActionPerformed
        validaCampos.validaCamposObrigatorios(jPCadastro, "CIDADE");
        if(validaCampos.getRetorno()){
            switch (situacao) {
            case Rotinas.INCLUIR:
                cidade.setDescidade(jTFCidade.getText());
                cidade.setDescuf(JTFUF.getText());
                cidade.incluirCidade();
                break;

            case Rotinas.ALTERAR:
                cidade.setCodcidade(Integer.parseInt(jTFCodigo.getText()));
                cidade.setDescidade(jTFCidade.getText());
                cidade.setDescuf(JTFUF.getText());
                cidade.alterarCidade();
                ;
                break;

            default:
                situacao = Rotinas.PADRAO;
                break;
        }
        limpar.limparCampos(jPCadastro);
        }
    }//GEN-LAST:event_jBTGravarActionPerformed

    private void jBTExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTExcluirActionPerformed

    }//GEN-LAST:event_jBTExcluirActionPerformed

    private void jBTAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTAlterarActionPerformed
        situacao = Rotinas.ALTERAR;
    }//GEN-LAST:event_jBTAlterarActionPerformed

    private void jBTNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNovoActionPerformed
        situacao = Rotinas.INCLUIR;
    }//GEN-LAST:event_jBTNovoActionPerformed

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

    private void JTFDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescricaoActionPerformed

    private void JBPesquisaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisaEstadoActionPerformed
        final ConsultaUF consultauf = new ConsultaUF(this, true, uf);
        consultauf.setVisible(true);

        consultauf.addWindowListener(
                new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                JTFUF.setText(uf.getDsUF());
                JTFDescricao.setText(uf.getNmUF());
            }
        }
        );
    }//GEN-LAST:event_JBPesquisaEstadoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPesquisaEstado;
    private javax.swing.JTextField JTFDescricao;
    private javax.swing.JTextField JTFUF;
    private javax.swing.JButton jBCarregar;
    private javax.swing.JButton jBTAlterar;
    private javax.swing.JButton jBTCancelar;
    private javax.swing.JButton jBTConsulta;
    private javax.swing.JButton jBTExcluir;
    private javax.swing.JButton jBTGravar;
    private javax.swing.JButton jBTNovo;
    private javax.swing.JComboBox<String> jCbTipo;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPCadastro;
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTConsulta;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFConsulta;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTabbedPane jTPCidade;
    // End of variables declaration//GEN-END:variables

    public void fillCampos() {
        jTFCodigo.setText(Integer.toString(cidade.getCodcidade()));
        jTFCidade.setText(cidade.getDescidade());
        cidade.setDescuf(JTFUF.getText());
    }

}
