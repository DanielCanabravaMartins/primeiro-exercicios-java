import java.util.Scanner;

public class Exercicio2 {
    
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota invalida! Digite novamente");
            nota = scan.nextInt();

        }

    }
}

