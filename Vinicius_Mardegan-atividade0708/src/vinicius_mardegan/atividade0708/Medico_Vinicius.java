/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vinicius_mardegan.atividade0708;
import java.time.LocalDate;
/**
 *
 * @author Vinícius Mardegan
 */
public class Medico_Vinicius {
    private int CRM;
    private String nome;
    private String especialidade;
    private LocalDate dataContratacao;
    private double salario;

    public Medico_Vinicius() {
    }

    public Medico_Vinicius(int CRM, String nome, String especialidade, String dataContratacao, double salario) {
        this.CRM = CRM;
        this.nome = nome;
        this.especialidade = especialidade;
        this.dataContratacao = LocalDate.parse(dataContratacao);
        this.salario = salario;
    }
    
    public void imprime() {
        System.out.println("CRM: " + this.CRM);
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Data Contratacao: " + this.dataContratacao);
        System.out.println("Salario: " + this.salario);
        System.out.println("");
    }

    public int getCRM() {
        return CRM;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
