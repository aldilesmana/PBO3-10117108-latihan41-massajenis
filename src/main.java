//NAMA  :Aldi Lesmana 
//NIM   :10117108   
//KELAS :IF-3


/**
 *
 * @author Aldi Lesmana
 */
public class main {
    public static void main(String[] args) {
        
        Kubus objK = new Kubus();
        System.out.println("==== Massa Jenis Kubus====");
        objK.setSisi(5);
        objK.setMassa(250);
        System.out.println("Sisi : "+objK.getSisi());
        System.out.println("Massa : "+objK.getMassa());
        System.out.println("");
        System.out.println("==== Hasil Perhitungan====");
        System.out.println("Volume : "+objK.hitungVolume(0));
        System.out.println("Massa Jenis : "+objK.hitungMassaJenis(0,0));

    }
    
}
