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
public class Ponto {
    //CRIAÇÃO DOS ATRIBUTOS
    private double x, y;

    //CRIAÇÃO DOS SETTERS E GETTERS
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //CRIAÇÃO DO CONSTRUTOR PADRAO
    public Ponto(){
        x = 0.0;
        y = 0.0;
    }
    
    //CRIAÇÃO DO CONTRUTOR PARAMETRIZADO
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //CRIAÇÃO DO CONSTRUTOR CÓPIA
    public Ponto(Ponto p){
        this(p.x, p.y);
    }
    
    //CRIAÇÃO DO METODO toSring()
    public String toString(){
         return "("+x+" , "+y+")";
    }
    
    //CRIAÇÃO DO MEOTODO print()
    public void print(){
        System.out.println("Metodo print(): "+this.toString());
    }
    
    //CRIAÇÃO DO METODO desloc()
    public void desloc(double dx, double dy){
        x += dx;
        y += dy;
        System.out.println("Metodo desloc(): " + "(" + x + " , " + y + ")");
    }
    
    //CRIAÇÃO DO METODO scale()
    public void scale(double factor){
        x *= factor;
        y *= factor;
        System.out.println("Metodo scale(): "+ "(" + x + " , " + y + ")");
    }
    
    //CRIAÇÃO DO METODO
    public double distance(double px, double py){
        double deltaX, deltaY, distancia;
        deltaX = px-this.x;
        deltaY = py-this.y;
        distancia = (Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
        return distancia;
    }
    
    public double distance(Ponto p){
        return distance(p.x, p.y);
    }
    
    public double distance(){
        return distance(0,0);
    }
    
}
