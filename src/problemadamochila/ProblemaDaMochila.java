
package problemadamochila;

import infra.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Item;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 11.10.2018                                                           *
 ******************************************************************************/
public class ProblemaDaMochila 
{

    public static void main(String[] args) throws IOException 
    {
        Arquivo arquivo = new Arquivo("..//ProblemaDaMochila//src//infra//instancias//mochila01.txt");
        List <Item> list = new ArrayList();
        list = arquivo.carregarObejtos();
        System.out.print("");
    }
}
