/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapessoas;

import intlib.SorteableItem;

/**
 *
 * @author Usuario
 */
public class Pessoa implements SorteableItem
{
    private String nome, sobrenome;
    
    //  Construtores

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
        //public String nomeCompleto()
            // Retorna uma string contendo nome e sobrenome
            // separados por espaço
    public String nomeCompleto(){
        return nome+ ' ' + sobrenome;
    }
    
    public void printItem(){
        System.out.println(nomeCompleto());
    }

    @Override
    public int compare(SorteableItem item) {
        if(item instanceof Pessoa){
            ((Pessoa) item).getNome();
            ((Pessoa) item).getSobrenome();
            
            int v = (((Pessoa) item).nomeCompleto()).compareTo(nomeCompleto());
            
            return v;
        }
        
        return 0;
        
    }


}
