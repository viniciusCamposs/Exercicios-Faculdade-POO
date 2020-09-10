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
public class Segmento {
    
    private Ponto p1, p2;
    
    // Construtor padrão
    public Segmento(){
        p1 = new Ponto();
        p2 = new Ponto(1,0);
    }
    
    // Construtor com parâmetros
    public Segmento(double x1, double y1, double x2, double y2){
        p1 = new Ponto(x1, y1);
        p2 = new Ponto(x2, x2);
    }
    
    // Construtor de cópia
    public Segmento(Segmento s){
        p1 = new Ponto(s.p1);
        p2 = new Ponto(s.p2);
    }
    
    // Metodo toString()
    @Override
    public String toString(){
        return "[" + p1.toString() + "," + p2.toString() + "]";
    }
    
    // Metodo print()
    public void print(){
        System.out.println(toString());
    }
    
    // Metodo desloc()
    public void desloc(double dx, double dy){
        p1.desloc(dx, dy);
        p2.desloc(dx, dy);
    }
    
    // Metodo scale()
    public void scale(double factor){
        p1.scale(factor);
        p2.scale(factor);
    }
    
    // Metodo length()
    public double length(){
        return p1.distance(p2);
    }
    
    // Metodo midPoint()
    public Ponto midPoint(){
        double mx = (p1.getX()+p2.getX())/2;
        double my = (p2.getY()+p2.getY())/2;
        
        return new Ponto(mx, my);
    }
    
} // Classe Segmento
