/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi02;

/**
 *
 * @author HERIADIE
 */
public class KebunBinatang {
    
    public KebunBinatang(String nama){
        System.out.println("Kebun binatang " + nama);
    }

    public KebunBinatang(String nama , int jumlahPengunjungMax){
        System.out.println("Kebun binatang "+ nama +"jumlah Pengunjung max " + jumlahPengunjungMax);
        
    }
    
    public static void main(String[] args) {

        Mamalia hewan = new Mamalia();
        hewan.bergerak();
        hewan.makan();

        Mamalia hewanAnyar = new Mamalia();
        hewanAnyar.bergerak();
        hewanAnyar.makan();
        

    }
}
