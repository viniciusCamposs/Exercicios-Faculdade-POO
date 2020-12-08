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
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IndiceException {

        //---------Adicionando as peças---------
        
        pecas p1 = new pecas(01, 5,  "Maçã", 1.5);
        pecas p2 = new pecas(02, 10, "Melancia", 15);
        pecas p3 = new pecas(03, 15, "Romã", 2.5);
        pecas p4 = new pecas(04, 20, "Banana", 2);
        
        //---------Criando a lista de peças---------
        
        listaPecas lista = new listaPecas(3);
        
        //---------Adicionando as peças á lista de peças---------
        lista.adicionarPeca(p1);
        lista.adicionarPeca(p2);
        lista.adicionarPeca(p3);
        
        //---------Acionando a exceção do método adicionarPeca---------
        
        /*lista.adicionarPeca(p4); /* Irá acionar a excecão */
        
        //---------Testando o método imprimirPeca e retirarUnidade---------
        
        //lista.imprimirPeca(0); /* Irá imprimir a peça com índice 0 para mostrar a qtd antes de executar o método retirarUnidades()*/
        
        //lista.retirarUnidades(0, 1); /* Irá subtrair 1 a quantidade de estoque da peça de indice 0 */
        
        //lista.imprimirPeca(0); /* Quantidade de itens no estoque diminuiu */
        
        //---------Testando o método acrescentarUnidades---------
        
        //lista.imprimirPeca(0); /* Irá imprimir a peça com índice 0 para mostrar a qtd antes de executar o método acrescentarUnidades()*/
        
        //lista.acrescentarUnidades(0, 1); /*Irá adicionar 1 a quantidade de estoque da peça de indice 0 */
        
        //lista.imprimirPeca(0); /* Quantidade de itens no estoque subiu */
        
        //---------Testando o método relatorioGeral---------
        //lista.relatorioGeral();
        
        //---------Testando o método relatorioReposição
        //lista.relatorioReposição(15);
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
    }
    
}
