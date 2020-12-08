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

public class pecas {
    int codigo, qtd_estoque;
    String descricao;
    double peso;
    
    public pecas(int codigo, int qtd_estoque, String descricao, double peso){
        this.codigo = codigo;
        this.qtd_estoque = qtd_estoque;
        this.descricao = descricao;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
