/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.faculdade;

/**
 *
 * @author Vinícius Alves de Campos
 */

public abstract class Pessoas {
    private String nome;
    private String rg;
    private int quantFilhos;
    private double auxilioProc = 100;
    
    //Construtor Default
    public Pessoas(){
    
    }
    
    //Construtor Parametrizado
    public Pessoas(String nome, String rg, int quantFilhos){
        this.nome = nome;
        this.rg = rg;
        this.quantFilhos = quantFilhos;
    }
    
    public abstract double calcularSalario();
    
    public abstract void hollerith();
    
    public abstract void zerarMes();
    
    public void imprimeDados(){
        System.out.println("Nome: " +nome+ "\n"+
                           "RG: " +rg+ "\n" +
                           "Quantidade de Filhos: " +quantFilhos);
    }
    
    public double retornaAuxilioProc(){
        return auxilioProc;
    }
}
