/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesiano;

/**
 *
 * @author Usuario
 */
public class Circulo extends Ponto
{
    private double raio;
    
    public Circulo()
    {
        super();
        raio= 1;
    }
    
    public Circulo(double x, double y, double raio)
    {
        super(x, y);
        this.raio= raio;
    }

    public void setRaio(double raio) 
    {
        this.raio = raio;
    }
    
    public double getRaio() 
    {
        return raio;
    }

    public Circulo(Circulo c)
    {
        // this(c.getX(), c.getY(), c.raio);
        super(c);
        raio= c.raio;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ":" + raio;
    }
    
    public double perimeter()
    {
        return 2 * Math.PI * raio;
    }
    
    
    public double area()
    {
        return Math.PI * raio * raio;
    }
    
    public boolean isValid()
    {
        return raio > 0;
    }
    
    public boolean isTangent(Circulo c)
    {
        double dist= distance(c);
        return dist == (raio+c.raio);
    }
    
    @Override
    public void scale(double factor)
    {
        super.scale(factor);
        raio= raio * factor;
    }
}
