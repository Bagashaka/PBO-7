package com.mycompany.bagasmuhammadshaka_praktikum7;

import java.util.ArrayList;

class Mahasiswa {
    private String nama;
    private String npm;
    private double nilaiTugas ;
    private double nilaiUts;
    private double nilaiUas;
    private double NA;
    
     public Mahasiswa(String nama,String npm, double nilaiTugas, double nilaiUts,double nilaiUas){
     this.nama = nama;
     this.npm = npm;
     this.nilaiTugas = nilaiTugas;
     this.nilaiUts = nilaiUts;
     this.nilaiUas = nilaiUas;
     }

     public void printData(String jurusan){
     System.out.println("NPM : "+this.npm);
     System.out.println("Nama : "+this.nama);
     System.out.println("Jurusan : " + jurusan);
     System.out.println("Nilai tugas : "+this.nilaiTugas);
     System.out.println("Nilai UTS : "+this.nilaiUts);
     System.out.println("Nilai UAS : "+this.nilaiUas);
     System.out.println("Nilai akhir : "+this.NA);
     }
     
     public void printData(){
     System.out.println("NPM : "+this.npm);
     System.out.println("Nama : "+this.nama);
     System.out.println("Nilai tugas : "+this.nilaiTugas);
     System.out.println("Nilai UTS : "+this.nilaiUts);
     System.out.println("Nilai UAS : "+this.nilaiUas);
     System.out.println("Nilai akhir : "+this.NA);
     }
     
     public int sumValue(int x, int y){
     return 5+3;
     }     
     
     public void hitungNA(){
         this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas*0.35);
     }
     
     public void hitungNA(double nilaiTugas,double nilaiUts,double nilaiUas){
         this.NA = (nilaiTugas*0.3)+(nilaiUts*0.35)+(nilaiUas*0.35);
     }
     
     public void hitungNA(String pesan){
       System.out.println("Nilai Tidak Valid");
     }
     
     public void hitungTugas(ArrayList<Double> nilai){
         double hasil = 0;
         for(double total : nilai){
            hasil += total;
         }
         nilaiTugas = hasil/nilai.size();
      }
     
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
