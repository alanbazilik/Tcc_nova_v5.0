/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import CTR.FuncionarioCTR;
import Model.CidadeModel;
import Model.bairroModel;
import Model.telefoneModel;
import Model.RuaModel;
import Sistemas_login.utilitarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class tela_funcionario extends javax.swing.JFrame {

    /**
     * Creates new form tela_funcionario
     */
    public static int id_funcionario;
    public static int fkcod_cidade;
    ResultSet rsfunc;
    String opcao;
    List<CidadeModel> listcidade;
    List<bairroModel> listbairro;
    List<telefoneModel> listtelefone;
    List<RuaModel> listrua;
    static boolean button;

    public tela_funcionario() {
        initComponents();
        desativarBotoes();
        carregabairrocmb();
        carregacidadecmb();
        carregaruacmb();
        carregatelefonecmb();
        utilitarios u = new utilitarios();
        u.inserirIcone(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        funcionario = new javax.swing.JTextField();
        rua = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bairro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cidade = new javax.swing.JComboBox<>();
        telefone = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        casa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        funcionariotable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tela_princial = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        rg = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(790, 410));
        setMinimumSize(new java.awt.Dimension(790, 410));
        setPreferredSize(new java.awt.Dimension(790, 410));
        setResizable(false);
        setSize(new java.awt.Dimension(790, 410));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Funcionario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 65, 110, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rg:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 90, 30, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cpf:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 120, 40, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bairro:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 150, 60, 25);

        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });
        getContentPane().add(funcionario);
        funcionario.setBounds(110, 70, 130, 19);

        rua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(rua);
        rua.setBounds(50, 210, 120, 24);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cidade:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 180, 70, 25);

        bairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(bairro);
        bairro.setBounds(70, 150, 120, 24);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 230, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rua:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 200, 50, 25);

        cidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cidade);
        cidade.setBounds(70, 180, 120, 24);

        telefone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(telefone);
        telefone.setBounds(90, 240, 100, 24);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nº.casa:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 260, 80, 25);
        getContentPane().add(casa);
        casa.setBounds(80, 270, 100, 19);

        funcionariotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        funcionariotable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcionariotableMouseClicked(evt);
            }
        });
        funcionariotable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                funcionariotableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(funcionariotable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 60, 560, 350);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tela funcionário");

        tela_princial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reserva-64.png"))); // NOI18N
        tela_princial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tela_princial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tela_princialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                .addComponent(tela_princial))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tela_princial))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 801, 59);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(10, 300, 60, 40);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(66, 300, 70, 40);

        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        getContentPane().add(deletar);
        deletar.setBounds(10, 340, 60, 40);

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(70, 340, 66, 40);

        atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(190, 360, 50, 50);

        try {
            rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(rg);
        rg.setBounds(40, 90, 120, 19);

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(cpf);
        cpf.setBounds(50, 119, 110, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 710, 444);

        setSize(new java.awt.Dimension(817, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tela_princialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tela_princialMouseClicked
        // TODO add your handling code here:
        Tela_principal telasp = new Tela_principal();
        telasp.setVisible(true);
    }//GEN-LAST:event_tela_princialMouseClicked

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionarioActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        inserefuncionario();
        limparCampos();
            desativarBotoes();
        pesquisarfuncionaro();
    }//GEN-LAST:event_salvarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        ativarBotoes();
        limparCampos();
        opcao = "Inserir";
        button = true;
    }//GEN-LAST:event_cadastrarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        String[] options = new String[]{"Sim", "Não"};

        Object ret = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir: "
                + funcionario.getText() + "?", "AVISO", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (options[Integer.valueOf(ret.toString())].equals("Sim")) {
            excluirfuncionaro();
            limparCampos();
                desativarBotoes();
            pesquisarfuncionaro();
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        alterafuncionario();
        limparCampos();
        desativarBotoes();
        pesquisarfuncionaro();
    }//GEN-LAST:event_alterarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        // TODO add your handling code here:
        pesquisarfuncionaro();
    }//GEN-LAST:event_atualizarActionPerformed

    private void funcionariotableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funcionariotableKeyPressed
        int linha = funcionariotable.getSelectedRow();

        this.funcionario.setText((String) funcionariotable.getValueAt(linha, 1));
        this.rg.setText((String) funcionariotable.getValueAt(linha, 2));
        this.cpf.setText((String) funcionariotable.getValueAt(linha, 3));
        this.casa.setText((String) funcionariotable.getValueAt(linha, 8));
        id_funcionario = (int) funcionariotable.getValueAt(linha, 0);

        opcao = "Alterar";
        ativarBotoes();
    }//GEN-LAST:event_funcionariotableKeyPressed

    private void funcionariotableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionariotableMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = funcionariotable.getSelectedRow();

            this.funcionario.setText((String) funcionariotable.getValueAt(linha, 1));
            this.rg.setText((String) funcionariotable.getValueAt(linha, 2));
            this.cpf.setText((String) funcionariotable.getValueAt(linha, 3));
            this.casa.setText((String) funcionariotable.getValueAt(linha, 8));

            tela_funcionario.button
                    = (boolean) funcionariotable.getValueAt(linha, 0);

            this.dispose();
        }
    }//GEN-LAST:event_funcionariotableMouseClicked

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
            java.util.logging.Logger.getLogger(tela_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_funcionario().setVisible(true);
            }
        });

    }

    public void desativarBotoes() {
        salvar.setEnabled(false);
        deletar.setEnabled(false);
        funcionario.setEnabled(false);
        rg.setEnabled(false);
        cpf.setEnabled(false);
        bairro.setEnabled(false);
        cidade.setEnabled(false);
        telefone.setEnabled(false);
        rua.setEnabled(false);
        casa.setEnabled(false);
    }

    public void ativarBotoes() {
        salvar.setEnabled(true);
        deletar.setEnabled(true);
        funcionario.setEnabled(true);
        rg.setEnabled(true);
        cpf.setEnabled(true);
        bairro.setEnabled(true);
        cidade.setEnabled(true);
        telefone.setEnabled(true);
        rua.setEnabled(true);
        casa.setEnabled(true);
    }

    public void limparCampos() {
        funcionario.setText("");
        rg.setText("");
        cpf.setText("");
        casa.setText("");
    }

    public void carregacidadecmb() {
        FuncionarioCTR objtel = new FuncionarioCTR();
        listcidade = objtel.carregaCombocidade();

        cidade.removeAllItems();
        int i = 0;

        while (i < listcidade.size()) {
            cidade.addItem(listcidade.get(i).getNomecidade());
            i++;
        }

    }

    public void carregaruacmb() {
        FuncionarioCTR objtel = new FuncionarioCTR();
        listrua = objtel.carregaComboRua();

        rua.removeAllItems();
        int i = 0;

        while (i < listrua.size()) {
            rua.addItem(listrua.get(i).getNomerua());
            i++;
        }

    }

    public void carregatelefonecmb() {
        FuncionarioCTR objtel = new FuncionarioCTR();
        listtelefone = objtel.carregaCombotelefone();

        telefone.removeAllItems();
        int i = 0;

        while (i < listrua.size()) {
            telefone.addItem(listtelefone.get(i).getNumerotel());
            i++;
        }

    }

    public void carregabairrocmb() {
        FuncionarioCTR objtel = new FuncionarioCTR();
        listbairro = objtel.carregaCombobairro();

        bairro.removeAllItems();
        int i = 0;

        while (i < listbairro.size()) {
            bairro.addItem(listbairro.get(i).getBairros());
            i++;
        }

    }

    public void inserefuncionario() {
        FuncionarioCTR objfuncionario = new FuncionarioCTR();
        objfuncionario.InserefuncionarioCTR(
                funcionario.getText(), rg.getText(), cpf.getText(),
                listbairro.get(bairro.getSelectedIndex()).getCodbairro(),
                listcidade.get(cidade.getSelectedIndex()).getCodcidade(),
                listtelefone.get(telefone.getSelectedIndex()).getCodtelefone(),
                listrua.get(rua.getSelectedIndex()).getCodrua(), casa.getText());

    }

    public void alterafuncionario() {
        FuncionarioCTR objfuncionario = new FuncionarioCTR();
        objfuncionario.AlterafuncionarioCTR(
                funcionario.getText(), rg.getText(), cpf.getText(),
                listbairro.get(bairro.getSelectedIndex()).getCodbairro(),
                listcidade.get(cidade.getSelectedIndex()).getCodcidade(),
                listtelefone.get(telefone.getSelectedIndex()).getCodtelefone(),
                listrua.get(rua.getSelectedIndex()).getCodrua(), casa.getText(), id_funcionario);

    }

    public void excluirfuncionaro() {
        int linha = funcionariotable.getSelectedRow();

        FuncionarioCTR objcli = new FuncionarioCTR();

        objcli.ExcluifuncionaroCTR(id_funcionario);
    }

    public void pesquisarfuncionaro() {
        FuncionarioCTR objfunc = new FuncionarioCTR();
        rsfunc = objfunc.PesquisarfuncionaroCTR(funcionario.getText());

        preenche_item();

    }

    public void preenche_item() {
        String[] colunas = {"Codigo", "Funcionario", "Rg", "Cpf", "Bairro", "Cidade", "Rua", "Telefone", "Nº.Casa"};

        String[][] linhas = {};

        DefaultTableModel tablemodel = new DefaultTableModel(linhas, colunas) {
            public boolean CelulaEditavel(int rowIndex, int mColIndex) {
                return true;
            }
        };

        Vector<Vector> dados = new Vector();

        try {
            while (rsfunc.next()) {
                Vector regVetor = new Vector();

                regVetor.add(rsfunc.getInt("cod_funcionario"));
                regVetor.add(rsfunc.getString("nome_funcionario"));
                regVetor.add(rsfunc.getString("rg"));
                regVetor.add(rsfunc.getString("cpf"));
                regVetor.add(rsfunc.getInt("fk_bairro"));
                regVetor.add(rsfunc.getInt("fk_cidade"));
                regVetor.add(rsfunc.getInt("fk_codtelefone"));
                regVetor.add(rsfunc.getInt("fk_codrua"));
                regVetor.add(rsfunc.getString("numerocasa"));
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            funcionariotable.setModel(tablemodel);

        } catch (SQLException ex) {
            Logger.getLogger(tela_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JComboBox<String> bairro;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField casa;
    private javax.swing.JComboBox<String> cidade;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JButton deletar;
    private javax.swing.JTextField funcionario;
    private javax.swing.JTable funcionariotable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JComboBox<String> rua;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel tela_princial;
    private javax.swing.JComboBox<String> telefone;
    // End of variables declaration//GEN-END:variables
}
