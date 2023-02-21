/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeniskucing;

/**
 *
 * @author muhammad
 */
public class JenisKucing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kucing kc= new kucing();
        angora agr=new angora();
        kucingLokal kl=new kucingLokal();
        persia pr=new persia();
        kc.buluKucing();
        agr.buluKucing();
        kl.buluKucing();
        pr.buluKucing();
    }
    
}
