import java.io.*;
import java.util.*;
class Persegi{
    int sisi;
    Persegi(){
        
    }
    Persegi(int sisi){
        this.sisi = sisi;
    }
    
    void luasPrs(){
        int luas = sisi*sisi;
        System.out.println(luas);
    }
}

class Segitiga{
    int alas;
    int tinggi;
    Segitiga(){
        
    }
    Segitiga(int a, int t){
        this.alas = a;
        this.tinggi = t;
    }
    
    void luasSgt(){
        int luas = alas*tinggi/2;
        System.out.println(luas);
    }
    
}

class Lingkaran{
    double pi;
    int r;
    Lingkaran (){
        
    }
    Lingkaran(double pi, int r){
        this.pi=pi;
        this.r=r;
    }
    void luasLng(){
        Double luas = pi*r*r;
        int luasBalik = luas.intValue();
        Double luasLagi = (double)luasBalik;
        System.out.println(luasLagi);
    }
    
}

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Persegi prs = new Persegi();
        Segitiga sgt = new Segitiga();
        Lingkaran lng = new Lingkaran();
        
        int pilih = input.nextInt();
        
        if (pilih==1){
            prs.sisi= input.nextInt();
            prs.luasPrs();
        }else if (pilih==2){
            sgt.alas = input.nextInt();
            sgt.tinggi = input.nextInt();
            sgt.luasSgt();
        }else if (pilih==3){
            lng.r = input.nextInt();
            if (lng.r%7==0){
                lng.pi=(22/7);
            }else{
                lng.pi=3.14;
            }
            lng.luasLng();
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
        
        
        
    }
}