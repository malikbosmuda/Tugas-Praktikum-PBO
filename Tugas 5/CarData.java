/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import java.util.*;

/**
 *
 * @author Maulana Malik AF
 */
public class CarData {
    ArrayList<Car> carList = new ArrayList<>();
    
    public void addCar(String type, String plat, String merk){
        carList.add(new Car(type,plat,merk,true));
    }
    
    public void listOfCar(){
        System.out.println("----------------------------");
        System.out.println(" DAFTAR MOBIL ");
        System.out.println("----------------------------");
        
        for(Car data : carList){
            System.out.println("Tipe mobil : " + data.getCarType());
            System.out.println("No. Polisi : " + data.getPolNum());
            System.out.println("Merk Mobil : " + data.getMerk());
            System.out.println("----------------------------");
        }
        System.out.println("");
    }
}
