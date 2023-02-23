import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuda do número: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada );
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "X" + i + "=" + (tabuada*i));
        }    
    }
}
    