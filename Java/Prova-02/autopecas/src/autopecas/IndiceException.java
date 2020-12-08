/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class IndiceException extends Exception{
    @Override
    public String toString(){
        return "ERRO! Índice inválido ou quantidade <= 0.";
    }
}
