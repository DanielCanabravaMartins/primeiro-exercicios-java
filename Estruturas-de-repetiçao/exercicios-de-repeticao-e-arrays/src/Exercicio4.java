import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    int quantNumeros;
    int numero;
    int quantPares = 0, quantImpares = 0; 
    System.out.println("Quantidade de números: ");
    quantNumeros =scan.nextInt();
    int count = 0;

    do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
            count++;
        } while (count < quantNumeros);
    
        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Impares: " + quantImpares);
    }

}
