/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intlib;

/**
 *
 * @author Perrotti
 * 
 * Mantem uma lista ordenada de objetos.
 * 
 */
public class SorteableList 
{
    protected SorteableItem list[];
    protected int count;

    public SorteableList(int maxItens) 
    {
        list = new SorteableItem[maxItens];
        count = 0;
    }

    
    public boolean addItem(SorteableItem item)
    {
        if(count >= list.length) return false;
        list[count]= item;
        count++;
        return true;
    }
    
    public void sort()
    {
        for(int i=0; i<count-1; i++)
          for(int j=i+1; j<count; j++)
          {
              if(list[i].compare(list[j])>0)
              {
                  SorteableItem tmp = list[i];
                  list[i]=list[j];
                  list[j]= tmp;
              }
          }
    }
    
    public void printList()
    {
        for(int i=0; i<count; i++)
            list[i].printItem();
    }
   
}
