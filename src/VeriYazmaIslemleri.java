
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamza
 */
public class VeriYazmaIslemleri {
    
    public static void veriYaz(String vad,String vsifre){
        
        FileWriter veriyazma = null;
        
        
        
        try {
            veriyazma = new FileWriter("Kullanicilar.txt",true);
            veriyazma.write(vad+"-"+vsifre+"-" + "0"+"\n");
            
        } catch (IOException ex) {
            Logger.getLogger(VeriYazmaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            
            if (veriyazma != null) {
                try {
                    veriyazma.close();
                } catch (IOException ex) {
                    System.out.println("Dosya Kapatılırken bir hata oluştu...");
                }
                
            }
        }
    }
    
    
    
    
    
    
    
}
