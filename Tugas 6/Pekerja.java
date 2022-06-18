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
public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String nip;

    public Pekerja(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.nip = nip;
        
        setPendapatan(getTunjangan()+getCuan());
    }
    
    public double getCuan(){
        double cuan;
        gaji = getHariKerja()*getJamKerja()*15;
        
        double bonus1;
        double bonus2;
        int prei=0;
        //Libur
        for(int i=1;i<=getHariKerja();i++){
            if(i%7==0)
            prei+=2;
            
        }
        //lemburJam
        bonus1 = (getHariKerja()-prei)*(getJamKerja()-7)*7; 
        //lemburLibur
        bonus2 = prei*getJamKerja()*20;
        //totalan
        bonus = bonus1+bonus2;
        
        cuan = gaji+bonus;
        return cuan;
    }
    
    public double getGaji() {
        
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getStatus(){
        String kantor;
        String dep;
        char depnum = getNip().charAt(6);
        char cabang = getNip().charAt(2);
        char cabkantor = getNip().charAt(0);
        
        switch (depnum) {
            case '1':
                dep = "Pemasaran";
                break;
            case '2':
                dep = "Humas";
                break;
            case '3':
                dep = "Riset";
                break;
            case '4':
                dep = "Teknologi";
                break;
            case '5':
                dep ="Personalia";
                break;
            case '6':
                dep ="Akademik";
                break;
            case '7':
                dep ="Administrasi";
                break;
            case '8':
                dep ="Operasional";
                break;
            case '9' :
                dep ="Pembangunan";
            default :
                dep ="Belum masuk departemen";
                break;
        }
        switch (cabkantor) {
            case '1':
                kantor = "Mondstadt";
                break;
            case '2':
                kantor = "Liyue";
                break;
            case '3':
                kantor = "Inazuma";
                break;
            case '4':
                kantor = "Sumeru";
                break;
            case '5':
                kantor ="Fontaine";
                break;
            case '6':
                kantor ="Natlan";
                break;
            case '7':
                kantor ="Snezhnaya";
                break;
            default:
                kantor ="Kantor cabang tidak diketahui";
                break;
        }
        
        return dep+" "+ kantor+" cabang "+depnum;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "gaji          : " + gaji + "$"
             + "\nbonus         : " + bonus + "$"
             + "\njamKerja      : " + jamKerja + " jam"
             + "\nhariKerja     : " + hariKerja + " hari"
             + "\nnip           : " + nip
             + "\n"+getStatus();
    }
    
    
}
