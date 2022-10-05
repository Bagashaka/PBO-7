package bagasmuhammadshaka_praktikum7;
import java.util.Scanner;

public class mahasiswa {
    private Scanner input = new Scanner(System.in);

    private String nama;
    private String npm;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double NA;
    
    public mahasiswa(String nama,String npm,double nilaiTugas,double nilaiUts,double nilaiUas){
        this.nama = nama;
        this.npm = npm;
        this.nilaiTugas= nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
   }
   
    
    public void printData(String jurusan){
        System.out.println("Nama\t:"+this.getNama());
        System.out.println("NPM\t:"+this.getNpm());
        System.out.println("Jurusan\t:"+jurusan);
    }
    
    public int sumValue(int x,int y){
      return x+y;
    }
    
    public void hitungNA(){
        this.setNA((this.getNilaiTugas() * 0.30) + (this.getNilaiUts() * 0.35) + (this.getNilaiUas() * 0.35));  //this berqarti menempatkan nilai pada atribut class langsung
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){ //menempatkan nilai pada parameter
        this.setNA((nilaiTugas*0.30)+ (nilaiUts*0.35) + (nilaiUas*0.35));
    }
    
    public void hitunNA(String Pesan){
        System.out.print("Nilai tidak valid");
    }
    
    public void setNama(String nama){ 
    this.nama = nama;
    }
 
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    
    public void setNpm(String npm) {
        this.npm = npm;
    }

   
    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    
    public double getNilaiUts() {
        return nilaiUts;
    }

    
    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

  
    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }


    public double getNA() {
        return NA;
    }

    public void setNA(double NA) {
        this.NA = NA;
    }
    
}
