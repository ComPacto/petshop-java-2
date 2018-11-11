/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 05/05/2018 - 23:03 
 * @version 1.0
 */
public class ClienteVO {
    private long idCliente;
    private String nome;
    private String endereco;
    private String complemento;
    private int numero;
    private int cpf;

    public ClienteVO() {
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClienteVO{" + "idCliente=" + idCliente + ", complemento=" + complemento + ", nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + ", cpf=" + cpf + '}';
    }
}
