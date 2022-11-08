/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CTR.marcaCTR;
import Model.marca_model;
import Sistemas_login.utilitarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static View.marca.id_marca;
import java.awt.Dimension;
import java.awt.Toolkit;



/**
 *
 * @author Alanbazilio
 */
public class marca extends javax.swing.JDialog {

    /**
     * Creates new form cidade
     */
    ResultSet rsfunc;
   marca objmar;
       public static int id_marca;
    String opcao;
     public static boolean button;
     int a = 1;
    marca_model objestado = new marca_model();
    public marca(java.awt.Frame parent, boolean modal) {
         super(parent, modal);
        initComponents();
                  Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        this.setBounds(0, 0, d.width = 800, d.height  = 600);
        setResizable(false);
        setFocusable(true);
         desativarBotoes();
         pesquisarMarca();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbmarca = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        produtos = new javax.swing.JTextField();
        cradastrar = new javax.swing.JButton();
        Alterar1 = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        buscardados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(469, 287));
        setSize(new java.awt.Dimension(469, 287));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE MARCAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 813, 59);

        tbmarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tbmarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tbmarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmarcaMouseClicked(evt);
            }
        });
        tbmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbmarcaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbmarca);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 60, 470, 460);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 60, 50, 14);

        produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosActionPerformed(evt);
            }
        });
        getContentPane().add(produtos);
        produtos.setBounds(0, 80, 120, 20);

        cradastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cradastrar.setText("Novo");
        cradastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cradastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cradastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cradastrar);
        cradastrar.setBounds(40, 300, 130, 36);

        Alterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        Alterar1.setText("Alterar");
        Alterar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Alterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alterar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Alterar1);
        Alterar1.setBounds(40, 380, 130, 36);

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        excluir.setText("Excluir");
        excluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(40, 420, 130, 36);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(40, 340, 130, 36);

        buscardados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        buscardados.setText("Atualizar dados");
        buscardados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscardadosActionPerformed(evt);
            }
        });
        getContentPane().add(buscardados);
        buscardados.setBounds(40, 460, 130, 36);

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cradastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cradastrarActionPerformed
        // TODO add your handling code here:  
         ativarBotoes();
        limparCampos();
         opcao = "Inserir";
        button = true;
        
    }//GEN-LAST:event_cradastrarActionPerformed

    private void buscardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscardadosActionPerformed
        pesquisarMarca();
    }//GEN-LAST:event_buscardadosActionPerformed

    private void Alterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alterar1ActionPerformed
        // TODO add your handling code here:
       Alterarmarca();
        pesquisarMarca();
         limparCampos();
    }//GEN-LAST:event_Alterar1ActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        if(opcao.equals("Inserir")){
          Inserirmarca();
           pesquisarMarca();
          limparCampos();
        }
     desativarBotoes();
    }//GEN-LAST:event_salvarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
                String [] options = new String[] {"Sim","Não"};
        
        Object ret = JOptionPane.showOptionDialog
    (null, "Tem certeza que deseja excluir: " 
            + produtos.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            Excluirmarca();
            limparCampos();
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void tbmarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmarcaMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2)
        {
            int linha = tbmarca.getSelectedRow();
            
       
            this.produtos.setText((String) tbmarca.getValueAt(linha, 0));
           
            
            marca.button = 
           (boolean) tbmarca.getValueAt(linha, 0);
                    
            this.dispose();
        }
        
    }//GEN-LAST:event_tbmarcaMouseClicked

    private void tbmarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbmarcaKeyPressed
        int linha = tbmarca.getSelectedRow();
            
           
            this.produtos.setText((String) tbmarca.getValueAt(linha, 1));
            id_marca = (int) tbmarca.getValueAt(linha, 0);
            opcao="Alterar";
            ativarBotoes();
        
            
           //marca.button = 
           //(boolean) tbmarca.getValueAt(linha, 0);
                    
           // this.dispose();
    }//GEN-LAST:event_tbmarcaKeyPressed

    private void produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtosActionPerformed

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
            java.util.logging.Logger.getLogger(marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                marca dialog = new marca(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
    }
 
    
    public void desativarBotoes()
    {
        salvar.setEnabled(false);
        produtos.setEnabled(false);
    }
    
    public void ativarBotoes()
    {
        salvar.setEnabled(true);
        produtos.setEnabled(true);
    }
    
 public void Inserirmarca()
    {
        marcaCTR objfunc = new marcaCTR();
        
        objfunc.InseremarcaCTR(produtos.getText());
    }
  public void limparCampos()
    {
    produtos.setText("");
    }
  
  public void pesquisarMarca()
    {
        marcaCTR objmarca = new marcaCTR();
        
        rsfunc = objmarca.PesquisarMarcaCTR(produtos.getText());
        
        preenche_item();
        
    }
  public void Alterarmarca()
    {
        int linha = tbmarca.getSelectedRow();
        
        marcaCTR objcli = new marcaCTR();
        
        objcli.AlteramarcaCTR(produtos.getText(),id_marca);
       
        
    }      
  
  public void preenche_item()
    {
     String [] colunas = {"CÓDIGO","MARCA_PRODUTO"};
        
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
                
                regVetor.add(rsfunc.getInt("cod_marca_produto"));
                regVetor.add(rsfunc.getString("marca_produto"));
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            tbmarca.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(marca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
      public void Excluirmarca()
    {
        int linha = tbmarca.getSelectedRow();
        
        marcaCTR objcli = new marcaCTR();
        
        objcli.ExcluimarcaCTR(id_marca);
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar1;
    public javax.swing.JButton buscardados;
    private javax.swing.JButton cradastrar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField produtos;
    private javax.swing.JButton salvar;
    public javax.swing.JTable tbmarca;
    // End of variables declaration//GEN-END:variables
}
