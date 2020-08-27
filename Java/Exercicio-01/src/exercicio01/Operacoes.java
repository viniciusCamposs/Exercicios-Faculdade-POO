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
public class Operacoes {
    
    //ATRIBUTOS
    private float numero;
    private float numero2;
    
    //SETTERS
    public void setNumero(int numero){
            this.numero = numero;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    //GETTERS
    public float getNumero(){
        return numero;
    }
    
    public float getNumero2(){
        return numero2;
    }
    
    //METODOS
    public String Soma(int numero, int numero2){
        int soma = numero + numero2;
        return "O valor da soma de " + numero + " + " + numero2 + " é igual a: " + soma;
    }
    
    public String Subtracao(int numero, int numero2){
        int subtracao = numero - numero2;
        return "O valor da subtração de " + numero + " - " + numero2 + " é igual a: " + subtracao;
    }
    
    public String Multiplicacao(int numero, int numero2){
        int multiplicacao = numero * numero2;
        return "O valor da multiplicação de " + numero + " * " + numero2 + " é igual a: " + multiplicacao;
    }
    
        public String Divisao(float numero, float numero2){
        float divisao = numero / numero2;
        return "O valor da divisao de " + numero + " / " + numero2 + " é igual a: " + divisao;
    }
    
        public String Quadrado(int numero){
            int quadrado = numero*numero;
            return "O valor de " + numero + " elevado ao quadrado é: " + quadrado; 
        }
        
        public String Raiz(double numero){
            double raiz = Math.sqrt(numero);
            return "O valor da raiz de" + numero + " é: " + raiz;
        }
   
    
    
} // CLASSE OPERACOES
