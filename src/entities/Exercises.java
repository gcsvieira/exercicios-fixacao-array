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

    public void peopleHeight() {
        double avgHeight = 0.00;
        int personLowerThan16 = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        lengthArray = Integer.parseInt(scan.nextLine());

        Person[] person = new Person[lengthArray];

        for (int i = 0; i < person.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = scan.nextLine();
            System.out.print("Idade: ");
            int age = Integer.parseInt(scan.nextLine());
            System.out.print("Altura: ");
            double height = Double.parseDouble(scan.nextLine());

            person[i] = new Person(name, age, height);
            avgHeight += person[i].getHeight();

            if (person[i].getAge() < 16)
                personLowerThan16 += 1;

        }

        System.out.printf("Altura média: %.2f%n", (avgHeight / person.length));
        System.out.printf("Pessoas com menos de 16 anos: %.0f porcento %n",
                (((double) personLowerThan16 / (double) person.length) * 100));

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() < 16)
                System.out.println(person[i].getName());
        }

        scan.close();
    }
}