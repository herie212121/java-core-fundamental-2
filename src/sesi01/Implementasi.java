/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi01;

/**
 *
 * @author HERIADIE
 */
public class Implementasi {
    
    public static void main(String[] args) {
        Laptop asus1 = new Laptop();
        asus1.hidup();
        asus1.setModel("herie");
       Laptop asus2 = new Laptop();
        asus2.hidup();
        asus2.setModel("heriadie");
        
        Laptop asus3 = new Laptop();
        asus3.hidup();
        asus3.setModel("herieheriadie");
        
        
        System.out.println("=============");
        System.out.println("didapat 3 mesin");
        System.out.println(asus1.getModel());
        System.out.println(asus2.getModel());        
        System.out.println(asus3.getModel());
        
        
    }
    
}
