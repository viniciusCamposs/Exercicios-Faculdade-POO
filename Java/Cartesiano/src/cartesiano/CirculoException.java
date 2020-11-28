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
public class CirculoException extends Exception{
    
    private double raio;

    public CirculoException(double raio) {
        this.raio = raio;
    }
    
    @Override
    public String toString(){
        return "Não é possivel criar um círculo com o raio <= 0!";
    }
    
}
