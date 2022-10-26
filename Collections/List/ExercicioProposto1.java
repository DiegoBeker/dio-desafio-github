import java.util.ArrayList;
import java.util.List;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<Double>();
        temperaturas.add(26.2);//Janeiro
        temperaturas.add(25.1);//Fevereiro
        temperaturas.add(24.5);//Marco
        temperaturas.add(24.2);//Abril
        temperaturas.add(23.2);//Maio
        temperaturas.add(20.1);//Junho

        Double soma = 0.0;

        for(Double d:temperaturas)
            soma+=d;
        Double media = soma/temperaturas.size();
        System.out.println("A media semestral das temperaturas: "+ media);
        System.out.println("Meses que a temperatura esta acima da media:");
        for(Double d:temperaturas){
            if(d>media){
                switch (temperaturas.indexOf(d)) {
                    case 0 -> System.out.println("1 - Janeiro");
                    case 1 -> System.out.println("2 - Fevereiro");
                    case 2 -> System.out.println("3 - Marco");
                    case 3 -> System.out.println("4 - Abril");
                    case 4 -> System.out.println("5 - Maio");
                    case 5 -> System.out.println("6 - Junho");
                }
            }
        }


    }
}
