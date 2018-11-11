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
import modelo.FuncionarioVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Müller Gonçalves
 * @since 04/04/2018 - 22:53
 * @version 1.0
 */
public class FuncionarioDAO {
    
    public void cadastrarFuncionario(FuncionarioVO fVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into funcionario(idfuncionario, nome, endereco, funcao, cpf, salario)"
                    + "values(null, '"+ fVO.getNome() +"', '"+ fVO.getEndereco()+"', '"+ fVO.getFuncao()+"', "+ fVO.getCpf()+", "+ fVO.getSalario() +")";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir funcionário!");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void alterarFuncionario(FuncionarioVO fVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "update funcionario set nome = '"+ fVO.getNome() +"', endereco = '"+ fVO.getEndereco()+"', funcao = '"+ fVO.getFuncao()+"', cpf = "+ fVO.getCpf() +", salario = "+ fVO.getSalario()+" where idfuncionario = "+ fVO.getIdFuncionario();
            
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar funcionário!");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<FuncionarioVO> buscarFuncionario() throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from funcionario";
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<FuncionarioVO> funcionario = new ArrayList<>();
            
            while (rs.next()) {
                FuncionarioVO f = new FuncionarioVO();
                
                f.setIdFuncionario(rs.getLong("idfuncionario"));
                f.setNome(rs.getString("nome"));
                f.setEndereco(rs.getString("endereco"));
                f.setFuncao(rs.getString("funcao"));
                f.setCpf(rs.getInt("cpf"));
                f.setSalario(rs.getDouble("salario"));
                
                funcionario.add(f);
            }
            
            return funcionario;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar funcionário! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<FuncionarioVO> filtrar(String query) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from funcionario " + query;
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<FuncionarioVO> funcionario = new ArrayList<>();
            
            while (rs.next()) {
                FuncionarioVO f = new FuncionarioVO();
                
                f.setIdFuncionario(rs.getLong("idfuncionario"));
                f.setNome(rs.getString("nome"));
                f.setEndereco(rs.getString("endereco"));
                f.setFuncao(rs.getString("funcao"));
                f.setCpf(rs.getInt("cpf"));
                f.setSalario(rs.getDouble("salario"));
                
                funcionario.add(f);
            }
            
            return funcionario;
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar funcionário! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarFuncionario(long id) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from funcionario where idfuncionario = " +id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar o funcionário! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}