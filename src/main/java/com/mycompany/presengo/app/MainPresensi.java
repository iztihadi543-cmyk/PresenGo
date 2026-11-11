/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presengo.app;
import java.util.Scanner;
import com.mycompany.presengo.model.Mahasiswa;

/**
 *
 * @author Iztihadi
 */
public class MainPresensi {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PRESENGO ===");

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

        int pilihan = 0;

        while (pilihan != 3) {

            System.out.println("\n=== MENU PRESENSI ===");
            System.out.println("1. Presensi");
            System.out.println("2. Lihat Identitas");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan status (1 = Hadir, 0 = Tidak Hadir): ");
                    int status = input.nextInt();

                    if (status == 1) {
                        System.out.println("Status: HADIR");
                    } else if (status == 0) {
                        System.out.println("Status: TIDAK HADIR");
                    } else {
                        System.out.println("Status tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("Nama: " + mahasiswa.getNama());
                    System.out.println("NIM: " + mahasiswa.getNim());
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan PresenGo.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }

        input.close();
    }
     
     
}
