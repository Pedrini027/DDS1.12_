package com.company.comecando;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        Double umnumero = scanner.nextDouble();
        System.out.print("informe outro numero: ");
        Double outroNumero = scanner.nextDouble();
        Double aSomadosNumerose = umnumero + outroNumero;
        System.out.println("A Soma dos Numeros é: " + aSomadosNumerose);
        scanner.close();
    }
}
