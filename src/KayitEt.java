
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class KayitEt implements kontroller{
    boolean kontrol;
    String kul_adi;
    String sifre;
    String bakiye;

    public KayitEt(boolean kontrol, String kul_adi, String sifre, String bakiye) {
        this.kontrol = kontrol;
        this.kul_adi = kul_adi;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public KayitEt(String kul_adi, String sifre) throws FileNotFoundException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("Kullanicilar.txt")));
              
            
            
             while (scanner.hasNextLine()) {
              
             String kullanıcı_bilgisi = scanner.nextLine();    
                
             String[] array = kullanıcı_bilgisi.split("-");
                 
                 
                if(kul_adi.equals(array[0])&& sifre.equals(array[1])){
                  
                 this.kontrol = true; 
                 break;
                }
                else{
                  
                  this.kontrol = false;
                }
                 
        }
    }
    
    /*
   public  void kayıtet(String kad,String ksifre) throws FileNotFoundException{
       
       Scanner scanner = new Scanner(new BufferedReader(new FileReader("Kullanıcılar.txt")));
              
            
            
             while (scanner.hasNextLine()) {
              
             String kullanıcı_bilgisi = scanner.nextLine();    
                 
             String[] array = kullanıcı_bilgisi.split("-");
                 
                if(kad.equals(array[0])&& ksifre.equals(array[1])){
                    
                 this.kontrol = true;    
                }
                else{
                  this.kontrol = false;
                }
                 System.out.println(array[0] + array[1]);
        }
             
   }  
*/

    @Override
    public boolean kontrolEt() {
        if(kontrol){
            
            return true;
        }
        else{
            
            return false;
        }
    }
}
