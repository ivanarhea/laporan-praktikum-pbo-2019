/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jb3enkapsulasi;

/**
 *
 * @author Rhea Ivana
 */
public class Motor1841720189Rhea {
    private int kecepatan    = 90;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn    = true;
    }
    public void matikanMesin(){
        kontakOn    = false;
        kecepatan   = 0; 
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            if (kecepatan>=100){
                kecepatan = 100;
            } else{
                kecepatan+=5;
        }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
