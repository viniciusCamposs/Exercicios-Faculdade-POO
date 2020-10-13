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
public class AlunosAssistentes extends Alunos{
    //ATRIBUTOS
    private String rg;
    private boolean resumo = false;
    
    //CONSTRUTOR PADRÃO
    public AlunosAssistentes(){
    
    }
    
    //CONSTRUTOR PARAMETRIZADO
    public AlunosAssistentes(String nome, String rg){
        super(nome);
        this.rg = rg;
    }
    
    //METODOS
    public boolean receberResumo(){
        return this.resumo = true;
    }

    @Override
    public double frequencia() {
        return (((getQuantFaltas() * 100)/60 )-100)*-1;
    }

    @Override
    public boolean aprovado() {
        if(receberResumo()==true && frequencia()>75.00){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void historico() {
        super.historico();
        System.out.println("Rg: "+rg+
                           "\nEntrega do resumo: "+resumo+
                           "\nFrequência: "+frequencia()+
                           "\nAprovado: "+aprovado());
    }

    @Override
    public void registrarFaltas(int qtd){
        this.setQuantFaltas(qtd);
    }

    
    
    
    
}//CLASSE ALUNOSASSISTENTES
