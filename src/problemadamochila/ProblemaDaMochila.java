
package problemadamochila;

import java.io.IOException;
        
import control.ControllerMochila;

/*******************************************************************************
 * @author Ednaldo                                                             *
 *  date: 11.10.2018                                                           *
 ******************************************************************************/
public class ProblemaDaMochila 
{

    public static void main(String[] args) throws IOException 
    {
        ControllerMochila control = new ControllerMochila();
        control.fazerArrastao();
        System.out.print("");
    }
}
