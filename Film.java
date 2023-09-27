/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author Sciro
 */


public class Film {
    // Properties
    public String judul;
    public String sutradara;
    public int tahunRilis;

    // Constructor
    public Film(String judul, String sutradara, int tahunRilis) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahunRilis = tahunRilis;
    }

    // Method
    public String getInfo() {
        return "judul " + judul + ", yang disutradarai oleh " + sutradara + ", dan dirilis tahun " + tahunRilis;
    }
}
    
 
