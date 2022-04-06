/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Web extends Pilihan implements NilaiHitung {
    private float tescod, tesww, testul, nik;
    private String nama;
    Scanner input = new Scanner(System.in);

    public Web(float tescod, float tesww, float testul, float nik, String nama) {
        this.tescod = tescod;
        this.tesww = tesww;
        this.testul = testul;
        this.nik = nik;
        this.nama = nama;
    }
    
     public void webmenu(){
        int pilih = 0;
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1. Edit");
        System.out.println("2. Tampil");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        switch (pilih) {
        
            case 1 : 
                EditNilai();
            
            case 2 :
                TampilkanNilai();
                
            case 3 :
                System.exit(0);
        }
        
        
    }
     
    @Override
      public void EditNilai(){
    System.out.println("Form Edit");
    System.out.println("");
    System.out.print("Input Nilai Tes Tulis : "); 
    testul = input.nextFloat();
    setTestul(testul);
    System.out.print("Input Nilai Tes Coding : ");
    tescod = input.nextFloat();
    setTescod(tescod);
    System.out.print("Input Nilai Tes Wawancara : ");
    tesww = input.nextFloat();
    setTesww(tesww);
    webmenu();
    }
    
    public void TampilkanNilai(){

        System.out.println("Nilai akhir : " + Nilai());
        if(Nilai() >= 85){
            System.out.println("Keterangan : LOLOS");
            System.out.println("Selamat kepada " + nama + " telah diterima sebagai web" );  
        }else{
            System.out.println("Keterangan : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai web" ); 
        }
        System.out.println("");
        webmenu();
    }
    

    public void setTescod(float tescod) {
        this.tescod = tescod;
    }

    public void setTesww(float tesww) {
        this.tesww = tesww;
    }

    public void setTestul(float testul) {
        this.testul = testul;
    } 

    @Override
    public float Nilai() {
    float nilai = (tesww * 25/100) + (tescod * 35/100) + (testul * 40/100);
    return nilai; 
}

}
    

