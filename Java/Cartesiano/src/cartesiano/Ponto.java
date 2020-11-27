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
public class Ponto 
{
    private double x, y;
    
    // Contrutor padrão
    public Ponto()
    {
        x= 0;
        y= 0;
    }
    
    // Construtor parametrizado
    public Ponto(double x, double y)
    {
        this.x= x;
        this.y= y;
    }
    
    // Construtor de cópia
    public Ponto(Ponto outro)
    {
        x= outro.x;
        y= outro.y;
    }
    
    // Setters e getters

    public double getX() 
    {
        return x;
    }

    public double getY() 
    {
        return y;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public void setY(double y) 
    {
        this.y = y;
    }
    
    // Métodos
    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public void print(String caption)
    {
        System.out.println(caption + toString());
    }
    
    public void desloc(double dx, double dy)
    {
        x= x+dx;
        y= y+dy;
    }
    
    public void scale(double factor)
    {
        x= x*factor;
        y= y*factor;
    }
    
    public double distance(double px, double py)
    {
        double deltaX= px-x;
        double deltaY= py-y;
        
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
    
    public double distance(Ponto p)
    {
       return distance(p.x, p.y);
    }
    
    public double distance()
    {
        return distance(0, 0);
    }
    
    public boolean equals(Ponto pt)
    {
        return (x==pt.x) && (y==pt.y);
    }

}
