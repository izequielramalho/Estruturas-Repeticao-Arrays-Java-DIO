package estudos.Izequiel.repeticaoArrays;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;  // guarda o maior número encontrado
        int soma = 0;   // acumula a soma de todos os números
        int count = 0;  // conta quantos números foram digitados

        // do while → executa pelo menos uma vez antes de verificar
        do {
            System.out.println("Número: ");
            numero = scanner.nextInt(); // lê o número digitado

            soma = soma + numero; // adiciona o número à soma total

            // se o número digitado for maior que o atual maior
            // substitui o maior pelo número digitado
            if (numero > maior)
                maior = numero;

            count++; // adiciona 1 ao contador a cada volta
        } while (count < 5); // repete enquanto não chegou em 5

        // exibe os resultados após os 5 números
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / 5)); // soma dividida por 5
    }
}