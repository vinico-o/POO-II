/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Vinícius Mardegan
 */
public class Cliente {
    private String nome;
    private String Sobrenome;
    private String cpf;

    public Cliente() {
        
    }
    
    public Cliente(String nome, String Sobrenome, String cpf) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.cpf = cpf;
    }
    
    public void exibir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.Sobrenome);
        System.out.println("CPF: " + this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
