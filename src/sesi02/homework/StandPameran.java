/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi02.homework;

/**
 *
 * @author HERIADIE
 */
public class StandPameran implements Setoran {

    private String lokasi;
      int jumlahKaryawanPameran;
    int gajiKaryawanPameran;
    int totalGajiKaryawan;
    int jumlahHariBukaPameran;

    @Override
    public void printoutSummary() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("========================================");
        System.out.println("Ringkasan");
        System.out.println("Saat ini Pameran berlokasi di : " + getLokasi());
        System.out.println("========================================");
        System.out.println("Jumlah karyawan : " + jumlahKaryawanPameran);
        System.out.println("Gaji karyawan   : " + gajiKaryawanPameran);
        System.out.println("========================================");
        totalGajiKaryawan = (jumlahKaryawanPameran * gajiKaryawanPameran);
        System.out.println("Total gaji Karyawan : " + totalGajiKaryawan);
        System.out.println("=============next===========\n\n");

    }

    @Override
    public void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        jumlahKaryawanPameran = jumlahKaryawan;
        gajiKaryawanPameran = gajiKaryawan;
        jumlahHariBukaPameran = jumlahHariBuka;

        System.out.println("Persiapan .... Pameran");
        System.out.println("Data Karyawan   : " + jumlahKaryawan);
        System.out.println("Gaji Karyawan   : " + gajiKaryawan);

    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

}
