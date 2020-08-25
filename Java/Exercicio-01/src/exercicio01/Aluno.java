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
public class Aluno {
    private String nome;
    private String ra;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setRa(String ra){
        this.ra = ra;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getRa(){
        return ra;
    }
}
