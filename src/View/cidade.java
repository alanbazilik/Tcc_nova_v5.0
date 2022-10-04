/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CTR.CidadeCTR;
import CTR.TelefoneCTR;
import Model.EstadoModel;
import Sistemas_login.utilitarios;
import static View.cidade.id_cidade;
import static View.tela_telefone.button;
import static View.tela_telefone.id_tel;
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
 * @author Alanbazilio
 */
public class cidade extends javax.swing.JFrame {

    /**
     * Creates new form cidade
     */
        public static int id_cidade;
    public static int fkcod_cidade;
    ResultSet rsfunc;
    String opcao;
    List<EstadoModel> listcidade;
    public cidade() {
        initComponents();
        carregaestadocmb();
        desativarBotoes();
         pesquisartel();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        uf = new javax.swing.JComboBox<String>();
        deletar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cidadetabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(704, 331));
        setMinimumSize(new java.awt.Dimension(704, 331));
        setPreferredSize(new java.awt.Dimension(704, 331));
        setSize(new java.awt.Dimension(704, 331));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE CIDADES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 813, 59);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 80, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cidade:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 60, 70, 20);

        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cidade);
        cidade.setBounds(50, 60, 160, 20);

        uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(uf);
        uf.setBounds(50, 80, 160, 20);

        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        getContentPane().add(deletar);
        deletar.setBounds(10, 230, 50, 50);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(10, 180, 50, 50);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(70, 180, 50, 50);

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        alterar.setActionCommand("alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(70, 230, 50, 50);

        atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        atualizar.setToolTipText("");
        atualizar.setActionCommand("refesh");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(160, 240, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-60, 60, 270, 240);

        cidadetabela.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.black));
        cidadetabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        cidadetabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cidadetabelaMouseClicked(evt);
            }
        });
        cidadetabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cidadetabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(cidadetabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 60, 480, 230);

        setSize(new java.awt.Dimension(704, 331));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
            ativarBotoes();
        limparCampos();
        opcao = "Inserir";
        button = true;
    }//GEN-LAST:event_cadastrarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
                String [] options = new String[] {"Sim","Não"};

        Object ret = JOptionPane.showOptionDialog
        (null, "Tem certeza que deseja excluir: "
            + cidade.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            excluircidade();
            limparCampos();
              pesquisartel();
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
         Inserircidade();
         limparCampos();
          pesquisartel();
    }//GEN-LAST:event_salvarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        alterarcidade();
         limparCampos();
        pesquisartel();
    }//GEN-LAST:event_alterarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        // TODO add your handling code here:
        pesquisartel();
    }//GEN-LAST:event_atualizarActionPerformed

    private void cidadetabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cidadetabelaMouseClicked
            if(evt.getClickCount() == 2)
        {
            int linha = cidadetabela.getSelectedRow();
            
       
            this.cidade.setText((String) cidadetabela.getValueAt(linha, 0));
          
            
            tela_tipotelefone.button = 
           (boolean) cidadetabela.getValueAt(linha, 0);
                    
            this.dispose();
        }
    }//GEN-LAST:event_cidadetabelaMouseClicked

    private void cidadetabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidadetabelaKeyPressed
         int linha = cidadetabela.getSelectedRow();
            
           
            this.cidade.setText((String) cidadetabela.getValueAt(linha, 1));
            id_cidade= (int) cidadetabela.getValueAt(linha, 0);
   
            opcao="Alterar";
            ativarBotoes();
    }//GEN-LAST:event_cidadetabelaKeyPressed

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
            java.util.logging.Logger.getLogger(cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cidade().setVisible(true);
            }
        });
    }
    public void desativarBotoes()
    {
        salvar.setEnabled(false);
        cidade.setEnabled(false);
      uf.setEnabled(false);
    }
    
    public void ativarBotoes()
    {
        salvar.setEnabled(true);
        cidade.setEnabled(true);
        uf.setEnabled(true);
    }
      public void limparCampos()
    {
          cidade.setText("");
    }
public void carregaestadocmb()
    {
        CidadeCTR objtel = new CidadeCTR();
        listcidade = objtel.carregaCombo();
        
        uf.removeAllItems();
        int i = 0;
        
        while(i < listcidade.size())
        {
            uf.addItem(listcidade.get(i).getNomeestado());
            i++;
        }
       
    }
 public void preenche_item()
    {
     String [] colunas = {"Codigo","Nome_cidade","Estado"};
        
        String [][] linhas ={};
        
        DefaultTableModel tablemodel = new DefaultTableModel(linhas,colunas)
        {
            public boolean CelulaEditavel(int rowIndex, int mColIndex)
            {
                return true;
            }
        };
        
        Vector <Vector> dados = new Vector();
        
        try {
            while(rsfunc.next())
            {
                Vector regVetor = new Vector();
                
                regVetor.add(rsfunc.getInt("codcidade"));
                regVetor.add(rsfunc.getString("nomecidade"));
                regVetor.add(rsfunc.getString("nome_estado"));
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            cidadetabela.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Bairros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Inserircidade()
    {
        CidadeCTR objcli = new  CidadeCTR();
        
        objcli.InserecidadeCTR(
                cidade.getText(), 
            listcidade.get(uf.getSelectedIndex()).getCod_estado());
    }
    public  void alterarcidade(){
         CidadeCTR objcli = new  CidadeCTR();
        objcli.AlteracidadeCTR(
                cidade.getText(), 
            listcidade.get(uf.getSelectedIndex()).getCod_estado(),id_cidade);
    
    }
    public  void excluircidade(){
      int linha = cidadetabela.getSelectedRow();
        
        CidadeCTR objcli = new CidadeCTR();
        
        objcli.ExcluitelCTR(id_cidade);
    }
          public void pesquisartel()
    {
         CidadeCTR objfunc = new CidadeCTR();
        rsfunc = objfunc.PesquisartelCTR(cidade.getText());
        
        preenche_item();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cidade;
    private javax.swing.JTable cidadetabela;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> uf;
    // End of variables declaration//GEN-END:variables
}
