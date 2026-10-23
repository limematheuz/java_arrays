package ex02;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dades = new int[5];

        for(int i = 0; i < dades.length; i++){
            System.out.println("Introduce un numero: ");
            dades[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++){
            System.out.println(i + ":" + dades[i]);
        }

        for (int i = dades.length;  ; i--){

        }
    }
}

//float[] scores = {7.5f, 5.0f, 10.0f, };
//        for (int i = 0; i < scores.length - 1; i++) {
//        for (int j = i + 1; j < scores.length; j++) {
//        if (scores[i] < scores[j]) {
//float cambio = scores[i];
//scores[i] = scores[j];
//scores[j] = cambio;
//                }
//                        }
//                        }


//Pseudocodi	Significat o equivalent en Java
//DEFINIR dades COM ARRAY DE 5 ENTERS	int[] dades = new int[5];
//LLEGIR dades[i]	dades[i] = lector.nextInt();
//ESCRIURE dades[i]	System.out.println(dades[i]);
//suma ← 0	int suma = 0; si es declara aquí
//suma ← suma + dades[i]	suma = suma + dades[i];
//PER i DES DE 0 FINS A 4 ... FI_PER	for (int i = 0; i < dades.length; i++) { ... } per a aquest array
//SI condició ... SINÓ ... FI_SI	if (condició) { ... } else { ... }
//MENTRE condició ... FI_MENTRE	while (condició) { ... }
