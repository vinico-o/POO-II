/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Vinícius Mardegan
 */
public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;
    
    Conta() {
        
    }
    
    Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public boolean saca(double valor) {
        if(this.saldo > valor){
            this.saldo -= valor;
            return true;
        }
        
        return false;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void extrato() {
        System.out.println("Saldo: " + this.saldo);
    }
    
    public void exibir() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
