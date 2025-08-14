/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vinicius_mardegan.atividade1408;

/**
 *
 * @author Vinícius Mardegan
 */
public class Professor extends Funcionario{
    private String titulacao;
    private int qntdPublicacao;
    private String linkCurriculo;

    public Professor(String titulacao, int qntdPublicacao, String linkCurriculo, int matricula, String nome, String telefone, String email, double salario) {
        super(matricula, nome, telefone, email, salario);
        this.titulacao = titulacao;
        this.qntdPublicacao = qntdPublicacao;
        this.linkCurriculo = linkCurriculo;
    }

    public Professor() {
        
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Titulacao: " + this.titulacao);
        System.out.println("Quantidade de Publicacoes: " + this.qntdPublicacao);
        System.out.println("Link do Curriculo: " + this.linkCurriculo);
        System.out.println("");
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getQntdPublicacao() {
        return qntdPublicacao;
    }

    public void setQntdPublicacao(int qntdPublicacao) {
        this.qntdPublicacao = qntdPublicacao;
    }

    public String getLinkCurriculo() {
        return linkCurriculo;
    }

    public void setLinkCurriculo(String linkCurriculo) {
        this.linkCurriculo = linkCurriculo;
    }
    
}
