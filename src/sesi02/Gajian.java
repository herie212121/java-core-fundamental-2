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
public class Gajian extends Karyawan {

    private double gaji;

     @Override
    public double hitungGaji() {
        double cash;

        cash = gaji / 12;
      return cash;
    }

}
