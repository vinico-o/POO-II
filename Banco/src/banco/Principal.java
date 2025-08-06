/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;
import java.util.ArrayList;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    
    public static void main(String[] args) {
        Conta conta = new Conta(100, "Vinicius", 10000.f, 100000.f);
        Cliente c1 = new Cliente("Vinicius", "Mardegan", "100");
        Cliente c2 = new Cliente("Nathan", "Alves", "200");
        Cliente c3 = new Cliente("Lucas", "Henrique", "300");
        
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        System.out.println("CLIENTES");
        for(int i = 0; i < clientes.size(); i++) {
            clientes.get(i).exibir();
        }
        /*
        pode ser feito tambem:
        for(Cliente c : clientes) {
            c.exibir();
        )
        */
        
        System.out.println("\nTRANSACOES");
        conta.exibir();
        conta.deposita(1000);
        conta.extrato();
        conta.exibir();
        conta.saca(1000);
        conta.extrato();
        conta.exibir();
    }
}
