/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitasbikinibottom;

/**
 *
 * @author Maulana Malik AF
 */
public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;
    private double pendapatan;
    

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        
        setPendapatan(getTunjangan());
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
        
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah(){
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    
    public String getKelamin(){
        if(isJenisKelamin()==true){
            return "Laki-laki";
        }else{
            return "Perempuan";
        }
    }
    
    public String getMenikah(){
        if(isMenikah() == true){
            return "Sudah Menikah";
        }else{
            return "Belum Menikah";
        }
        
        
    }
    
    public double getTunjangan(){
        
        double tunjangan;
        if (isMenikah()==true){
            if(isJenisKelamin()==true){
                tunjangan =+25;
            } else {
                tunjangan =+20;
            }
        }else{
           tunjangan =+15;
        }
        
       return tunjangan;
    } 

    @Override
    public String toString() {
        return "nama          : " + nama
             + "\nnik           : " + nik 
             + "\njenis kelamin : " + getKelamin() 
             + "\nmenikah       : " + getMenikah()
             + "\nPendapatan    : " + pendapatan + "$";
    }

    
}
