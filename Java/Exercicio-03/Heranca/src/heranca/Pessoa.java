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
public class Pessoa {
    private String nome, sobrenome;
    
 
    // Construtor default.
    public Pessoa(){
    
    }

    // Construtor com parâmetros.
    public Pessoa(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
    }
    
    public Pessoa(Pessoa outro){
        this(outro.nome, outro.sobrenome);
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    // Construtor de cópia.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    //Metodos
    public void print(){
        System.out.println("Nome: " + nome +
                           "\nSobrenome: " + sobrenome);
    }
}
