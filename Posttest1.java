/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author Sciro
 */


import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        ArrayList<Film> films = new ArrayList<>();

        // Menambahkan beberapa objek film ke dalam ArrayList
        films.add(new Film("Ford v Ferrari", "James Mangold", 2019));
        films.add(new Film("Rush", "Ron Howard", 2013));
        films.add(new Film("Spider-Man: Across the Spider-Verse", "Joaquim Dos Santos", 2023));
        films.add(new Film("Guardians of the Galaxy Vol. 3", "James Gunn", 2023));
        films.add(new Film("Pacific Rim", "Guillermo del Toro", 2013));

        // Melakukan perulangan untuk menampilkan informasi film
        for (Film film : films) {
            System.out.println("Film ini ber" + film.getInfo());
        }
    }
}



