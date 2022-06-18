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
public class Main {
    public static void main(String[] args){
        Pegawai mamat = new PegawaiTetap("Ahmad Adi", "341614924194", 4500000);
        Pegawai mimin = new PegawaiTetap("Mimin Dwi", "305357017321", 5000000);
        Pegawai malik = new PegawaiTetap("Maulana Malik", "35730512908", 6000000);
        
        Pegawai agung = new PegawaiHarian("Agung Titanic", "384181327917", 8500, 40);
        Pegawai yanti = new PegawaiHarian("Sri Mulyanti", "83895818063", 9000, 45);
        Pegawai sri = new PegawaiHarian("Sri Lestari", "334132691312", 10000, 60);
        
        Pegawai yanto = new Sales("Yayan Santoso", "3523162371321", 100, 50000);
        Pegawai bair = new Sales("Bayu Aji", "3434343434343", 200, 40000);
        Pegawai alex = new Sales("Muhammad Alex", "381523815326", 150, 30000);
        
        System.out.println(mamat.toString());
        System.out.println(mimin.toString());
        System.out.println(malik.toString());
        System.out.println(agung.toString());
        System.out.println(yanti.toString());
        System.out.println(sri.toString());
        System.out.println(yanto.toString());
        System.out.println(bair.toString());
        System.out.println(alex.toString());
        
    }
}
