package com.company.comecando;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos quilos de peixe que foi adquirido ? ");
        double kilosDaPesca = scanner.nextDouble();
        int pesoMaximo = 50;
        int valorDeMulta = 4;
        double multa = (kilosDaPesca - pesoMaximo) * valorDeMulta;
        System.out.print("O valor total da sua multa é R$:" + multa );
        scanner.close();
    }
}
