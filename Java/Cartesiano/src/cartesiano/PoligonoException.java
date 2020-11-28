/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesiano;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class PoligonoException extends Exception{
   
    public PoligonoException(){
    
    }
    
    @Override
    public String toString(){
        return "Não é possível ter mais vértices do que a capacidade máxima da classe!";
    }
}
