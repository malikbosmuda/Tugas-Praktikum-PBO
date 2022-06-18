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
public class Main {
    public static void main(String[] args){
        DataManusia data =new DataManusia();
        
        Manusia ahmad = new Manusia("Ahmad Saiful","3923842934",true,true);
        System.out.println(ahmad.toString());
        System.out.println("");
        
        Manusia mimin = new Manusia("Minah Bululawang","3237296332",false,true);
        System.out.println(mimin.toString());
        System.out.println("");
        
        Manusia yoga = new Manusia("Yoga Singosari","45236924723",true,false);
        System.out.println(yoga.toString());
        System.out.println("");
        
        Pekerja mamat = new Pekerja(7,22,"3242346812231","Mamat Tyo","3923842934",true,true);
        System.out.println(mamat.toString());
        System.out.println("");
        
        Pekerja layla = new Pekerja(7,22,"59587461323","Layla Sari","3923842934",false,false);
        System.out.println(layla.toString());
        System.out.println("");
        
        Pekerja widi = new Pekerja(7,22,"495824321323","Widi Nugroho","3923842934",true,false);
        System.out.println(widi.toString());
        System.out.println("");
        
        Mahasiswa adi = new Mahasiswa("205152601111018",3.9,"Adi Gundul","2154217681746",true, false);
        System.out.println(adi.toString());
        System.out.println("");
        
        Mahasiswa ady = new Mahasiswa("215153601111018",3.3,"Slamet Riyadi","215150601111002",true, true);
        System.out.println(ady.toString());
        System.out.println("");
        
        Mahasiswa dinda = new Mahasiswa("215153601111018",2.7,"Adinda Kasmara","20213234184040",false, false);
        System.out.println(adi.toString());
        System.out.println("");
        
        Manajer malik = new Manajer(14,30,"7182394124","Maulana Malik","3127617236",true,true,1000);
        System.out.println(malik.toString());
        System.out.println("");
        
        Manajer yopi = new Manajer(10,25,"72387421323","Rangga Yovie","3732835334",true,false,1500);
        System.out.println(yopi.toString());
        System.out.println("");
        
        Manajer nur = new Manajer(7,22,"231239747342","An-Nur Syafaah","3919823934",false,false,800);
        System.out.println(nur.toString());
        System.out.println("");
        
        System.out.println("Jumlah Manusia  : 9");
        System.out.println("-------------------");
        System.out.println("Mahasiswa       : 3");
        System.out.println("Pekerja         : 3");
        System.out.println("Manajer         : 3");
    
    }
}
