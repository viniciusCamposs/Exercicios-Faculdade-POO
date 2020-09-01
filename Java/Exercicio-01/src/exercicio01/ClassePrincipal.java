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
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //INTERAGINDO COM A CLASSE PESSOA
        Pessoa pessoa = new Pessoa("Vinicius", "Alves");
       
        Pessoa pessoa2 = new Pessoa(pessoa);
        
        System.out.println("Pessoa: " + pessoa.nomeCompleto());
        System.out.println("Pessoa2: " + pessoa2.nomeCompleto());
        
       /*
        //INTERAGINDO COM A CLASSE ALUNO
        Aluno aluno = new Aluno();
        
        aluno.setNome("Vinicius");
        aluno.setRa("0040481922058");
        
        System.out.println("Nome do aluno: " + aluno.getNome() + " | RA: " + aluno.getRa());
        
       
        //INTERAGINDO COM A CLASSE OPERACOES
        
        Operacoes operacao = new Operacoes();
        
        System.out.println(operacao.Soma(2, 8));
        System.out.println(operacao.Subtracao(2, 8));
        System.out.println(operacao.Multiplicacao(2, 8));
        System.out.println(operacao.Divisao(2, 8));
        System.out.println(operacao.Quadrado(12));
        System.out.println(operacao.Raiz(25));
       */
    }
    
} // CLASSE PRINCIPAL
