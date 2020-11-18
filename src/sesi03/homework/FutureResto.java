/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi03.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HERIADIE
 */
public class FutureResto {
    public static void main(String[] args) {
        
        FutureResto latihan1 = new FutureResto();
        Scanner bacaan = new Scanner (System.in);
        System.out.println("===============+START+==============");
        System.out.print("Nama: ");
        String masukan = bacaan.nextLine();
        
        latihan1.buatFolder(masukan, masukan);
        
        boolean tetepBaca = true;
        System.out.print("Input Resep Masakan: ");
        
        while (tetepBaca){
            String resep = bacaan.nextLine();
            
            if (resep.contains("q")){
                break;
                
            }else {
               // System.out.println("lanjut " + resep);
            latihan1.isiFile(resep);
            }
            
            
        }
                
        System.out.println("\nWriting data Selesai");
                
        
        
    }
            
    public void buatFolder(String namaFolder, String namaFile){
        
        File sesuatu = new File (namaFolder);
        sesuatu.mkdir();
        
        
    }
    
    public void isiFile (String tulis){
        File isi =new File("resep.log");
        
        try {
           FileWriter penulis = new FileWriter(isi);
           BufferedWriter buff = new BufferedWriter(penulis);
           buff.write(tulis);
           buff.newLine();
           buff.close();
        
        
        } catch (IOException ex) {
            //Logger.getLogger(FutureResto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error nulisnya");
        }
        
        
                
        
    }
}
