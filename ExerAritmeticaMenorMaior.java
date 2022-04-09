package digitalone.aula3.java.programar;

import java.util.Scanner;

public class ExerAritmeticaMenorMaior {

    public static void main (String [] args)
    {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;
        int soma;
        int media;
        int produto;

        System.out.print("Digite o primeiro número: ");
        number1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        number2 = input.nextInt();
        System.out.print("Digite o Terceiro número: ");
        number3 = input.nextInt();

        soma = number1 + number2 + number3;

        media = soma / 3;

        produto = number1 * number2 * number3;

        System.out.printf("A soma é: %d%n", soma);
        System.out.printf("A média é: %d%n", media);
        System.out.printf("O produto é: %d%n", produto);


        if (number1 > number2 && number1 > number3)
            System.out.printf("%d > %d > %d%n", number1, number2, number3);
        if (number2 > number1 && number2 > number3)
            System.out.printf("%d > %d > %d%n", number2, number1, number3);
        if (number3 > number1 && number3 > number2)
            System.out.printf("%d > %d > %d%n", number3, number1, number2);



    }
}
