
package model;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 15.10.2018                                                           *
 ******************************************************************************/
public class Objeto 
{
    
    private long valor;
    private long peso;

    public Objeto(long valor, long peso)
    {
        this.valor = valor;
        this.peso = peso;
    }

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
