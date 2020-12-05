/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intlib;

/**
 *
 * @author Perrotti
 * Exemplo de uso de interface
 * 
 */
public interface SorteableItem
{
    /**
     * Estabelece o critério de comparação entre dois objetos
     * e compara o item no objeto com o item no parametro.
     * Retorna: 0 se o item no objeto é igual ao item no parâmetro (this == item)
     *          1 se o item no objeto é maior que o item no parâmetro (this > item)
     *         -1 se o item no objeto é menor que o item no parâmetro (this < item)
     */
    int compare(SorteableItem item);
    
    /**
     * Imprime uma linha com os dados relevantes sobre o objeto
     */
    void printItem(); 
}
