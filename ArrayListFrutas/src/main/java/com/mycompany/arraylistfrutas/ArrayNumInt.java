/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistfrutas;

/**
 *
 * @author ikaro
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumInt {
    
  

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(60);
        numeros.add(3);
        numeros.add(50);
        numeros.add(5);
        numeros.add(6);
        numeros.add(25);
        numeros.add(7);
        numeros.add(9);
        numeros.add(10);
        numeros.add(-1);
        numeros.add(8);
        numeros.add(4);

        
        Collections.sort(numeros);

        
        System.out.println("Lista de números ordenada: " + numeros);
        
        
         // quantos números são pares
        int quantidadePares = contarNumerosPares(numeros);

        
        System.out.println("Quantidade de números pares: " + quantidadePares);
    }

    
    public static int contarNumerosPares(ArrayList<Integer> numeros) {
        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }
        return count;
    
    }
}


    

