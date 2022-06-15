package Desafio_Math;
import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.Math.round;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe os números de jogos do Bolão: ");
        double bolao = scanner.nextDouble();
       for(int i = 0; i < (bolao); i++) {
           double numero1 = random() * 60;
           System.out.print(round(numero1) + " ");
           double numero2 = random() * 60;
           System.out.print(round(numero2) + " ");
           double numero3 = random() * 60;
           System.out.print(round(numero3) + " ");
           double numero4 = random() * 60;
           System.out.print(round(numero4) + " ");
           double numero5 = random() * 60;
           System.out.print(round(numero5) + " ");
           double numero6 = random() * 60;
           System.out.print(round(numero6) + "\n ");
           System.out.println("--------------------");
       }
    }
}
