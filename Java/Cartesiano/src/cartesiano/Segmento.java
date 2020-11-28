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
public class Segmento 
{
    private Ponto p1, p2;
    
    // Construtores:
    // Padrão: cria o segmento com extremidades em (0,0) e (1,0);
    public Segmento()
    {
        p1= new Ponto();
        p2= new Ponto(1, 0);
    }
    
    // Parametrizado: recebe por parâmetros as coordenadas dos dois pontos
    //           (x1, y1) e (x2, y2).
    public Segmento(double x1, double y1, double x2, double y2)
    {
        p1= new Ponto(x1, y1);
        p2= new Ponto(x2, y2);
    }
    
    // De cópia: Copia as coordenadas de outro ponto informado por parâmetro. 
    public Segmento(Segmento s)
    {
        p1= new Ponto(s.p1);
        p2= new Ponto(s.p2);
    }
    
    
    // Desloca o segmento somando dx às coordenadas x e dy às coordenadas y
    // dos dois pontos.
    public void desloc(double dx, double dy)
    {
        p1.desloc(dx, dy);
        p2.desloc(dx, dy);
    }
    
    // 	Faz o escalamento do segmento.
    public void scale(double factor)
    {
        p1.scale(factor);
        p2.scale(factor);
    }
    
    // Retorna o comprimento do segmento.
    public double length() throws SegmentoException
    {
        if(p1.distance(p2) == 0){
            throw new SegmentoException(p1, p2);
        }else{
            return p1.distance(p2);
        }
       
    }
    
    // Retorna o ponto médio do segmento.
    public Ponto midPoint()
    {
        double xm= (p1.getX() + p2.getX())/2;
        double ym= (p1.getY() + p2.getY())/2;
        
        return new Ponto(xm, ym);
    }
    
    // Retorna uma string no seguinte formato: [(x1,y1),(x2,y2)]
    public String toString()
    {
        return "[" + p1.toString() + "," + p2.toString() + "]";
    }
	

    // Imprime na saída padrão a string retornada por toString().
    public void print(String caption)
    {
        System.out.println(caption + toString());
    }
    
    // Getters
    //
    public Ponto getP1() 
    {
        return new Ponto(p1);
    }

    public Ponto getP2() 
    {
        return new Ponto(p2);
    }
    
    // Setters
    //

    public void setP1(Ponto p1) 
    {
        this.p1 = new Ponto(p1);
    }

    public void setP2(Ponto p2) 
    {
        this.p2 = new Ponto(p2);
    }
    
}
