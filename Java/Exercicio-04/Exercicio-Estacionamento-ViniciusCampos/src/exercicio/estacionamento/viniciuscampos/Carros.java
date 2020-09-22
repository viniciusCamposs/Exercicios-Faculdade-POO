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
public class Carros {
    //Atributos
    private String placa, modelo, vendedor;
    private int anoFabricacao;
    private Boolean disponibilidade=true;

    //Construtor padrão
    public Carros(){
    
    }
    
    //Construtor Parametrizado
    public Carros(String placa, int anoFabricacao, String modelo, Boolean disponibilidade){
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.disponibilidade = disponibilidade;
    }
    
    //Construtor cópia
    public Carros(Carros c){
        this(c.placa, c.anoFabricacao, c.modelo, c.disponibilidade);
    }
    
    //Getters
    public String getPlaca() {
        return placa;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
     public String getModelo() {
        return modelo;
    }
      public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    //Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    //Metodos
    public boolean Disponivel(){
        return disponibilidade;
    }
    
    public void ImprimeDados(){
            System.out.println("Placa: " + placa +
            "\nAno de Fabricação: " + anoFabricacao + 
            "\nModelo: " + modelo + 
            "\nDispobilidade: " + (disponibilidade?"Sim":"Não"));
    }
    
    public boolean oferta(double valor){
        return false;
    }
    
    public boolean venderCarro(String vendedor, double ValorVenda){
        if(!disponibilidade) return false;
        if(!oferta(ValorVenda)) return false;
        
        disponibilidade = false;
        this.vendedor = vendedor;
        return true;
    }

    
    
    
    
    
}//Classe carros
