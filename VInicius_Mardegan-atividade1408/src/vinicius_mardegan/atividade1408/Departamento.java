/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicius_mardegan.atividade1408;

import java.util.ArrayList;
/**
 *
 * @author Vinícius Mardegan
 */
public class Departamento {
    private String nome;
    private String telefone;
    private String email;
    private ArrayList <Funcionario> funcionarios;

    public Departamento(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.funcionarios = new ArrayList();
    }
    
    public Departamento() {
        
    }
    
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public boolean buscarFuncionario(int matricula) {
        for(int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).getMatricula() == matricula) {
                return true;
            }
        }
        
        return false;
    }
    
    public void excluirFuncionario(int matricula) {
        if(!funcionarios.isEmpty()) {
            for(int i = 0; i < funcionarios.size(); i++) {
                if(funcionarios.get(i).getMatricula() == matricula) {
                    funcionarios.remove(i);
                    
                    System.out.println("Funcionario Removido!");
                    return;
                }
            }
        } else {
            System.out.println("Nao foi possivel Remover");
        }
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
        System.out.println("");
        System.out.println("Funcionarios: ");
        for(int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).imprimir();
        }
    }

    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
