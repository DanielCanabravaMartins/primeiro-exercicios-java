import javax.print.attribute.standard.MediaSizeName;

public class Main {
    public static void main(String[] args) {
        // Calculadora
        Calculadora.soma(3, 6);
        Calculadora.subtracao(3, 6);
        Calculadora.multiplicacao(3, 6);
        Calculadora.divisao(3, 6);
        // Hora do dia
        Hora.mensagem(9);
        Hora.mensagem(17);
        Hora.mensagem(1);
        Hora.mensagem(33);
        // Emprestimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
