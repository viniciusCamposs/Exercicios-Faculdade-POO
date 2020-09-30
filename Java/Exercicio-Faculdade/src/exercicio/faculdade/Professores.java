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
public class Professores extends Pessoas{
     private String curso;
     private double quantHoraAula;
     private double valorHoraAula = 3.50;
     
    //Construtor Default
    public Professores(){
        
    }
    
    //Construtor Parametrizado
    public Professores(String nome, String rg, int quantFilhos, String curso){
        super(nome, rg, quantFilhos);
        this.curso = curso;
    }
    
    @Override
    public double calcularSalario(){
        return (quantHoraAula * valorHoraAula)+retornaAuxilioProc();
    }
    
    @Override
    public void hollerith(){
        super.imprimeDados();
         System.out.println("\nCurso: " +curso+ "\n" +
                            "Quantidade de Horas/Aula: " +quantHoraAula+ "\n" +
                            "Valor da Hora/Aula: " +valorHoraAula+ "\n" +
                            "Salário+Auxilio-Procriação: " +calcularSalario());
    }
    
     @Override
    public void zerarMes(){
        quantHoraAula = 0;
    }
    
    public void registraAulas(int qtd){
        this.quantHoraAula = qtd;
    }
     
    
}
