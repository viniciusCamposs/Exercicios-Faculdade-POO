/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.estacionamento.viniciuscampos;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class CarrosProprios extends Carros{
    //Atributos
    private float valorCompra;
    private String dataCompra; 

    //Construtor default
    public CarrosProprios(){
    
    }
    
    //Construtor parametrizado
    public CarrosProprios(String placa, int anoFabricacao, String modelo, Boolean disponibilidade, float valorCompra, String dataCompra){
        super(placa,anoFabricacao,modelo,disponibilidade);
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
    }
    
    //Construtor cópia
    public CarrosProprios(CarrosProprios cp){
        super(cp);
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
    }
    
    //Getters
    public float getValorCompra() {
        return valorCompra;
    }
    
    public String getDataCompra() {
        return dataCompra;
    }
    
    //Setters
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    //Metodos
    public void ImprimeDados(){
            super.ImprimeDados();
            System.out.println("Valor da Compra: " + valorCompra + "\n" +
            "Data da Compra: " + dataCompra);
    }
    
    @Override
    public boolean oferta(double valor){
        return(valor <= valorCompra * 1.1);
    }
    
}//Classe CarrosProprios
