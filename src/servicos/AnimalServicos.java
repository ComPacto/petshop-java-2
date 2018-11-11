/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.AnimalDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.AnimalVO;

/**
 *
 * @author Müller Gonçalves
 * @since 06/05/2018 - 00:07
 * @version 1.0
 */
public class AnimalServicos {
    
    
    public void cadastrarAnimal(AnimalVO aVO) throws SQLException {
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        aDAO.cadastrarAnimal(aVO);
    }
    
    public void alterarAnimal(AnimalVO aVO) throws SQLException {
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        aDAO.alterarAnimal(aVO);
    }
    
    public ArrayList<AnimalVO> buscarAnimal() throws SQLException {
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        return aDAO.buscarAnimais();
    }
    
    public ArrayList<AnimalVO> filtrar(String query) throws SQLException {
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        return aDAO.filtrar(query);
    }
    
    public void deletarAnimal(long id) throws SQLException {
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        aDAO.deletarAnimal(id);
    }
}
