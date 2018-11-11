/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

/**
 * @author Müller Gonçalves
 * @since 06/05/2018 - 00:02
 * @version 1.0
 */
public class DAOFactory {
    
    private static final AnimalDAO ADAO = new AnimalDAO();
    private static final ClienteDAO CDAO = new ClienteDAO();
    private static final FuncionarioDAO FDAO = new FuncionarioDAO();
    
    public static AnimalDAO getAnimalDAO(){
        return ADAO;
    }//fecha método
    
    public static ClienteDAO getClienteDAO(){
        return CDAO;
    }//fecha método
    
    public static FuncionarioDAO getFuncionarioDAO(){
        return FDAO;
    }//fecha método
    
}