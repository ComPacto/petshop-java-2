/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ClienteVO;

/**
 *
 * @author Müller Gonçalves
 * @since 06/05/2018 - 00:07
 * @version 1.0
 */
public class ClienteServicos {
    
    
    public void cadastrarCliente(ClienteVO cVO) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarCliente(cVO);
    }
    
    public void alterarCliente(ClienteVO cVO) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.alterarCliente(cVO);
    }
    
    public ArrayList<ClienteVO> buscarCliente() throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.buscarCliente();
    }
    
    public ArrayList<ClienteVO> filtrar(String query) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.filtrar(query);
    }
    
    public void deletarCliente(long id) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarCliente(id);
    }
}
