package bagasmuhammadshaka_praktikum7;
import java.util.Scanner;

public class BagasMuhammadShaka_praktikum7 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     mahasiswa mhs = new mahasiswa();
      
      int hasil = mhs.sumValue(5,8);
      System.out.println(hasil);
      
     mhs.printData("Ilmu Komputer");
     mhs.hitungNA();
     mhs.hitungNA(90,90,90);
     
     mahasiswa mhs2 = new mahasiswa("Bagashaka","2117051047",80,90,88);
     mhs2.printData("Ilmu komputer");
     
     mhs2.setNama("Bukan bagas");

     
        
    }
    
}
