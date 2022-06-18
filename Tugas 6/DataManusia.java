/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitasbikinibottom;
import java.util.*;
/**
 *
 * @author Maulana Malik AF
 */
public class DataManusia {
    ArrayList<Manusia> mns = new ArrayList<>();
    ArrayList<Mahasiswa> mhs = new ArrayList<>();
    ArrayList<Pekerja> pkr = new ArrayList<>();
    ArrayList<Manajer> mnj = new ArrayList<>();
    
    public void addManusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        mns.add(new Manusia(nama, nik, jenisKelamin, menikah));
    }
    
    public void addMahasiswa(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        mhs.add(new Mahasiswa(nim, ipk, nama, nik,jenisKelamin,menikah));
    }
    public void addPekerja(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jenisKelamin, boolean menikah){
        pkr.add(new Pekerja(jamKerja,  hariKerja,  nip,  nama,  nik,  jenisKelamin, menikah));
    }
    public void addManusia(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jenisKelamin, boolean menikah,int lamaKerja){
        mnj.add(new Manajer(jamKerja, hariKerja,  nip,  nama,  nik, jenisKelamin,  menikah, lamaKerja));
    }
    
    public void tampilData(){
        System.out.println("Jumlah Manusia  : "+mhs.size()+mns.size()+mnj.size()+pkr.size());
        System.out.println("terdiri dari,");
        System.out.println("Mahasiswa       : "+mhs.size());
        System.out.println("Pekerja         : "+pkr.size());
        System.out.println("Manajer         : "+mnj.size());
    }
}
