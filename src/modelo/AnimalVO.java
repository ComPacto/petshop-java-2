/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 05/05/2018 - 23:00
 * @version 1.0
 */
public class AnimalVO {
    private long idAnimal;
    private String nome;
    private String raca;
    private byte idade;
    private double peso;
    private String dono;

    public AnimalVO() {
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "AnimalVO{" + "idAnimal=" + idAnimal + ", nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso + ", dono=" + dono + '}';
    }
}
