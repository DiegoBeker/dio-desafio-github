import java.util.*;

public class ChamadaRecursiva {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int resultado = somatorio(numero);
        System.out.println(resultado);

    }


    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}