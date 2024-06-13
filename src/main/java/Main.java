import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, somaPar = 0, somaImpar = 0;

        System.out.println("Digite um número positivo (digite um número negativo para encerrar):");
        numero = sc.nextInt();

        while(numero >= 0) {
            if(numero % 2 == 0) {
                System.out.println(numero + " é par");
                somaPar += numero;
            } else {
                System.out.println(numero + " é ímpar");
                somaImpar += numero;
            }

            System.out.println("Digite um número positivo (digite um número negativo para encerrar):");
            numero = sc.nextInt();
        }

        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);

        sc.close();
    }
}