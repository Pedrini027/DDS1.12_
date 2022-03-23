package com.company.comecando;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Infome a Base do Quadrado: ");
        Double base = scanner.nextDouble();
        System.out.print("Infome a Altura do Quadrado: ");
        Double altura = scanner.nextDouble();
        Double area = base * altura;
        Double dobroDaArea = area * 2;
        System.out.println("O Dobro da Area informada é:" + dobroDaArea);
        scanner.close();
    }
}
