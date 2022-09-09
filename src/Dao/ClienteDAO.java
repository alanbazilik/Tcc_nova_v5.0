/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alang
 */
public class ClienteDAO {
       Connection con;
    PreparedStatement pgsql;
    Statement st;
    ResultSet rs;
    public ResultSet listabairro(int fk_bairro)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from Cliente where fk_bairro = ?" 
                                                        + fk_bairro;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }
   public ResultSet listarcidade(int fk_cidade)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from Cliente where fk_cidade = ?" 
                                                        + fk_cidade;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }    
       public ResultSet listatelefone(int fk_codtelefone)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from Cliente where fk_codtelefone = ?" 
                                                        + fk_codtelefone;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }  
           public ResultSet listarua(int fk_codrua)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from Cliente where fk_codrua = ?" 
                                                        + fk_codrua;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }  
   public void Inseretelefone(ClienteModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "insert into Cliente"
                + "(nome_cliente,rg,cpf,fk_bairro,fk_cidade,fk_codtelefone,fk_codrua,numerocasa)"
                + " values (?,?,?,?,?,?,?,?)";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_Cliente());
            pgsql.setString(2, gs.getRg());
             pgsql.setString(3, gs.getCpf());
             pgsql.setInt(4, gs.getFk_bairro());
             pgsql.setInt(5, gs.getFk_cidade());
             pgsql.setInt(6, gs.getFk_codtelefone());
            pgsql.setInt(7, gs.getFk_codrua());
            pgsql.setString(8, gs.getNumerocasa());
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente foi  Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Alteratipotel(ClienteModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "UPDATE Cliente SET "
                + "nome_cliente = ?,rg = ?,cpf = ?,fk_bairro = ?"
                + ",fk_cidade = ?,fk_codtelefone = ?,fk_codrua = ?,numerocasa = ?"
                + "WHERE cod_cliente = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
      pgsql.setString(1, gs.getNome_Cliente());
            pgsql.setString(2, gs.getRg());
             pgsql.setString(3, gs.getCpf());
             pgsql.setInt(4, gs.getFk_bairro());
             pgsql.setInt(5, gs.getFk_cidade());
             pgsql.setInt(6, gs.getFk_codtelefone());
            pgsql.setInt(7, gs.getFk_codrua());
            pgsql.setString(8, gs.getNumerocasa());
             pgsql.setInt(9, gs.getCod_Cliente());
            

            
            int rowsUpdated = pgsql.executeUpdate();
            if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "O Cliente foi alterado com sucesso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
  public void Excluitipotel(ClienteModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql ="delete from Cliente where"
                + " cod_cliente = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_Cliente());
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente foi Excluído com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ResultSet PesquisarTodos(String nome_cliente)
    {
           ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
       
        
        String sql = "select * from Cliente where "
                + "upper(nome_cliente) like upper(?)";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome_cliente + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                                     ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(pgsql.toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }    
}
