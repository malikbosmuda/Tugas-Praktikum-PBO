/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfood;

/**
 *
 * @author Maulana Malik AF
 */
public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;
    
    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }
    
    
    
    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant = namaMerchant;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public void setHargaProduk(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
    
    
    public String getNamaProduk(){
        return namaProduk;
    }
    public String getNamaMerchant(){
        return namaMerchant;
    }
    public double getHargaMakanan(){
        return hargaMakanan;
    }
    
}
