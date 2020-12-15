/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasub;

/**
 *
 * @author Matheus Augusto Satler RA: 0040481912052
 */
public class Turma {
    private String nomeCurso;
    private double qtdAulas;
    private double frqAluno[] = new double[20];
    private Aluno aluno[] = new Aluno[20];
    private int count=0;

    public Turma(String nomeCurso, double qtdAulas) {
        this.nomeCurso = nomeCurso;
        this.qtdAulas = qtdAulas;
    }
    
    
    public void matricularAluno(Aluno al) throws TurmaException{
        if(aluno.length > 20){
            throw new TurmaException();
        }else{
            aluno[count] = al;
            count++;
        }
    }
    
    public int buscarAluno(int codigo){
        for(int i=0; i<= aluno.length; i++){
            if(aluno[i].getCodigoAluno() == codigo){
                return i;
            }
        }
        return -1;
    }
    
   public void registrarFalta(int codigo) throws TurmaException{
       int encontrou=0;
       for(int i=0; i< aluno.length; i++){
           if(aluno[i].getCodigoAluno() == codigo){
               aluno[i].setCodigoAluno(aluno[i].getCodigoAluno()+1);
               aluno[i].setQtdFaltasAluno(aluno[i].getQtdFaltasAluno()+1);
               encontrou++;
           }
       }
       if(encontrou == 0){
           throw new TurmaException();
       }
   }
   
   public void atribuirMedia(int codigo, double media) throws TurmaException{
       int encontrou = 0;
       
       for(int i=0; i< aluno.length; i++){
           if(aluno[i].getCodigoAluno() == codigo){
               if(codigo>= 0 && codigo<= 10){
                   aluno[i].setMediaFinalAluno(media);
               }
           }
       }
       
       if(encontrou == 0){
           throw new TurmaException();
       }
   }
   
   public void listarTodos(){
        for(int i=0; i< aluno.length; i++){
            frqAluno[i] = ((qtdAulas - aluno[i].getQtdFaltasAluno())/qtdAulas) * 100;
            System.out.println("Código: " + aluno[i].getCodigoAluno() + 
                               "\nNome: " + aluno[i].getNomeAluno() + 
                               "\nNota final: " + aluno[i].getMediaFinalAluno() +
                               "\nQuantidade de Faltas: " + aluno[i].getQtdFaltasAluno()+
                               "\nFrequência do aluno: " + frqAluno[i]);
       }
   }
   
   public void listarAprovados(){
       int aprovados = 0;
       for(int i=0; i< aluno.length; i++){
           if(aluno[i].getMediaFinalAluno() >= 6 && frqAluno[i] >= 75){
                System.out.println("---------------" + nomeCurso + "---------------" +
                                    "\nCódigo: " + aluno[i].getCodigoAluno() + 
                                    "\nNome: " + aluno[i].getNomeAluno() + 
                                    "\nNota final: " + aluno[i].getMediaFinalAluno() +
                                    "\nQuantidade de Faltas: " + aluno[i].getQtdFaltasAluno() + 
                                    "\nFrequência do aluno: " + frqAluno[i]);
                aprovados++;
           }
       }
       if(aprovados==0){
           System.out.println("Nenhum aluno foi aprovado!!");
       }
   }
   
    
}
