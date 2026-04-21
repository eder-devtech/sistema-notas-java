import java.util.ArrayList;

public class Notas {
    
    public static double media(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void verificacao(double resultado) {
        if (resultado >= 7.0) {
            System.out.println("Aprovado!");
        } else if (resultado >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static double maiorNota(double nota1, double nota2, double nota3) {
        return(Math.max(nota1, Math.max(nota2, nota3)));
    }

    public static double menorNota(double nota1, double nota2, double nota3) {
        return(Math.min(nota1, Math.min(nota2, nota3)));
    }
    public static void main(String[] args) {
        
        //Váriaveis para armazenar as notas
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(6.0);
        notas.add(7.0);
        notas.add(10.0);

        System.out.println(notas.get(0)); // 8.5
        System.out.println(notas.get(1)); // 7.0
        System.out.println(notas.get(2)); // 9.5

        //media das notas
        double resultado = media(notas.get(0), notas.get(1), notas.get(2));

        //Exibindo o resultado
        System.out.printf("A média das notas é: %.1f%n", resultado);

        //Verificação de aprovação
        verificacao(resultado);

        double maiorNota = maiorNota(notas.get(0), notas.get(1), notas.get(2));
        System.out.printf("A maior nota é: %.1f%n", maiorNota);

        double menorNota = menorNota(notas.get(0), notas.get(1), notas.get(2));
        System.out.printf("A menor nota é: %.1f%n", menorNota);
    }
}
