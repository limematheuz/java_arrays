package arrays_2D;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        String[][] grades = {
                {"Angles", "Empty", "WEB Design", "IPO", "PROG"},
                {"Angles", "BBDD", "WEB Design", "IPO", "PROG"},
                {"BBDD", "BBDD", "Sistemes", "IPO", "PROG"},
                {"BBDD", "PROG", "Sistemes", "WEB_D", "PROG"},
                {"PROG", "PROG", "Sistemes", "WEB_D", "PROG"},
                {"PROG", "Empty", "Empty", "WEB_D", "PROG"},
        };

//        String[] alumnos = {}

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) 
                System.out.println("Tu horario: " + grades[i][j]);
            }
        }
    }

