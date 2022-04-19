package pertemuan7poin02;

/**
 *
 * @author 20103115 I Kadek Edi Putrayasa
 */
public class Pertemuan7poin02 {
    public static void main(String[] args) {
        buah B = new buah();
        
        B.setNAMA("Anggur");
        B.setWARNA ("Ungu");
        B.setHarga (8000);
        
        B.TampilInfo();
        
        Apel A = new Apel();
        A.setNAMA ("Apel Merah");
        A.setWARNA ("Merah");
        A.setHarga (3500);
        A.TampilInfo();
    }
    
}
