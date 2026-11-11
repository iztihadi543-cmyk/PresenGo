/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presengo.model;

/**
 *
 * @author Iztihadi
 */
public class Mahasiswa extends Pengguna {

    // Constructor
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Method khusus mahasiswa
    public void tampilkanIdentitas() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}