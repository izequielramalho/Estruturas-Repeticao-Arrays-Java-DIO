package estudos.Izequiel.repeticaoArrays;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10
O usuário deve informar de qual número ele deseja ver na tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a tabuada desejada: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

    }
}
