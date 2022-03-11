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
public class Punto_3 {

    public static void main(String[] args) {
    Icamisa camisa_adidas =CosedoraEspecifico.fabricar(CosedoraEspecifico.ADIDAS);
    camisa_adidas.fabricar();
    
     Icamisa camisa_nike =CosedoraEspecifico.fabricar(CosedoraEspecifico.NIKE);
    camisa_nike.fabricar();
    
     Icamisa camisa_puma =CosedoraEspecifico.fabricar(CosedoraEspecifico.PUMA);
    camisa_puma.fabricar();
    
   
    }
    
}
