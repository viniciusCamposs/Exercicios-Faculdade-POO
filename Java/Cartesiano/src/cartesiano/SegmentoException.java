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
public class SegmentoException extends Exception{
    private Ponto p1, p2;

    public SegmentoException(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    

  
    @Override
    public String toString(){
        return "Não pode haver segmento com comprimento 0!";
    }

    
}
