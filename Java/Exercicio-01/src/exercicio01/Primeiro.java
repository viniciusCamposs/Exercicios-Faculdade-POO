/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class Primeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Vinicius");
        pessoa.setSobrenome("Alves");
        
        System.out.println("Pessoa: " + pessoa.nomeCompleto());
        
        Aluno aluno = new Aluno();
        
        aluno.setNome("Vinicius");
        aluno.setRa("0040481922058");
        
        System.out.println("Nome do aluno: " + aluno.getNome() + " | RA: " + aluno.getRa());
        
    }
    
}
