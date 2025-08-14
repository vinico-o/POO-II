/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicius_mardegan.atividade1408;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("depto1", "(xx)xxxxx-xxxx", "xxxxxxx@gmail.com");
        
        Secretario sec1 = new Secretario(true, 100, "secretario1", "telsec1", "emailsec1", 10000.0);
        Secretario sec2 = new Secretario(true, 200, "secretario2", "telsec2", "emailsec2", 11111.0);
        Professor prof1 = new Professor("Doutor", 15, "lattes.prof1", 300, "professor1", "telprof1", "emailprof1", 15000.0);
        Professor prof2 = new Professor("Mestre", 8, "lattes.prof2", 400, "professor2", "telprof2", "emailprof2", 12000.0);
        
        System.out.println("ADICIONANDO FUNCIONARIOS: ");
        departamento.adicionarFuncionario(sec1);
        departamento.adicionarFuncionario(sec2);
        departamento.adicionarFuncionario(prof1);
        departamento.adicionarFuncionario(prof2);
        departamento.imprimir();
        
        System.out.println("REMOVENDO FUNCIONARIO COM MATRICULA 100: ");
        departamento.excluirFuncionario(100);
        System.out.println("REMOVENDO FUNCIONARIO COM MATRICULA 400: ");
        departamento.excluirFuncionario(400);
        departamento.imprimir();
        
        System.out.println("BUSCANDO FUNCIONARIO COM MATRICULA 200: ");
        boolean busca = departamento.buscarFuncionario(200);
        System.out.println("" + busca);
        System.out.println("BUSCANDO FUNCIONARIO COM MATRICULA 800: ");
        busca = departamento.buscarFuncionario(800);
        System.out.println("" + busca);
        
    }
}
