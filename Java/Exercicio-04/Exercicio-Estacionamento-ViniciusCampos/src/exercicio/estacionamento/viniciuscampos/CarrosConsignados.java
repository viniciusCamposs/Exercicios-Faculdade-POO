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
public class CarrosConsignados extends Carros{
    //Atributos
    private String proprietario;
    private float valorReceber;

    //Construtor padrão
    public CarrosConsignados(){
    
    }
    
    //Construtor parametrizado
    public CarrosConsignados(String placa, int anoFabricacao, String modelo, Boolean disponibilidade, String proprietario, float ValorReceber){
        super(placa,anoFabricacao,modelo,disponibilidade);
        this.proprietario = proprietario;
        this.valorReceber = valorReceber;
        
    }
    
    //Construtor Copia
    public CarrosConsignados(Carros cc){
        super(cc);
        this.proprietario = proprietario;
        this.valorReceber = valorReceber;
    }
    
    //Getters
    public String getProprietario() {
        return proprietario;
    }

    public float getValorReceber() {
        return valorReceber;
    }
    
    //Setters
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setValorReceber(float valorReceber) {
        this.valorReceber = valorReceber;
    }
    
    //Metodos
    @Override
    public void ImprimeDados(){
           System.out.println("Placa: " + getPlaca()+ 
            "\nAno de Fabricação: " + getAnoFabricacao() + 
            "\nModelo: " + getModelo() + 
            "\nDispobilidade: " + getDisponibilidade() + 
            "\nVendedor: " + proprietario);
    }
    
    

    
    
}//Classe CarrosConsignados
