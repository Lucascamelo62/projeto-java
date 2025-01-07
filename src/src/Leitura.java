import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme preferido:");
        String nomeFilme = sc.nextLine();
        System.out.println("Digite o ano de lançamento do filme:");
        int anoLancamento = sc.nextInt();
        System.out.println("Informe a avaliação do filme");
        double avaliacao = sc.nextDouble();

        System.out.println(String.format("Informações gerais do filme: \nNome: %s \nAno de Lançamento: %d\nAvaliação: %.2f", nomeFilme, anoLancamento, avaliacao));
    }
}
