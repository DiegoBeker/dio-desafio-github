import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> respostas= new ArrayList<>();

        System.out.println("Telefonou para a vitima? s/n");
        String c = s.next();
        respostas.add(c);
        System.out.println("Esteve no local do crime? s/n");
        c = s.next();
        respostas.add(c);
        System.out.println("Mora perto da vitima? s/n");
        c = s.next();
        respostas.add(c);
        System.out.println("Devia para a vitima? s/n");
        c = s.next();
        respostas.add(c);
        System.out.println("Ja trabalhou com a vitima? s/n");
        c = s.next();
        respostas.add(c);
        int cont = 0;
        for (String r : respostas) {
            if(r.equals("s"))
                cont++;
        }

        if(cont == 5)
            System.out.println("Assassina");
        if(cont == 3 || cont == 4)
            System.out.println("Cumplice");
        if(cont == 2)
            System.out.println("Suspeita");
        if(cont == 1||cont == 0)
            System.out.println("Inocente");
    }
}