/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt;

/**
 *
 * @author Maulana Malik AF
 */
public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;
    
    public PegawaiHarian (String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.totalJam = totalJam;
        this.upahPerJam = upahPerJam;
    }
    
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    
    public int pendaptan(){
        if (totalJam <= 40){
            return (int) upahPerJam * totalJam;
        }else {
            return (int)((totalJam * upahPerJam) + ((totalJam - 40) * upahPerJam * 1.5));
        }
    }

    @Override
    public String toString() {
        return "Nama Pegawai Harian\t: " + getNama()
                + "\nNo.KTP\t\t\t: " + getNoKTP()
                + "\nUpah/Jam\t\t: " + "Rp." +upahPerJam +"/jam" 
                + "\nTotal Jam Kerja\t\t: " + totalJam + " jam"
                + "\nPendapatan\t\t: Rp." + pendaptan() 
                + "\n";
    }
}
