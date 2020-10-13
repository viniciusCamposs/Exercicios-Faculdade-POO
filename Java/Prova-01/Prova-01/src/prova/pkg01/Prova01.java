/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.pkg01;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class Prova01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*AlunosRegulares a1 = new AlunosRegulares("Vinicius", "0040481912053");
       
        a1.registrarFaltas(10);
        a1.registrarNotas(10, 6);
        a1.historico();
        */
        
        AlunosAssistentes a2 = new AlunosAssistentes("Vinicius", "567843317");
        
        a2.receberResumo();
        a2.registrarFaltas(10);
        a2.historico();
    }
    
}
