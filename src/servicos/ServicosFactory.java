/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Müller Gonçalves
 * @since 06/05/2018 - 00:19
 * @version 1.0
 */
public class ServicosFactory {
    
    private static final AnimalServicos AS = new AnimalServicos();
    private static final ClienteServicos CS = new ClienteServicos();
    private static final FuncionarioServicos FS = new FuncionarioServicos();
    
    public static AnimalServicos getAnimalServicos() {
        return AS;
    }
    
    public static ClienteServicos getClienteServicos() {
        return CS;
    }
    
    public static FuncionarioServicos getFuncionarioServicos() {
        return FS;
    }
}
