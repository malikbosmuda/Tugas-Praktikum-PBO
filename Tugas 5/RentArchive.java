/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import java.util.ArrayList;

/**
 *
 * @author Maulana Malik AF
 */
public class RentArchive {
    ArrayList<CarRent> rentData = new ArrayList<>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
        if (car.isStatus() == true){
            rentData.add(new CarRent(rider,car,rentDur));
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
        }else{
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
    public void info(){
        System.out.println("----------------------------");
        System.out.println(" INFORMASI  PELANGGAN ");
        System.out.println("----------------------------");
        for (CarRent data : rentData){
            System.out.println("NAMA PEMINJAM : "+ data.getRider().getName());
            System.out.println("TIPE MOBIL : " + data.getCar().getCarType());
            System.out.println("NO. POLISI : " + data.getCar().getPolNum());
            System.out.println("LAMA RENTAL : " + data.getRentDur());
            System.out.println("----------------------------");
        }
    }
}
