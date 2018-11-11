/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ClienteVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Müller Gonçalves
 * @since 04/04/2018 - 22:53
 * @version 1.0
 */
public class ClienteDAO {
    
    public void cadastrarCliente(ClienteVO cVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into cliente(idcliente, nome, endereco, complemento, numero, cpf)"
                    + "values(null, '"+ cVO.getNome() +"', '"+ cVO.getEndereco()+"', '"+ cVO.getComplemento()+"', "+ cVO.getNumero()+", "+ cVO.getCpf()+")";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir cliente! " +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void alterarCliente(ClienteVO cVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "update cliente set nome = '"+ cVO.getNome() +"', endereco = '"+ cVO.getEndereco()+"', complemento = '"+ cVO.getComplemento()+"', numero = "+ cVO.getNumero() +", cpf = "+ cVO.getCpf()+" where idcliente = "+ cVO.getIdCliente();
            
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar cliente!");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<ClienteVO> buscarCliente() throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from cliente";
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<ClienteVO> cliente = new ArrayList<>();
            
            while (rs.next()) {
                ClienteVO c = new ClienteVO();
                
                c.setIdCliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setComplemento(rs.getString("complemento"));
                c.setNumero(rs.getInt("numero"));
                c.setCpf(rs.getInt("cpf"));
                
                cliente.add(c);
            }
            
            return cliente;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar cliente! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<ClienteVO> filtrar(String query) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from cliente " + query;
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<ClienteVO> cliente = new ArrayList<>();
            
            while (rs.next()) {
                ClienteVO c = new ClienteVO();
                
                c.setIdCliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setComplemento(rs.getString("complemento"));
                c.setNumero(rs.getInt("numero"));
                c.setCpf(rs.getInt("cpf"));
                
                cliente.add(c);
            }
            
            return cliente;
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarCliente(long id) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from cliente where idcliente = " +id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar o cliente! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}