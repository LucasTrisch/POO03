package Exerc02;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um nmero para saber o dobro:");
        double numero = ler.nextDouble();
    Calculadora minhaCalculadora = new Calculadora();
    double resultado = minhaCalculadora.calculaDobro(numero);
        System.out.println("O dobro é:" + resultado);
    }
}
