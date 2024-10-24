/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetordesoma;

/**
 *
 * @author ikaro
 */
import java.util.Scanner;
public class VetorDeSoma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Vetor para armazenar 10 números 
        int soma = 0;
        int maior, menor;

        
        System.out.println("Por favor, insira 10 valores inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; 
        }

       
        maior = menor = numeros[0];

        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        
        System.out.println("\nSoma dos valores: " + soma);

      
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        
        System.out.println("\nValores inseridos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor " + (i + 1) + ": " + numeros[i]);
            if (numeros[i] == maior) {
                System.out.print(" (Maior)");
            }
            if (numeros[i] == menor) {
                System.out.print(" (Menor)");
            }
            System.out.println();
        }

        scanner.close();
    }
}

