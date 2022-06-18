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
public class PegawaiTetap extends Pegawai{
    private double upah;
    
    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }
    
    public double getUpah() {
        return upah;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }
    
    public int pendapatan(){
        return (int)upah;
    }
    @Override
    public String toString() {
        return "Nama Pegawai Tetap\t: " + getNama() 
                + "\nNo.Ktp\t\t\t: " + getNoKTP() 
                + "\nupah\t\t\t: " + "Rp."+upah 
                + "\nTotal Pendapatan\t: Rp." + pendapatan() 
                + "\n";
    }
}
