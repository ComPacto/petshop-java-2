/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 05/05/2018 - 23:06
 * @version 1.0
 */
public class FuncionarioVO {
    private long idFuncionario;
    private String nome;
    private String endereco;
    private String funcao;
    private int cpf;
    private double salario;

    public FuncionarioVO() {
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "FuncionarioVO{" + "idFuncionario=" + idFuncionario + ", nome=" + nome + ", endereco=" + endereco + ", funcao=" + funcao + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
}
