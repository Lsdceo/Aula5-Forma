package Aplicacao;

import java.util.Scanner;

import Entidade.Forma;
import Entidade.Retangulo;
import Entidade.Triangulo;

public class Main2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma forma para calcular");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Triângulo");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = x.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a largura: ");
                    int largura = x.nextInt();

                    System.out.print("Digite a altura: ");
                    int altura = x.nextInt();

                    Retangulo calcularArea = new Retangulo(largura, altura);
                    System.out.println("A área do Retângulo é " + calcularArea.calcularArea());
                    break;
                case 2:
                    System.out.print("Digite a base: ");
                    int base = x.nextInt();

                    System.out.print("Digite a altura: ");
                    int altura2 = x.nextInt();

                    Triangulo triangulo = new Triangulo(base, altura2);
                    System.out.println("A área do Triângulo é " + triangulo.calcularArea());
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }
    }
}