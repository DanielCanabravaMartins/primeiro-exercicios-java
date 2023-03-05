import java.util.Scanner;

public class Exercicio7 {
    //Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
    
        System.out.print("Escreva o primeiro número: ");
        int primeiro = scan.nextInt();
    
        System.out.print("Escreva o segundo número: ");
        int segundo = scan.nextInt();
    
        if (primeiro < segundo) {
          for (int i = primeiro+1; i < segundo; i++) {
            System.out.print(i + " ");
          }
        } else if (primeiro > segundo) {
          for (int i = primeiro-1; i > segundo; i--) {
            System.out.print(i + " ");
          }
          System.out.println();
        } 
      }
    }

