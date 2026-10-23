package ex03;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultado = new int[5];

        for (int i = 0; i < a.length; i++){
            System.out.println("Introduce un numerooooo: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++){
            System.out.println("Introduce un numero para sumarlo con el anterior: ");
            b[i] = sc.nextInt();
        }


        for (int i = 0; i < resultado.length; i ++){
            resultado[i] = a[i] + b[i];
            System.out.println("El resultado es: " + resultado[i]);
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.println("a: " + a[i] + " b: " + b[i] + " resultado: " + resultado[i]);
        }
    }

}
