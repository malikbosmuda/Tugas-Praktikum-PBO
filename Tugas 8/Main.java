/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasgame;
import java.util.*;
/**
 *
 * @author Maulana Malik AF
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Warrior wr = new Warrior(30, 40, 100);
        Magician mg = new Magician(10, 60, 100);
        Healer hl = new Healer(10, 10, 70);
        Titan ttn = new Titan(0, 45, 200);
 
        System.out.println("Welcome to Defense FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        int choose = 0;
        do{
            try{
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                String[] role = {"1. Magician", "2. Healer", "3. Warrior"};
                for(String Hero : role) {
                    System.out.println(Hero);
                }
                choose = input.nextInt();
                
                if(choose < 1 || choose > 3) throw new NumberFormatException();
                }catch (Exception e){
                    if(e instanceof NumberFormatException) {
                        System.out.println("Silahkan masukan angka 1 - 3");
                    }else{
                        System.err.println("Silahkan masukkan angka !!!");
                        input.next();
                }
             }
        }while (choose == 0);
            System.out.println("Selamat datang, " + nama);
 
        switch(choose){
            case 1 :
                int i = 1;
                mg.info();
                while(mg.getHp() != 0 && ttn.getHp() != 0){
                    System.out.println("==============" + " TURN " + i + " ==============");
                      
                    if(mg.attack()){
                        ttn.receiveDamage(mg.getAttack());
                    }
                    if(ttn.attack()){
                        mg.receiveDamage(ttn.getAttack()); 
                    }
                    System.out.println("Enemy's HP\t: " + ttn.getHp());
                    System.out.println(nama +"'s HP\t: " + mg.getHp());
                    i++;
                }
                System.out.println("====================================");
                if(ttn.getHp() == 0) {
                System.out.println(nama + " menang\n");
                }
                if(mg.getHp() == 0) {
                System.out.println("Titan menang\n");
                }
                System.out.println("============== PLAYER ==============");
                mg.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                ttn.info();
            break;
 
            case 2 :
                int j = 1;
                hl.info();
                while(hl.getHp() != 0 && ttn.getHp() != 0){
                    System.out.println("==============" + " TURN " + j + " ==============");
                    if(j % 2 == 0) {
                    hl.heal();
                    }
                    if(hl.attack()){
                    ttn.receiveDamage(hl.getAttack());
                    }
                    if(ttn.attack()){
                    hl.receiveDamage(ttn.getAttack()); 
                    }
                    System.out.println("Enemy's HP\t: " + hl.getHp());
                    System.out.println(nama +"'s HP\t: " + ttn.getHp());
                    j++;
                }
                System.out.println("====================================");
                if(ttn.getHp() == 0) 
                    System.out.println(nama + " menang\n");
                if(hl.getHp() == 0) 
                    System.out.println("Titan menang\n");
                System.out.println("============== PLAYER ==============");
                hl.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                ttn.info();
            break;
 
            case 3 :
                int k = 1;
                wr.info();
                while(wr.getHp() != 0 && ttn.getHp() != 0){
                    System.out.println("==============" + " TURN " + k + " ==============");
                    if(wr.attack()){
                    ttn.receiveDamage(wr.getAttack());
                    }
                    if(ttn.attack()){
                    wr.receiveDamage(ttn.getAttack()); 

                    }
                    System.out.println("Enemy's HP\t: " + ttn.getHp());
                    System.out.println(nama +"'s HP\t: " + wr.getHp());
                    k++;
                }
                System.out.println("====================================");
                if(ttn.getHp() == 0) System.out.println(nama + " menang\n");
                if(wr.getHp() == 0) System.out.println("Titan menang\n");
                System.out.println("============== PLAYER ==============");
                wr.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                ttn.info();
                break;
            }
        
    }
    
}
