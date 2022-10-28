package entities;

import java.util.Scanner;

public class Exercises {
    Scanner scan = new Scanner(System.in);
    int lengthArray;

    public void negativeNumbers() {

        do {
            System.out.print("Quantos números você vai digitar? (Máximo: 10, número não pode ser negativo) ");
            lengthArray = Integer.parseInt(scan.nextLine());
            System.out.println();

            if (lengthArray > 10 || lengthArray <= 0)
                System.out.println("Número inválido! Por gentileza, tente novamente.\n");

        } while (lengthArray > 10 || lengthArray <= 0);

        int[] arrayNumbers = new int[lengthArray];

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print("Digite um número: ");
            arrayNumbers[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Números negativos:");

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 0)
                System.out.println(arrayNumbers[i]);
        }

        scan.close();
    }

    public void sumVectors() {
        double[] arrayNumbers;
        double sumNumbers = 0.00;
        double avgNumbers = 0.00;

        do {
            System.out.print("Quantos números você vai digitar? (Máximo: 10, não pode ser negativo) ");
            lengthArray = Integer.parseInt(scan.nextLine());

            if (lengthArray > 10 || lengthArray <= 0)
                System.out.println("Número inválido! Por gentileza, tente novamente.\n");
        } while (lengthArray > 10 || lengthArray <= 0);

        arrayNumbers = new double[lengthArray];

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print("Digite um número: ");
            arrayNumbers[i] = Double.parseDouble(scan.nextLine());
            sumNumbers += arrayNumbers[i];
        }
        avgNumbers = sumNumbers / arrayNumbers.length;

        System.out.print("Valores:");
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(" " + arrayNumbers[i]);
        }
        System.out.println("\n");
        System.out.println("Soma: " + sumNumbers);
        System.out.println("Média: " + avgNumbers);
        System.out.println();

        scan.close();
    }

}
