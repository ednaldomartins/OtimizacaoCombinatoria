
package model;

import java.util.List;
import util.Classificar;
import util.Pessoa;
import util.Roubar;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 16.10.2018                                                           *
 ******************************************************************************/
public class Ladrao extends Pessoa implements Classificar, Roubar
{
    private Mochila mochila;

    public Ladrao(Mochila mochila) {
        this.mochila = mochila;
    }
    
    //InsertionSort
    @Override
    public void classificarItens(List<Item> listaItens) 
    {
        long nItens = listaItens.size();
        for(int i = 1; i < nItens; i++)
        {   //1)j verifica para tras. 2)guardar o valor do pivo inicial.
            int j = i-1;
            Item pivo = listaItens.get(i);
            float valorPivo = pivo.getValor()/pivo.getPeso();
            float valorItemLista = listaItens.get(j).getValor()/listaItens.get(j).getPeso();
            do{
                valorItemLista = listaItens.get(j).getValor()/listaItens.get(j).getPeso();
                j--;
            }while( j >= 0 && ( valorPivo > valorItemLista ) );
            listaItens.add(j+1, listaItens.remove(i));
        }
    }

    @Override
    public void roubarItem(List<Item> listaItens, long nItens) 
    {
        int i = 0;
        while( i < nItens && mochila.getEspaco()>0 )
        {   
            if( listaItens.get(i).getPeso() > mochila.getEspaco() )
                i++;
            else    
            {   //remove da lista e coloca na mochila
                mochila.addItem(listaItens.remove(i));
                nItens--;
            }
        }
    }
    
}
