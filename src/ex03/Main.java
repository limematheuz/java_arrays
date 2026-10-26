package ex03;


import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[5];
        double suma = 0.0;

        for(int i = 0; i < arrayNum.length; i++){
            System.out.println("Introduce un numero: ");
            arrayNum[i] = sc.nextInt();
        }

//        double acumulador = 0.0;

        for(int i = 0; i < arrayNum.length; i++){
            suma = suma + arrayNum[i];

//            acumulador = acumulador + i;
//            System.out.println("la suma acumulada es: " + acumulador);
        }

        System.out.println("la suma total es: " + suma);
//        double promedio = acumulador/ arrayNum.length;
        double promedio = suma/ arrayNum.length;
        System.out.println("EL promedio es: " + promedio );
     }


}
