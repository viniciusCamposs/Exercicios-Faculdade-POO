/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas;

/**
 *
 * @author Vinícius Alves de Campos
 * @RA: 0040481912053
 */
public class listaPecas {
    
    protected pecas list[];
    protected int count;
    
    public listaPecas(int qtdMaxPecas){
        list = new pecas[qtdMaxPecas];
        count = 0;
    }
    
    public int adicionarPeca(pecas pc){
        
        /*if(count >= list.length){
            throw new AdicionarPecaException();
        }
        */
        try{
            list[count] = pc;
            return count++;
        }catch(Exception e){
            System.out.println("\nLista de peças já está lotada!\n");
            return 0;
        }
    }
    
    public void retirarUnidades(int index, int qtd){
        
        int qtdTemp;

        try{
            qtdTemp = list[index].getQtd_estoque();
            qtdTemp = qtdTemp - qtd;
            list[index].setQtd_estoque(qtdTemp);
        }catch(Exception e){
            System.out.println("\nÍndice inválido ou qtd de peças insuficientes!\n");
        }
     
    }
    
    public void acrescentarUnidades(int index, int qtd) throws IndiceException{
        int qtdTemp;
        
        if(count >= index && qtd > 0){
            qtdTemp = list[index].getQtd_estoque();
            qtdTemp = qtdTemp + qtd;
            list[index].setQtd_estoque(qtdTemp);
        }else{
            throw new IndiceException();
        }
   
    }
    
    public void imprimirPeca(int index) throws IndiceException{
        if(count >= index){
            System.out.println("\nCódigo: " + list[index].getCodigo() +
                               "\nQuantidade no estoque: " + list[index].getQtd_estoque() +
                               "\nDescricao: " + list[index].getDescricao() +
                               "\nPeso: " + list[index].getPeso());
        }else{
            throw new IndiceException();
        }
    }
    
    public void relatorioGeral(){
        if(list.length == 0){
            System.out.println("Lista vazia!");
        }else{
            for(int i=0; i < list.length; i++){
                System.out.println("\n---------------Peça de índice " + i + "---------------"
                                   + "\nCódigo: " + list[i].getCodigo() 
                                   + "\nQuantidade no estoque: " + list[i].getQtd_estoque()
                                   + "\nDescricao: " + list[i].getDescricao()
                                   + "\nPeso: " + list[i].getPeso());
            }
            System.out.println("\n----------------------------------------------\n");
        }
    }
    
    public void relatorioReposição(int qtdMinima){
        for(int i=0; i < list.length; i++){
            if(list[i].getQtd_estoque() <= qtdMinima){
                System.out.println("\n---------------Peça " + i + "---------------"
                                   + "\nCódigo: " + list[i].getCodigo() 
                                   + "\nQuantidade no estoque: " + list[i].getQtd_estoque()
                                   + "\nDescricao: " + list[i].getDescricao()
                                   + "\nPeso: " + list[i].getPeso()
                                   + "\n-----------------------------------");
                
            }
            
            }
    }
    
    
    
    
    
    
    
    
    }
            
       
    
    
    
    
    

