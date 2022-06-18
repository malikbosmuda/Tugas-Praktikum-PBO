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
public class Pegawai {
    private String nama;
    private String noKTP;
    
    public Pegawai(String nama, String noKTP){
    this.nama = nama;
    this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }
    
    @Override
    public String toString() {
        return "Nama Pegawai Tetap\t: " + getNama() 
                + "\nNo.Ktp\t\t\t: " + getNoKTP() 
                + "\n";
    }
}
