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
public class Pessoa {
    
   private String nome;
   private String sobrenome;
   
   //SETTERS
   
   public void setNome(String nome){
       if(nome.isEmpty()){
           System.out.println("O nome não pode ser vazio!");
       }else{
        this.nome = nome;
       }
       
   }

    public void setSobrenome(String sobrenome) {
        if(nome.isEmpty()){
            System.out.println("O sobrenome não pode ser vazio!");
        }else{
            this.sobrenome = sobrenome;
        }
        
    }
    
    //GETTERS
    public String getNome(){
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    //METODOS
    public String nomeCompleto(){
        return nome + " " + sobrenome;
    }
    
    public String refNome(){
        return sobrenome + ", " + nome;
    }
    
    
    
   
} // CLASSE PESSOA
