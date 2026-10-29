package ex06;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[5];
        int consulta = 0;

        for (int i = 0; i < numero.length; i++){
            System.out.println("Introduce un numero: ");
            numero[i] = sc.nextInt();
        }

        System.out.println("Escribe un numero para buscarlo: ");

        consulta = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numero.length; i++) {
            if (consulta == numero[i]) {
                System.out.println("buscar: " + consulta + "/ muestra en la posicion: " + numero[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El numero introducido no existe en el array: " + consulta);
        }


    }
}
