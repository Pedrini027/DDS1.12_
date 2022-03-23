package com.company.comecando;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        Double altura = scanner.nextDouble();

        Double pesoidealh = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é (Masculino): " + pesoidealh );

        Double pesoidealm = (62.1 * altura) - 44.7;
        System.out.println("Seu peso ideal é (Feminino): " + pesoidealm);
        scanner.close();
    }
}
