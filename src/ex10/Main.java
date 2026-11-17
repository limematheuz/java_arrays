package ex10;

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

//static void main(String[] arg) {
//    float[] scores = {7.5f, 5.0f, 10.0f, };
//    for (int i = 0; i < scores.length - 1; i++) {
//        for (int j = i + 1; j < scores.length; j++) {
//            if (scores[i] < scores[j]) {
//                float cambio = scores[i];
//                scores[i] = scores[j];
//                scores[j] = cambio;
//            }
//        }
//    }
//    System.out.println("El array ordenado es: ");
//    for (int i = 0; i < scores.length; i++) {
//        System.out.print(scores[i] + " ");
//    }
//    System.out.println();
//}
