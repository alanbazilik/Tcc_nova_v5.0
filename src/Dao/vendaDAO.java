/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.VendaModel;
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
public class vendaDAO {
          Connection con;
    PreparedStatement pgsql;
    Statement st;
    ResultSet rs;
    public ResultSet listafuncionario(int fk_codfuncionario)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from Venda where fk_codfuncionario = ?" 
                                                        + fk_codfuncionario;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }
   public ResultSet listacliente(int fk_cliente)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from Venda where fk_codcliente = ?" 
                                                        + fk_cliente;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }    
       public ResultSet listaproduto(int fk_codproduto)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from Venda where fk_codproduto = ?" 
                                                        + fk_codproduto;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }  
    
   public void Inseretelefone(VendaModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "insert into Venda"
                + "(datavenda,fk_codfuncionario,fk_codcliente,fk_codproduto,quantv,valorv)"
                + " values (?,?,?,?,?,?)";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getDatavenda());
            pgsql.setInt(2, gs.getFk_codfuncionario());
             pgsql.setInt(3, gs.getFk_codcliente());
             pgsql.setInt(4, gs.getFk_codproduto());
             pgsql.setFloat(5, gs.getQuantv());
             pgsql.setFloat(6, gs.getValorv());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "venda foi  Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Alteratipotel(VendaModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "UPDATE Venda SET "
                + "datavenda = ?,fk_codfuncionario = ?,fk_codcliente = ?,fk_codproduto = ?"
                + ",quantv = ?,valorv = ?"
                + "WHERE codvenda = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
           pgsql.setString(1, gs.getDatavenda());
            pgsql.setInt(2, gs.getFk_codfuncionario());
             pgsql.setInt(3, gs.getFk_codcliente());
             pgsql.setInt(4, gs.getFk_codproduto());
             pgsql.setFloat(5, gs.getQuantv());
             pgsql.setFloat(6, gs.getValorv());
             pgsql.setInt(7, gs.getCodvenda());
            

            
            int rowsUpdated = pgsql.executeUpdate();
            if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "O venda foi alterado com sucesso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
  public void Excluitipotel(VendaModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql ="delete from Venda where"
                + " codvenda = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCodvenda());
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "venda foi Excluído com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ResultSet PesquisarTodosTelefone(String data)
    {
           ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
       
        
        String sql = "select * from Venda where "
                + "upper(datavenda) like upper(?)";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + data + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                                     ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(pgsql.toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }    
}
