/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.FuncionarioDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FuncionarioVO;

/**
 *
 * @author Müller Gonçalves
 * @since 06/05/2018 - 00:07
 * @version 1.0
 */
public class FuncionarioServicos {
    
    
    public void cadastrarFuncionario(FuncionarioVO fVO) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.cadastrarFuncionario(fVO);
    }
    
    public void alterarFuncionario(FuncionarioVO fVO) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.alterarFuncionario(fVO);
    }
    
    public ArrayList<FuncionarioVO> buscarFuncionario() throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.buscarFuncionario();
    }
    
    public ArrayList<FuncionarioVO> filtrar(String query) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.filtrar(query);
    }
    
    public void deletarFuncionario(long id) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.deletarFuncionario(id);
    }
}