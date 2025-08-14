/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicius_mardegan.atividade1408;

/**
 *
 * @author Vinícius Mardegan
 */
public class Secretario extends Funcionario {
    private boolean chefeSecretaria;

    public Secretario(boolean chefeSecretaria, int matricula, String nome, String telefone, String email, double salario) {
        super(matricula, nome, telefone, email, salario);
        this.chefeSecretaria = chefeSecretaria;
    }
    
    public Secretario() {
        
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Chefe da Secretaria: " + chefeSecretaria);
        System.out.println("");
    }

    public boolean isChefeSecretaria() {
        return chefeSecretaria;
    }

    public void setChefeSecretaria(boolean chefeSecretaria) {
        this.chefeSecretaria = chefeSecretaria;
    }
    
}
