package ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int[] arrayNumeros = new int[5];

        for(int i = 0; i < arrayNumeros.length; i++ ){
            System.out.println("Introduce un numero: ");
            arrayNumeros[i] = sc.nextInt();
        }
    }
}

//
//8. Modificar una casella amb un índex vàlid
//Objectiu: comprovar els límits abans d'accedir a una casella.
//
//Llegeix 5 enters en un array de 5 caselles. Demana l'índex de la casella que es vol modificar. Si és menor que 0 o més gran o igual que la longitud, mostra Índex no vàlid i torna a demanar-lo fins que sigui correcte. Només llavors demana el nou valor, modifica aquella casella i mostra l'array complet.
//
//Exemple
//
//Array inicial: [10, 20, 30, 40, 50].
//Índexs introduïts successivament: -1, 5, 2.
//Els dos primers es rebutgen. Per a l'índex 2, s'introdueix el nou valor 99.
//Array final: [10, 20, 99, 40, 50].