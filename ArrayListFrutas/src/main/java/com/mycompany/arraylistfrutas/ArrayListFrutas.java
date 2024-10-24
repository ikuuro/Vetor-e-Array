/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistfrutas;

/**
 *
 * @author ikaro
 */
import java.util.ArrayList;

public class ArrayListFrutas{
        
    public static void main(String[] args) {
        
        ArrayList<String> frutas = new ArrayList<>();

        
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Uva");

        
        
         // listando as frutas
        System.out.println("Lista de frutas: " + frutas);
        
        
        // removendo a terceira fruta, índice 2, contagem começa do zero)
        frutas.remove(2);

       
        System.out.println("Lista de frutas após remoção: " + frutas);


       
        String frutaParaBuscar = "Banana";
        
        
        boolean encontrada = buscarFruta(frutas, frutaParaBuscar);

        if (encontrada) {
            System.out.println(frutaParaBuscar + " está na lista.");
        } else {
            System.out.println(frutaParaBuscar + " não etsa na lista.");
        }
    }

    // método para buscar uma fruta no ArrayList
    public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }
}

