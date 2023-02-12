public class ExercicioControle {

    public static void main(String[] args) {
        mes(args);
        ferias(args);
    }

    public static void mes (String[] args) {
        int mes = 9; 
        if (mes == 1){
        System.out.println("Janeiro");}
        else if (mes == 2){
        System.out.println("Fevereiro");}
        else if (mes == 3){
        System.out.println("Março");}
        else if (mes == 4){
        System.out.println("Abril");}
        else if (mes == 5){
        System.out.println("Maio");}
        else if (mes == 6){
        System.out.println("Junho");}
        else if (mes == 7){
        System.out.println("Julho");}
        else if (mes == 8){
        System.out.println("Agosto");}
        else if (mes == 9){
        System.out.println("Setembro");}
        else if (mes == 10){
        System.out.println("Outubro");}
        else if (mes == 11){
        System.out.println("Novembro");}
        else if (mes == 12){
        System.out.println("Dezembro");}
        else {
            System.out.print("Mes indefinido");
        }
    }
    public static void ferias (String[] args) {
        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "julho":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Sem ferias");
                break;
                
        }
    }
}
