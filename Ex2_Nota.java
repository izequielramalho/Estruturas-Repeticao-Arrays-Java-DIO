package estudos.Izequiel.repeticaoArrays;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até o usuário informe uma valor válido.
 */

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scanner.nextInt();
        }
        if (nota == 10) {
            System.out.println("Parabéns pela nota!");
        } else if (nota <= 4) {
            System.out.println("Sua nota está abaixo do esperado, estude mais.");
        } else if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        }
    }
}
