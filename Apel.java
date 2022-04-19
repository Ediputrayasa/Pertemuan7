package pertemuan7poin02;

/**
 *
 * @author 20103115 I Kadek Edi Putrayasa
 */
public class Apel extends buah{
    
    @Override
    public void TampilInfo  (){
        System.out.println("Informasi Data Harga Buah Apel");
        System.out.println("Nama Buah       :"+this.getNAMA());
        System.out.println("Harga Buah      :"+this.getHarga());
        System.out.println("Warna Buah      :"+this.getWARNA());
    

    }
}
