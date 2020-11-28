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
public class Poligono 
{
    private Ponto list[];
    private int count;

    public Poligono() 
    {
        list= new Ponto[50];
        count= 0;
    }
    
    public boolean ptExist(Ponto pt)
    {
        for(int i=0; i<count; i++)
        {
            if(list[i].equals(pt)) return true;
        }
        return false;
    }
    
    public boolean addVertex(Ponto pt) throws PoligonoException
    {
        
        if(count>=50){
            throw new PoligonoException();
        };
        
        if(ptExist(pt)) return false;
        list[count]= pt;
        count++;
        return true;
    }
    
    public boolean delete(Ponto pt)
    {
        int pos= -1;
        for(int i=0; i<count; i++)
        {
            if(list[i].equals(pt))
            {
                pos= i;
                break;
            }
        }
        if(pos<0) return false;
        
        for(int i= pos; i<count-1; i++)
            list[i]= list[i+1];
        
        count--;
        return true;
    }
    
    public boolean isValid()
    {
        return count>=3;
    }
    
    public double perimeter()
    {
        if(!isValid()) return -1;
        double p= list[0].distance(list[count-1]);
        for(int i=0; i<count-1; i++)
        {
            p+= list[i].distance(list[i+1]);
        }
        return p;
    }
    
    public Ponto geoCenter()
    {
        if(count==0) return null;
        
        double xm=0, ym=0;
        for(int i=0; i<count; i++)
        {
            xm+= list[i].getX();
            ym+= list[i].getY();
        }
        
        return new Ponto(xm/count, ym/count);
    }
    
    public double distance(Poligono plg)
    {
        Ponto p1= geoCenter();
        Ponto p2= plg.geoCenter();
        
        return p1.distance(p2);
    }
    
    public void desloc(double dx, double dy)
    {
        for(int i=0; i<count; i++)
        {
            list[i].desloc(dx, dy);
        }
    }
    
    public void scale(double factor)
    {
        for(int i=0; i<count; i++)
        {
            list[i].scale(factor);
        }
    }
    
    @Override
    public String toString()
    {
        String s= "[";
        for(int i=0; i<count-1; i++)
            s= s + list[i].toString() + ",";
        
        s= s + list[count-1].toString() + "]";
        
        return s;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
}
