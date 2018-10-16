
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
    private ArrayList<Objeto>listaObjetos;

    public Mochila(long espacoTotal)
    {
        this.espacoTotal = espacoTotal;
        this.espacoDisponivel = espacoTotal;
        this.listaObjetos = new ArrayList();
    }

    //GETs
    public long getEspacoTotal() {
        return espacoTotal;
    }

    public long getEspaco() {
        return espacoDisponivel;
    }

    public ArrayList<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    //SETs
    public void setEspacoTotal(long espacoTotal) {
        this.espacoTotal = espacoTotal;
    }

    public void setEspaco(long espaco) {
        this.espacoDisponivel = espaco;
    }

    public void setListaObjetos(ArrayList<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
    
}
