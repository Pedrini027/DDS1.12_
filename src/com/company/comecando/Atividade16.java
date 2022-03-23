package com.company.comecando;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos metros quadrados possui o terreno: ");
        double metrosQuadrados = scanner.nextDouble();
        int litroTintaUsado = 3;
        double areaPintada = metrosQuadrados / litroTintaUsado;
        double totalDeTintaUsada = areaPintada;
        double valorLitroDeTinta = 4.44;
        double custoToral = totalDeTintaUsada * valorLitroDeTinta;
        System.out.print("O custo total será de R$: " +  custoToral);
        scanner.close();
    }
}
