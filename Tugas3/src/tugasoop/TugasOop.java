package tugasoop;
import java.util.*;
import java.math.*;


class Baju{
    int harga;
    String tipe;
    int jumlah;
    int dis;
    
    final int a = 100000; // 95/100
    final int b = 125000; // 96/100
    final int c = 175000; // 32/35
    
    Baju (){
        
    }
    
    Baju (String tipe, int jumlah){
        this.tipe = tipe;
        this.jumlah = jumlah;
    }
    void hargaA(){
        harga = jumlah*a;
        dis = a;
        if (jumlah>100){
            dis =a-5000;
            harga = dis*jumlah;
        }
    }
    void hargaB(){
        harga = jumlah*b;
        dis = b;
        if (jumlah>100){
            dis =b-5000;
            harga = dis*jumlah;
        }
    }
    void hargaC(){
        harga = jumlah*c;
        dis = c;
        if (jumlah>100){
            dis = c-15000;
            harga = dis*jumlah;
        }
    }
    void display(){
        System.out.println("Jenis baju yang anda beli : "+tipe);
        System.out.println("Harga per buah\t\t  : "+dis);
        System.out.println("Total harga\t\t  : "+harga);
    }
}

public class TugasOop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Baju klambi = new Baju();
        
        System.out.println("Baju yang tersedia : \n"
                + "Baju A dengan harga 100.000\n"
                + "Baju B dengan harga 125.000\n"
                + "Baju C dengan harga 175.000\n");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String type = input.next();
       
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int j = input.nextInt();
        
        char t = type.charAt(0);
        
        klambi = new Baju(type,j);
        
        if (t == 'a' || t =='A'){
            klambi.hargaA();
        }else if (t == 'b' || t=='B'){
            klambi.hargaB();
        }else if (t == 'c' || t =='C'){
            klambi.hargaC();
        }else {
            System.out.println("tipe yang anda cari tidak tersedia");
        }
        
        klambi.display();
        
    }
    
}
