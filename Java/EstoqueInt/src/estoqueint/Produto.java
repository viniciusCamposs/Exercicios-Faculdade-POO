/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoqueint;

/**
 *
 * @author Usuario
 */
public class Produto 
{
    private int cod;
    private String descr;
    private int qtd;
    private double pesoUnit;

    public Produto(int cod, String descr, int qtd, double pesoUnit) 
    {
        this.cod = cod;
        this.descr = descr;
        this.qtd = qtd;
        this.pesoUnit = pesoUnit;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPesoUnit() {
        return pesoUnit;
    }

    public void setPesoUnit(double pesoUnit) {
        this.pesoUnit = pesoUnit;
    }
    
}

