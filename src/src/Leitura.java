import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double mediaNotas = 0;

        System.out.println("Digite o nome do seu filme preferido:");
        String nomeFilme = sc.nextLine();
        System.out.println("Digite o ano de lançamento do filme:");
        int anoLancamento = sc.nextInt();
        System.out.println("Digite as 3 melhores notas para o filme");
        for (int i = 1; i < 4; i++) {
            System.out.printf(String.format("Nota %d: ", i));
            nota = sc.nextDouble();
            mediaNotas += nota;
        }
        System.out.println(String.format("Informações gerais do filme: \nNome: %s \nAno de Lançamento: %d\nAvaliação: %.2f", nomeFilme, anoLancamento, (mediaNotas / 3)));

        sc.close();
    }
}
