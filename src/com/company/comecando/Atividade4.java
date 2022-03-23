package com.company.comecando;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informa a primeira nota do bimestre: ");
        Double primeiraNota = scanner.nextDouble();
        System.out.print("Informa a segunda nota do bimestre: ");
        Double segundaNota = scanner.nextDouble();
        System.out.print("Informa a terceira nota do bimestre: ");
        Double terceiraNota = scanner.nextDouble();
        System.out.print("Informa a quarta nota do bimestre: ");
        Double quartaNota = scanner.nextDouble();
        Double somaDasNotas = primeiraNota + segundaNota + terceiraNota + quartaNota;
        Integer divisor = 4;
        double media = somaDasNotas / divisor;
        System.out.println("Sua Média é: " + media);
        scanner.close();

    }
}
