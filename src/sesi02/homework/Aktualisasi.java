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
public class Aktualisasi {

    public static void main(String[] args) {
        Restaurant resto1 = new Restaurant();
        resto1.setLokasi("Jl. Merpati no.99");
        resto1.prepare(10, 500, 5);
        resto1.printoutSummary();

        Restaurant resto2 = new Restaurant();
        resto2.setLokasi("Jl. Mawar Merah no.23");
        resto2.prepare(15, 500, 5);
        resto2.printoutSummary();

        StandPameran stand1 = new StandPameran();
        stand1.setLokasi("Plaza Mall");
        stand1.prepare(3, 300, 2);
        stand1.printoutSummary();

    }
}
