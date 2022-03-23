package com.company.comecando;


import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você recebe por hora trabalhada: ");
        double salarioHora = scanner.nextDouble();
        System.out.print("Quantas horas você trabalha no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        double salarioBruto = (salarioHora * horasTrabalhadas);
        double  descontoInpostoDeRenda = 0.11;
        Double impostoDeRenda = (salarioBruto * descontoInpostoDeRenda);
        double descontoInss = 0.08 ;
        Double inss = (salarioBruto * descontoInss);
        double descontoSindicato = 0.05;
        Double sindicado = (salarioBruto * descontoSindicato);
        Double salarioLiquido = salarioBruto - sindicado - impostoDeRenda - inss;
        System.out.println("Seu salário Liquido será de: " + salarioLiquido);
        scanner.close();





    }
    }





