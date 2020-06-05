/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihann1;

/**
 *
 * @author hp
 */
public class Latihann1 {
    //public static void main(String[] args) {
        //int n = 0;
        //n = System.in.read();
        //System.out.println("Hasil : " + (char) n);
    //}
    public static void main(String[] args) {
        try{
            char n;
            n = (char)System.in.read();
            System.out.println("Hasil : " + n);
        }catch(Exception e){
            System.err.print (e);
        }
    }
}
