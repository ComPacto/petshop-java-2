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
import modelo.AnimalVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Müller Gonçalves
 * @since 04/04/2018 - 22:53
 * @version 1.0
 */
public class AnimalDAO {
    
    public void cadastrarAnimal(AnimalVO aVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into animal(idanimal, nome, raca, idade, peso, dono)"
                    + "values(null, '"+ aVO.getNome() +"', '"+ aVO.getRaca() +"', "+ aVO.getIdade() +", "+ aVO.getPeso() +", '"+ aVO.getDono() +"')";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir animal!");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void alterarAnimal(AnimalVO aVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "update animal set nome = '"+ aVO.getNome() +"', raca = '"+ aVO.getRaca() +"', idade = "+ aVO.getIdade() +", peso = "+ aVO.getPeso() +", dono = '"+ aVO.getDono() +"' where idanimal = "+ aVO.getIdAnimal();
            
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar animal!");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<AnimalVO> buscarAnimais() throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from animal";
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<AnimalVO> animal = new ArrayList<>();
            
            while (rs.next()) {
                AnimalVO a = new AnimalVO();
                
                a.setIdAnimal(rs.getLong("idanimal"));
                a.setNome(rs.getString("nome"));
                a.setRaca(rs.getString("raca"));
                a.setIdade(rs.getByte("idade"));
                a.setPeso(rs.getDouble("peso"));
                a.setDono(rs.getString("dono"));
                
                animal.add(a);
            }
            
            return animal;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar animal! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<AnimalVO> filtrar(String query) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from animal " + query;
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<AnimalVO> animal = new ArrayList<>();
            
            while (rs.next()) {
                AnimalVO a = new AnimalVO();
                
                a.setIdAnimal(rs.getLong("idanimal"));
                a.setNome(rs.getString("nome"));
                a.setRaca(rs.getString("raca"));
                a.setIdade(rs.getByte("idade"));
                a.setPeso(rs.getDouble("peso"));
                a.setDono(rs.getString("dono"));
                
                animal.add(a);
            }
            
            return animal;
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar animal! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarAnimal(long id) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from animal where idanimal = " +id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar o animal! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
