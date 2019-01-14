/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerfaces;

/**
 *
 * @author socamporomani
 */
public class ExemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa per= new Persoa();
        Canario cana=new Canario();
        Galo gallo=new Galo();
        gallo.cantar();
        cana.cantar();
        per.cantar();
        
        IPodeCantar obx =new Persoa();
        obx.cantar();
        Tenor te=new Tenor();
        te.cantar();
    }
    
}
