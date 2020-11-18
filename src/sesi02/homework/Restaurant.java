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
public class Restaurant implements Setoran {

    String lokasi;
    int jumlahKaryawanRestauran;
    int gajiKaryawanRestauran;
    int totalGajiKaryawan;
    int jumlahHariBukaRestoran;

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    @Override
    public void printoutSummary() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("========================================");
        System.out.println("Ringkasan");
        System.out.println("Saat ini restauran berlokasi di : " + getLokasi());
        System.out.println("========================================");
        System.out.println("Jumlah karyawan : " + jumlahKaryawanRestauran);
        System.out.println("Gaji karyawan   : " + gajiKaryawanRestauran);
        System.out.println("Bonus           : " + Setoran.BONUS);
        System.out.println("========================================");
        totalGajiKaryawan = (jumlahKaryawanRestauran * gajiKaryawanRestauran)
                + (jumlahKaryawanRestauran * Setoran.BONUS);
        System.out.println("Total gaji Karyawan : " + totalGajiKaryawan);
        System.out.println("=============next===========\n\n");

    }

    @Override
    public void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        jumlahKaryawanRestauran = jumlahKaryawan;
        gajiKaryawanRestauran = gajiKaryawan;
        jumlahHariBukaRestoran = jumlahHariBuka;

        System.out.println("Persiapan .... Restoran");
        System.out.println("Data Karyawan   : " + jumlahKaryawan);
        System.out.println("Gaji Karyawan   : " + gajiKaryawan);
    }

}
