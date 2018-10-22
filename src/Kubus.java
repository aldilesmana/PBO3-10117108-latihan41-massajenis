//NAMA  :Aldi Lesmana
//NIM   :10117108  
//KELAS :IF-3


/**
 *
 * @author Aldi Lesmana
 */
public class Kubus {
     private int sisi,massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return sisi*sisi*sisi;
        
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return massa / (sisi * sisi * sisi);
        
    }
    
}
