/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfood;

import java.util.Arrays;

/**
 *
 * @author Maulana Malik AF
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso",8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgot Mblebes","Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi",10000));
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.input.nextLine(),DataMerchant.input.nextLine(),DataMerchant.input.nextDouble()));
        
        DataMerchant.tampilData();
        
    }
    
}
