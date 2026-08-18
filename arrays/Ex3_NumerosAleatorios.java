package estudos.Izequiel.repeticaoArrays.arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores
 */

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numeros : numerosAleatorios) {
            System.out.print(numeros + " ");
        }

        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for (int numeros : numerosAleatorios) {
            System.out.print((numeros + 1) + " ");
        }


    }
}
