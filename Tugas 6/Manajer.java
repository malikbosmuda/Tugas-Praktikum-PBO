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
public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jenisKelamin, boolean menikah,int lamaKerja) {
        super(jamKerja, hariKerja, nip, nama, nik, jenisKelamin, menikah);
        
        this.lamaKerja = lamaKerja;
        setPendapatan(getTunjangan()+getCuan());
    }
    
    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "lamaKerja       : " + lamaKerja + " hari";
    }
    
}
