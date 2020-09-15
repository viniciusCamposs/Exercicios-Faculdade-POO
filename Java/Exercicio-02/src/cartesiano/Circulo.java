package cartesiano;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class Circulo extends Ponto{
    private double raio;
    
    // Construtor padrão.
    public Circulo(){
        super();
        this.raio=1;
    }
    
    // Construtor parametrizado.
    public Circulo(double cx, double cy, double raio){
        super(cx,cy);
        this.raio = raio;
    }
    
    // Construtor cópia.
    public Circulo(Circulo c){
        super(c);
        this.raio = c.raio;
    }
    
    // Metodos. 
    @Override // Conceito de sobreposição.
    public String toString(){
        return super.toString() + ":" + raio;
    }
    
    @Override
    public void scale(double factor){
        super.scale(factor);
        raio += factor;
    }
    
    public double perimeter(){
        return 2*Math.PI*raio;
    }
    
    public double area(){
        return Math.PI*(raio*raio);
    }    
    
    public boolean isValid(){
        if(raio>0){
            return true;
        }else{
            return false;
        }
    }
}
