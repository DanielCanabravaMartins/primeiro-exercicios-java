package edu.daniel.segundoxercicio;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if (mediaFinal < 6)
            System.out.print("Reprovado");
        else if (mediaFinal == 6)
            System.out.print ("Prova de Minerva");
        else
            System.out.print ("Aprovado");
    }
}
