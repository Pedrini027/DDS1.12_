package com.company.comecando;

import java.util.Scanner;

public class Quadrado {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("DIgite seu numero");
        double numero =scanner.nextDouble();
        double numeroAoQuadrado = numero * numero;
        System.out.println("seu numero e: " + numeroAoQuadrado);
        scanner.close();
    }

}
