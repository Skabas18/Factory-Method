/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_3;

/**
 *
 * @author estudiante
 */

public class CosedoraEspecifico{
    public static final int NIKE= 1;
    public static final int ADIDAS= 2;
    public static final int PUMA= 3;
    
    public void ConsedoraEspecifico(){
    
    }
    public static Icamisa fabricar(int tipo){
        Icamisa micamisa;
        
        switch(tipo){
            case NIKE:
                micamisa = new CamisaNike();
                break;
            case ADIDAS: 
                micamisa = new CamisaAdidas();
                break;
            case PUMA: 
                micamisa = new CamisaPuma();
                break;    
            default:
                micamisa = null;
        }
        return micamisa;
    } 
}