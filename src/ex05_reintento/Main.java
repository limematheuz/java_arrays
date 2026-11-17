package ex05_reintento;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[7];

        System.out.println("--VAMOS A ESCOGER EL MAYOR Y MENOR--");

        for(int i = 0; i < numero.length; i++){
            System.out.println("introduce un numero: ");
            numero[i] = sc.nextInt();
        }

        double max = numero[0];
        double min = numero[0];

        for(int i = 1; i < numero.length; i++){
            if(numero[i] > max){
                max = numero[i];
            }
            if(numero[i] < min){
                min = numero[i];
            }
        }
        System.out.println("el maximo es: " + max);
        System.out.println("el minimo es: " + min);

    }
}
