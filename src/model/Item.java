
package model;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 15.10.2018                                                           *
 ******************************************************************************/
public class Item 
{
    
    private long valor;
    private long peso;

    public Item(long valor, long peso)
    {
        this.valor = valor;
        this.peso = peso;
    }

    public Item() {}

    public long getValor() {
        return valor;
    }

    public long getPeso() {
        return peso;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }
    
}
