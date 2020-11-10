/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi03;

import java.io.File;
import sesi02.KebunBinatang;

/**
 *
 * @author HERIADIE
 */
public class PraktekFile {
    public static void main(String[] args) {
        
        File target = new File ("folderA");
        String satuan[] = target.list();
        
        for (String isi: satuan){
            System.out.println("ditemuakan file " + isi);
        }
        
        File target1 = new File ("folderA");
        File satuan1[] = target1.listFiles();
        
        for (File isi: satuan1){
            System.out.println("ditemuakan file  " + isi.toString());
        }
        
        
          
//        KebunBinatang eksekusi = new KebunBinatang("Bandung", 100 );
//        KebunBinatang eksekusi2 = new KebunBinatang("Bogor");
     }
    
}
