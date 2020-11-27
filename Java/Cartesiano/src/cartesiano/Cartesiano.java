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
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Classe Poligono
        
        Poligono pg= new Poligono();
        
        pg.addVertex(new Ponto(0,2));
        pg.addVertex(new Ponto(2,2));
        pg.addVertex(new Ponto(2,0));
        pg.addVertex(new Ponto(0,0));
        
        System.out.println("Perímetro: " + pg.perimeter());
        
        Poligono pg2= new Poligono();
        pg2.addVertex(new Ponto(2,2));
        pg2.addVertex(new Ponto(4,2));
        pg2.addVertex(new Ponto(4,0));
        pg2.addVertex(new Ponto(2,0));
        
        System.out.println("Distância: " + pg.distance(pg2));
        
        pg.print();
        pg.desloc(0, 2);
        pg.print();
        pg.scale(2);
        pg.print();
        
        pg.delete(new Ponto(4, 8));
        pg.print();

        // Classe Circulo
        
//        Circulo c1= new Circulo();
//        Circulo c2= new Circulo(10, 20, 10);
//        Circulo c3= new Circulo(c2);
//        
//        c1.print("c1");
//        c2.print("c2");
//        c3.print("c3");
//        
//        System.out.println("Perimetro de c1:" + c1.perimeter());
//        System.out.println("Area de c1:" + c1.area());
//        
//        c3.desloc(20, 0);
//        
//        System.out.println("c2 é tangente a c3? " + c2.isTangent(c3));
        
        
        
        
        // Classe Segmento
        
//        Segmento s1= new Segmento();
//        Segmento s2= new Segmento(3, 4, 5, 6);
//        Segmento s3= new Segmento(s2);
//        
//        s1.print("s1");
//        s2.print("s2");
//        s3.print("s3");
//        
//        s2.desloc(10, 10);
//        s2.print("desloc s2");
//        s3.print("s3");
//        
//        s3.scale(2);
//        s3.print("s3");
//        
//        System.out.println("Comprimento de s3: " + s3.length());
//        
//        Ponto pm= s2.midPoint();
//        pm.print("Ponto médio de s2: ");
//        
//        Ponto p= s2.getP1();
//        System.out.println("--------------------------");
//        s2.print("s2");
//        p.print("p");
//        p.scale(3);
//        p.print("scale p");
//        s2.print("s2");
//        System.out.println("--------------------------");
//
//        Ponto p1= new Ponto(10, 20);
//        p1.print("p1");
//        s2.setP1(p1);
//        s2.print("s2");
//        
//        p1.desloc(2, 2);
//        p1.print("desloc p1");
//        s2.print("s2");
        
         
        // Teste da classe Ponto
        
//        Ponto p1= new Ponto();
//        Ponto p2= new Ponto(3, 4);
//        Ponto p3= new Ponto(p2);
//        
//        p1.print("p1");
//        p2.print("p2");
//        p3.print("p3");
//
//        System.out.println("Distancia p2 até origem: " + p2.distance());
//        p3.scale(2);
//        p3.print("p3 scale");
//        p3.print();
//        System.out.println("Distancia p3 até p2: " + p3.distance(p2));
//        System.out.println("Distancia p3 até origem: " + p3.distance());


        // Teste da classe Segmento
        
//        Segmento s1, s2;
//        
//        s1= new Segmento();
//        s2= new Segmento(2,3, 5,6);
//        
//        s1.print("s1");
//        s2.print("s2");
//        
//        s2.desloc(1,1);
//        s2.print("desloc s2");
//        
//        s2.scale(2);
//        s2.print("scale s2");
//        
//        Ponto pm= s2.midPoint();
//        pm.print("pm");
//        
//        System.out.println("Comprimento de s2: " + s2.length());
//        
//        Ponto p1= s2.getP1();
//        s2.print("s2");
//        
//        p1.scale(3);
//        p1.print("p1");
//        s2.print("s2");
//        
//        s2.setP1(p1);
//        s2.print("s2");
//        
//        p1.scale(0.5);
//        p1.print("p1");
//        s2.print("s2");
    }
    
}
