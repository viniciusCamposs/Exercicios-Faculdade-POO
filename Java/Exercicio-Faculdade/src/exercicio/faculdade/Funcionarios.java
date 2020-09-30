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
public class Funcionarios extends Pessoas{
    private String departamento;
    private float salario;
    private int quantFalta;
    private double valeCoxinha = 42;
    
    //Construtor Default
    public Funcionarios(){
    
    }
    
    //Construtor Parametrizado
    public Funcionarios(String nome, String rg, int quantFilhos, String departamento, float salario){
        super(nome, rg, quantFilhos);
        this.departamento = departamento;
        this.salario = salario; 
    }
    
    @Override
    public double calcularSalario(){
        return salario+valeCoxinha+retornaAuxilioProc();
    }
    
    @Override
    public void hollerith(){
        super.imprimeDados();
        System.out.println("Departamento: "+departamento+"\n"+
                           "Salario+vale Coxinha+Auxilio-Procriação: "+salario+"\n"+
                           "Quantidade de faltas no mês: "+quantFalta+"\n"+
                           "Valor do vale Coxinha: "+valeCoxinha);
    }  
    
    @Override
    public void zerarMes(){
        quantFalta = 0;
        salario = 0;
    }
    
    public void registraFalta(int qtd){
        quantFalta = qtd;
    }
}
