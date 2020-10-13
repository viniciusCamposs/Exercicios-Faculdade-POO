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
public abstract class Alunos {
    //ATRIBUTOS
    private String nome;
    private int quantFaltas;
    
    
    //CONSTRUTOR PADRÃO
    public Alunos(){
    
    }
    
    //CONSTRUTOR PARAMETRIZADO
    public Alunos(String nome){
        this.nome = nome;
    }

    //GETTER E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantFaltas() {
        return quantFaltas;
    }
    
    public void setQuantFaltas(int quantFaltas) {
        this.quantFaltas = quantFaltas;
    }
    
    
    //METODOS
    
    public abstract void registrarFaltas(int qtd);
    public abstract double frequencia();
    public abstract boolean aprovado();
    public void historico(){
        System.out.println("Nome: " + nome+
                           "\nQuantidade de Faltas: " + quantFaltas);
    }
    
}//CLASSE ALUNOS
