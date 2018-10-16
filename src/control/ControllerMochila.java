
package control;

import infra.Arquivo;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Item;
import model.Ladrao;
import model.Mochila;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 16.10.2018                                                           *
 ******************************************************************************/
public class ControllerMochila 
{
    private Ladrao ladrao;
    private List <Item> itens;
    private long quantidadeItens;
    private final long espacoMochila;
    private final String ARQUIVO_ORIGEM = "..//ProblemaDaMochila//src//infra//instancias//mochila02.txt";

    public ControllerMochila()
    {
        this.itens = carregarListaArquivo();
        //A primeira posicao recuperada do arquivo = numeroDeItens, espacoDaMochila
        this.quantidadeItens = itens.get(0).getPeso();
        this.espacoMochila = itens.get(0).getValor();
        ladrao = new Ladrao( new Mochila(espacoMochila) );
        itens.remove(0);
    }
    
    public void fazerArrastao()
    {
        ladrao.classificarItens(itens);
        ladrao.roubarItem(itens, quantidadeItens);
        this.quantidadeItens = itens.size();
    }
    
    private List<Item> carregarListaArquivo() 
    {
        try {
            return new Arquivo(ARQUIVO_ORIGEM).carregarItens();
        } catch (IOException ex) { Logger.getLogger(ControllerMochila.class.getName()).log(Level.SEVERE, null, ex); }
        return null;
    }
}
