/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicius_mardegan.atividade0708;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal_Vinicius {
    public static void main(String[] args) {
        Hospital_Vinicius hospital = new Hospital_Vinicius("Hospital", "Presidente Prudente");
        Medico_Vinicius medico1 = new Medico_Vinicius(101010, "Vinicius", "Geral", "2006-06-26", 10000.f);
        Medico_Vinicius medico2 = new Medico_Vinicius(202020, "Mardegan", "Pediatra", "2025-08-07", 11000.f);
        
        System.out.println("ADICIONANDO MEDICO VINICIUS E MARDEGAN");
        hospital.adicionarMedico(medico1);
        hospital.adicionarMedico(medico2);
        hospital.imprime();
        
        System.out.println("EXIBINDO MEDICOS DE ANO >= 2006");
        hospital.exibirMedicosAnoContrato(2006);
        
        System.out.println("EXIBINDO MEDICOS DE ANO >= 2025");
        hospital.exibirMedicosAnoContrato(2025);
        
        System.out.println("REMOVENDO MEDICO VINICIUS");
        hospital.removerMedico(101010);
        hospital.imprime();
        
    }
}
