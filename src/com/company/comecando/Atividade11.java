package com.company.comecando;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um Numero Inteiro: ");
        Double um = scanner.nextDouble();

        System.out.print("Digite outro Numero inteiro: ");
        Double outro = scanner.nextDouble();

        System.out.print("Digite um Numero Real:");
        Double real = scanner.nextDouble();

        Double a = (um*2) + (outro/2);
        System.out.println("Letra a:" + a);

        Double b = (um*3) + real;
        System.out.println("Letra b:" + b);

        Double c = real*real*real;
        System.out.println("Letra c:" + c);
        scanner.close();
    }
}
