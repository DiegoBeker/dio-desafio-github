import java.util.*;

public class DesafioMap {
    public static void main(String[] args) {
        final int JOGADAS = 100;
        int contadorUm = 0;
        int contadorDois = 0;
        int contadorTres = 0;
        int contadorQuatro = 0;
        int contadorCinco = 0;
        int contadorSeis = 0;
        Map<String, Integer> lancamentos = new LinkedHashMap<>();
        Random rand = new Random();

        for (int i = 0; i < JOGADAS; i++) {
            Integer number = rand.nextInt(1, 6 + 1);
            lancamentos.put("Jogada " + (i + 1), number);
            //System.out.println(number);
        }

        Set<Map.Entry<String, Integer>> entries = lancamentos.entrySet();
        //System.out.println(entries);

        for (Map.Entry<String, Integer> entry : entries) {
            switch (entry.getValue()) {
                case 1 -> contadorUm++;
                case 2 -> contadorDois++;
                case 3 -> contadorTres++;
                case 4 -> contadorQuatro++;
                case 5 -> contadorCinco++;
                case 6 -> contadorSeis++;
            }
        }

        System.out.println("Quantidade de resultados:");
        System.out.println("1 = " + contadorUm + " vezes");
        System.out.println("2 = " + contadorDois + " vezes");
        System.out.println("3 = " + contadorTres + " vezes");
        System.out.println("4 = " + contadorQuatro + " vezes");
        System.out.println("5 = " + contadorCinco + " vezes");
        System.out.println("6 = " + contadorSeis + " vezes");
    }
}
