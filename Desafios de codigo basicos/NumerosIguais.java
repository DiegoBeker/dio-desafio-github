import java.util.*;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        if(numero1==numero2)
          System.out.println("Sao iguais!");
        else
          System.out.println("Nao sao iguais!");

    }
}