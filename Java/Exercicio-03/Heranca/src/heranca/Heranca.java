/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Vinicius", "Alves");
        
        Aluno a = new Aluno("Joao","Gonçalves", "ADS", "123456-7");
        
        p.print();
        
        Aluno a2 = new Aluno(a);
        a.printDados();
    }
    
}
