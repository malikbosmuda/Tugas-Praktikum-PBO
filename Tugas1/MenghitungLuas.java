import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilih = input.nextInt();
        
        if (pilih==1){
            int s = input.nextInt();
            System.out.println(hitung(s));
            
        }else if (pilih==2){
            int a = input.nextInt();
            int t = input.nextInt();
            System.out.println(hitung(a,t));
            
        }else if(pilih==3){
            double p = 0;
            int r = input.nextInt();
            if (r%7==0){
                p = 22/7;
            }else{
                p = 3.14;
            }
            System.out.println(hitung(p,r));
            
            
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
        
    }
    
    static int hitung(int p){
        
        int hasil = p*p;
        
        return hasil;
    }
    
    static int hitung(int p, int q){
        
        int hasil = (p*q)/2;
        
        return hasil;
        
    }
    
    static double hitung (double p, int q){
        
        double hasil = q*q*p;
        
        return hasil;
    }
    
    
    
}