/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

/**
 *
 * @author Maulana Malik AF
 */
public class Main {
    public static void main (String[] args){
        CarRider ming = new CarRider("Lin Ming",19,"0800000000");
        CarRider youhan = new CarRider("Bei Youhan",20,"0811111111");
        CarRider ling = new CarRider("Ling ér",31,"081222222222");
        
        CarRider adi = new CarRider("Ahmad Adi",26,"083848295464");
        CarRider  malik = new CarRider("Malik",26,"085895818063");
        CarRider julio = new CarRider("Julio lio",32,"081911911911");
        CarRider  mak = new CarRider("Mak Zukeberg",31,"085858681193");
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB","Honda");
        data.addCar("SPORT", "N 2222 AB","SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB","Suzuki");
        
        data.addCar("SPORT", "AE 2253 CK","Nissan GTR");
        data.addCar("EVERYDAY", "N 4432 POL","Mazda");
        data.addCar("SPORT", "N 1 D","Porche");
        data.addCar("SUV", "B 1455 AK ","Land Rover");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        
        arsip.Rent(adi, data.carList.get(5), 7);
        arsip.Rent(malik, data.carList.get(3), 30);
        arsip.Rent(julio, data.carList.get(5), 10);
        arsip.Rent(mak, data.carList.get(3), 9);
        
        System.out.println("");
        arsip.info();
    }
}

