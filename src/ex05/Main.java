package ex05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[7];

        // 1. Leer los 7 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        // 2. Inicializar máximo, mínimo e índices
        int max = numeros[0];
        int min = numeros[0];


        // 3. Recorrer el array y buscar los extremos
        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > max) {
                max = numeros[i];
            }

            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        // 4. Mostrar los resultados
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
    }
}
