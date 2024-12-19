//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screen Match");

        String filme = "Top GUN - Mavericks";
        int anoLancamento = 2022;
        boolean inclusoLista = true;
        String sinopse = """
                Filme mediano
                Longa Duração
                Aclamado pelos cinemas americanos
                """;
        //Calculo da média
        double media = (7 + 8 + 10)/3;

        if (inclusoLista) {
            System.out.println("Nome do filme: " + filme + "\n" + "Ano de Lançamento" + anoLancamento + "\n" + sinopse + "\n" + "Média:" + media);
        } else {
            System.out.println("Nenhum filme disponível na lista");
        }

    }
}

