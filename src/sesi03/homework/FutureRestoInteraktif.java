/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi03.homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author HERIADIE
 */
public class FutureRestoInteraktif {

    String lokasiaudio = "D:/audio/";

    public static void main(String[] args) {
        FutureRestoInteraktif latihan2 = new FutureRestoInteraktif();

        System.out.println("==============");

        System.out.println("Selamat Datang ke Sistem Informasi Future Resto");
        latihan2.play("selamat datang");

        System.out.println("Silahkan Login");
        latihan2.play("login");

        Scanner bacaKey = new Scanner(System.in);
        System.out.print(" -username: ");
        String userName = bacaKey.nextLine();
        System.out.print(" -password: ");
        String password = bacaKey.nextLine();
        boolean akses = latihan2.terimaInputLogin(userName, password);

        if (akses) {

            System.out.println("Login Berhasil");
            latihan2.play("sukses");

            System.out.println("Menu Utama");
            latihan2.play("menuutama");

        } else {

            System.out.println("Maaf username dan password anda salah");
            latihan2.play("salah");

            System.out.println("System Exit");
            latihan2.play("exit");
        }
    }

    public void play(String namaAudio) {
        String fileSound = "";
        switch (namaAudio) {
            case "selamat datang":
                fileSound = "selamat-datang.wav";
                break;
            case "login":
                fileSound = "silahkan-login.wav";
                break;
            case "sukses":
                fileSound = "login-berhasil.wav";
                break;
            case "menuutama":
                fileSound = "menu-utama.wav";
                break;
            case "salah":
                fileSound = "maaf-username-password-anda-salah.wav";
                break;
            case "exit":
                fileSound = "system-exit.wav";
                break;
            default:
                break;
        }

        File audioFile = new File(lokasiaudio + fileSound);
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            try {
                try (Clip audioClip = (Clip) AudioSystem.getLine(info)) {
                    audioClip.open(audioStream);
                    audioClip.start();
                    try {
                        Thread.sleep(3500);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    audioClip.close();
                }
            } catch (LineUnavailableException ex) {
                Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean terimaInputLogin(String nama, String sandi) {
        boolean check;
        if (nama.equals("admin") && sandi.equals("admin")) {
            check = true;
        } else {
            check = false;
        }
        return check;

    }
}
