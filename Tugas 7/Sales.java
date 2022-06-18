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
public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;
    
    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }
    
    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public int pendaptan() {
        return (int)(penjualan * komisi);
    }

    @Override
    public String toString() {
        return "Nama Sales\t\t: "+ getNama()
                + "\nNo KTP\t\t\t: " + getNoKTP() 
                + "\npenjualan\t\t: " + penjualan +" unit" 
                + "\nkomisi\t\t\t: " + "Rp." + komisi +"/unit"  
                + "\nPendapatan\t\t: Rp." + pendaptan() 
                + "\n";
    }
}
