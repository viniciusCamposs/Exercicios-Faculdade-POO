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
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CRIAÇÃO DO OBJETO PONTO
        Ponto ponto = new Ponto(1,2);
        
        //CHAMADA DO METODO TOSTRING()
        System.out.println("Metodo toString(): "+ponto.toString());
        
        //CHAMADA DO METODO PRINT()
        ponto.print();
        
        //CHAMADA DO METODO DESLOC()
        ponto.desloc(2, 2);
        
        //CHAMADA DO METODO SCALE()
        ponto.scale(2);
        
        //CHAMADA DO METODO DISTANCE()
        System.out.println("Metodo distance(): " + ponto.distance(2, 2));
        
    }
    
}
