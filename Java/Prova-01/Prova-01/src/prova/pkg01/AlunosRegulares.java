/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.pkg01;

/**
 *
 * @author Vinícius Alves de Campos
 * @RA 0040481912053
 */
public class AlunosRegulares extends Alunos{
    //ATRIBUTOS
    private String ra;
    private double nota1, nota2;
    private int faltasAbonadas;
    
    //CONSTRUTOR PADRAO
    public AlunosRegulares(){
    
    }
    
    //CONSTRUTOR PARAMETRIZADO
    public AlunosRegulares(String nome, String ra){
        super(nome);
        this.ra = ra;
    }
    
    //METODOS
    public void registrarNotas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double media(){
        return (nota1+nota2)/2;
    }
    
    public void abonarFaltas(int qtd){
        if(qtd<=5 && qtd>=1){
            if(faltasAbonadas<=qtd){
                int tempFaltasAbonadas;
                faltasAbonadas = qtd;
                tempFaltasAbonadas = this.getQuantFaltas();
                tempFaltasAbonadas -= qtd;
                this.setQuantFaltas(tempFaltasAbonadas);
            }else{
                System.out.println("Faltas abonadas maior que a quantidade de faltas!");
            }         
        }else{
            System.out.println("Entre com um valor entre 1 e 5!");
        }
    }
    
    @Override
    public void registrarFaltas(int qtd){
        this.setQuantFaltas(qtd);
    }
    
    @Override
    public double frequencia() {
        return (((getQuantFaltas() * 100)/60 )-100)*-1;
    }

    @Override
    public boolean aprovado() {
        if(media()>6.00 && frequencia()>75){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void historico() {
        super.historico();
        System.out.println("Quantidade de Faltas que foram abonadas: "+faltasAbonadas+
                           "\nRa: "+ra+
                           "\nNota1: "+nota1+
                           "\nNota2: "+nota2+
                           "\nFrequência: "+frequencia()+
                           "\nMédia: "+media()+
                           "\nAprovado: "+aprovado());
    }
    
    
    
    
}//CLASE ALUNOSREGULARES
