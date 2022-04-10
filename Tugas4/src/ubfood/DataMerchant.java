/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfood;
import java.util.*;
/**
 *
 * @author Maulana Malik AF
 */
public class DataMerchant {
    static Scanner input = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] cp = Arrays.copyOf(merc, merc.length+1);
        
        updateMerchant(merchant);
        
        merc = new Merchant[merc.length+1];
        for(int i=0;i<cp.length;i++){
            
            if (cp[i] == null){
                cp[i] = merchant;
                
            }
            
        }
        
        merc = Arrays.copyOf(cp, cp.length);        
        return merc; 
    }
    
    public static void tampilData(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant  : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk    : "+mch1.getNamaProduk());
            System.out.println("Harga          : "+(int)mch1.getHargaMakanan());
            
        }
    }
    
    public static Merchant cariMerchant(String nama){
        for (Merchant mch : merc){
            if (nama == mch.getNamaMerchant()){
                tampilMerchant(mch);
            }
        }
        
        return null;
    }
    
    public static void tampilMerchant(Merchant merchant){
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant  : "+merchant.getNamaMerchant());
        System.out.println("Nama Produk    : "+merchant.getNamaProduk());
        System.out.println("Harga          : "+(int)merchant.getHargaMakanan());
    }
    
    public static void updateMerchant(Merchant merchant){
        merchant.setHargaProduk(merchant.getHargaMakanan());
        merchant.setNamaMerchant(merchant.getNamaMerchant());
        merchant.setNamaProduk(merchant.getNamaProduk());
    }
}
