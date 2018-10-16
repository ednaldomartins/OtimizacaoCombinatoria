
package model;

import java.util.ArrayList;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 15.10.2018                                                           *
 ******************************************************************************/
public class Mochila 
{
    private long espacoTotal;
    private long espacoDisponivel;
    private ArrayList<Item>listaItens;

    public Mochila(long espacoTotal)
    {
        this.espacoTotal = espacoTotal;
        this.espacoDisponivel = espacoTotal;
        this.listaItens = new ArrayList();
    }

    public void addItem( Item item )
    {
        if(item.getPeso() <= espacoDisponivel)
        {
            listaItens.add(item);
            setEspaco( getEspaco() - item.getPeso() );
        }
    }
    
    
    //GETs
    public long getEspacoTotal() {
        return espacoTotal;
    }

    public long getEspaco() {
        return espacoDisponivel;
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    //SETs
    public void setEspacoTotal(long espacoTotal) {
        this.espacoTotal = espacoTotal;
    }

    public void setEspaco(long espaco) {
        this.espacoDisponivel = espaco;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }
    
}
