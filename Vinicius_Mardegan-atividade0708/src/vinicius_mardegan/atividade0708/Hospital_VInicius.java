/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicius_mardegan.atividade0708;

import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Vinícius Mardegan
 */
public class Hospital_Vinicius {
    private String nome;
    private String endereco;
    ArrayList<Medico_Vinicius> medicos = new ArrayList();
            
    public Hospital_Vinicius() {
        
    }

    public Hospital_Vinicius(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void adicionarMedico(Medico_Vinicius medico) {
        medicos.add(medico);
    }
    
    public void removerMedico(int CRM) {
        if(ehValido()) {
            for(int i = 0; i < medicos.size(); i++) {
                if(medicos.get(i).getCRM() == CRM) {
                    medicos.remove(i);
                }
            }
        }
    }
    
    public void exibirMedicosAnoContrato(int ano) {
        if(ehValido()) {
            for(int i = 0; i < medicos.size(); i++) {
                if(medicos.get(i).getDataContratacao().getYear() >= ano) {
                    medicos.get(i).imprime();
                }
            }
        }
    }
    
    public void imprime() {
        if(ehValido()) {
            System.out.println("MEDICOS DO HOSPITAL");
            for(int i = 0; i < medicos.size(); i++) {
                medicos.get(i).imprime();
            }
        }
    }
    
    private Boolean ehValido() {
        if(medicos.size() != 0) {
            return true;
        }
        System.out.println("NAO HA MEDICOS");
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
