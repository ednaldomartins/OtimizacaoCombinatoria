
package infra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import model.Item;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 15.10.2018                                                           *
 ******************************************************************************/
public class Arquivo 
{
    private final Path loadPath;
    private final Charset utf8 = StandardCharsets.UTF_8;
    
    public Arquivo (String loadPath) 
    {
        this.loadPath = Paths.get(loadPath);
    }
    
    public List<Item> carregarObejtos() throws IOException 
    {
        List<Item> listaItens = new ArrayList<>();
        try ( BufferedReader reader = Files.newBufferedReader(loadPath, utf8) )
        {
            String linha = null;
            //a primeira linha contem a quantidade de itens e o espaco da mochila
            while( (linha = reader.readLine()) != null )
            {
                String[] parametro = linha.split(" ");
                Item item = new Item( Integer.parseInt(parametro[0]), Integer.parseInt(parametro[1]) );
                listaItens.add(item);    
            }        
        }
        catch(FileNotFoundException ex) {System.err.println("Arquivo não encontrado");}
        catch(NumberFormatException ex) {System.err.println("Erro de formato de numeros");}
        catch(IOException ex) {System.err.println("Erro de leitura");}
        
        return listaItens;
    }
    
}
