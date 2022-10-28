package entities;

import java.util.Scanner;

public class Exercises {
    Scanner scan = new Scanner(System.in);
    int lengthArray;

    public void negativeNumbers() {
        do {
            System.out.print("Quantos números você vai digitar? (Máximo: 10) ");
            lengthArray = Integer.parseInt(scan.nextLine());
            System.out.println();

            if (lengthArray > 10)
                System.out.println("Número maior que 10! Por gentileza, tente novamente.\n");

        } while (lengthArray > 10);

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

}
