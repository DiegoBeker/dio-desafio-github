import java.util.*;

public class ExercicioMap1 {
    public static void main(String[] args) {
        System.out.println("---Crie um dicionario e relacione os estados e suas populacoes");

        Map<String,Integer> estados = new HashMap<String,Integer>();
        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);
        System.out.println(estados.toString());

        System.out.println("---Substitua a populacao do estado do RN por 3.534.165");
        estados.put("RN", 3534165);
        System.out.println(estados.toString());

        System.out.println("---Confira se o estado PB está no dicionario, caso nao adicione: PB = 4.039.277");
        if (!estados.containsKey("PB")) estados.put("PB", 4039277);
        System.out.println(estados.toString());

        System.out.println("---Exiba a população PE:\n " + estados.get("PE"));

        System.out.println("---Exiba todos os estados e suas populacoes na ordem que foi informado");
        Map<String, Integer> estados1 = new LinkedHashMap<String, Integer>();
        estados1.put("PE", 9616621);
        estados1.put("AL", 3351543);
        estados1.put("CE", 9187103);
        estados1.put("RN", 3534265);
        estados1.put("PB", 4039277);
        System.out.println(estados1.toString());

        System.out.println("---Exiba os estados e suas populacoes em ordem alfabetica");
        Map<String,Integer> estados2 = new TreeMap<>(estados1);
        System.out.println(estados2.toString());

        System.out.println("---Exiba o estado com o menor populacao e sua quantidade");
        int menorPopulacao = Collections.min(estados2.values());
        Set<Map.Entry<String, Integer>> siglas = estados2.entrySet();
        String estadoMenosPopuloso = "";

        for (Map.Entry<String, Integer> entry : siglas) {
            if(entry.getValue().equals(menorPopulacao)) {
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado: " + estadoMenosPopuloso + " Populacao: " + menorPopulacao);
            }
        }

        System.out.println("---Exiba o estado com o maior populacao e sua quantidade");
        int maiorPopulacao = Collections.max(estados2.values());
        String estadoMaisPopuloso = "";

        for (Map.Entry<String, Integer> entry : siglas) {
            if(entry.getValue().equals(maiorPopulacao)) {
                estadoMaisPopuloso = entry.getKey();
                System.out.println("Estado: " + estadoMaisPopuloso + " Populacao: " + maiorPopulacao);
            }
        }

        System.out.println("---Exiba a soma da populacao desses estados");
        Integer soma = 0;
        Iterator<Integer> iterator = estados2.values().iterator();

        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Soma: " + soma);

        System.out.println("---Exiba a media da populacao deste dicionario de estados");
        System.out.println("Media: " + soma/estados2.size());

        System.out.println("---Remova os estados com populacao menor que 4.000.000");


        Iterator<Integer> iterator1 = estados2.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() <= 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estados2.toString());

        System.out.println("---Apague o dicionario de estados");
        estados2.clear();

        System.out.println("---Confira se o dicionario esta vazio\n" + estados2.isEmpty());

    }
}
