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
public class Mahasiswa extends Manusia{
    private String nim;
    private double ipk;

    public Mahasiswa(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
        
        setPendapatan(getTunjangan()+getBeasiswa());
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public String getStatus(){
        String prodi;
        char thn1 = getNim().charAt(0);
        char thn2 = getNim().charAt(1);
        char prod = getNim().charAt(6);
        switch (prod) {
            case '2':
                prodi = "Teknik Menuip Gelembung";
                break;
            case '3':
                prodi = "Teknik Berburu Ubur-Ubur";
                break;
            case '4':
                prodi = "Sistem Perhamburgeran";
                break;
            case '6':
                prodi = "Pendidikan Chum Bucket";
                break;
            case '7':
                prodi ="Teknologi Telepon Kerang";
                break;
            default:
                prodi ="Bukan Mahasiswa Bikini Bottom";
                break;
        }
            
        
        
        return prodi + ", " + 20 + thn1 + thn2;
    }
    
    public double getBeasiswa(){
        double beasiswa;
        if(getIpk()>3.0){
            if(getIpk()>4.0){
                beasiswa = 0;
            }else if(getIpk()<=3.5){
                beasiswa = 50;
            }else{
                beasiswa = 75;
            }
        }else{
            beasiswa = 0;
        }
        
        
        return beasiswa;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "nim             : " + nim
             + "\nipk           : " + ipk
             + "\n"+getStatus();
    }
    
}
