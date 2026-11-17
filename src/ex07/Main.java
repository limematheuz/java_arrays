package ex07;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arrayNumeros = new int[5];
        int contador = 0;
        int consulta = 0;

        for(int i = 0; i < arrayNumeros.length; i++ ){
            System.out.println("Introduce un numero: ");
            arrayNumeros[i] = sc.nextInt();
        }

        System.out.println("Escribe un numero para buscarlo: ");
        consulta = sc.nextInt();

        for (int i = 0; i < arrayNumeros.length; i++){
            if(consulta == arrayNumeros[i]){
                contador ++;
                System.out.println("| Indice: " + "| " + i + " |" );
                System.out.println("----------------");
            }
            if(contador == 0){
                System.out.println("---------------------");
                System.out.println("Ninguna coincidencia!");
                break;
            }
        }
        System.out.println("Total de apariciones: " + contador);

    }
}
