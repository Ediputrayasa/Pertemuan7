package pertemuan7poin01;

/**
 *
 * @author 20103115 I Kadek Edi Putrayasa
 */
public class Pertemuan7poin01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa MHS = new mahasiswa ();
        
//        overloading

//Tanpa parameter
        MHS.datamhs();
//Menggunakan 1 Parameter
        MHS.datamhs("20103115");
//Menggunakan 2 Parameter
        MHS.datamhs("20103115","Edi");
    }
    
}
