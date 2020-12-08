/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intlib;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class AdicionarPecaException extends Exception{
    
    public AdicionarPecaException(){
    
    }
    
    @Override
    public String toString(){
        return "Lista de peças já está lotada!";
    }
}
