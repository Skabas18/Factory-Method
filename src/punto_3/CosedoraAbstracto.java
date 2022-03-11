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

public abstract class CosedoraAbstracto {
    public static final int NIKE= 1;
    public static final int ADIDAS= 2;
    public static final int PUMA= 3;
    
    public abstract Icamisa fabricar(int tipo);
}
