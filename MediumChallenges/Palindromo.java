package dio;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        System.out.println(checagemPalindromo(palavra));
        sc.close();
    }

    public static String checagemPalindromo(String palavra){
        String[] array = palavra.split("");
        int contador = palavra.length()-1;
        String inverso = "";
        
        while(contador>=0) {
        	inverso+= array[contador];
        	contador--;
        }
        
        if(inverso.equalsIgnoreCase(palavra))
        	return "TRUE";
        else
        	return "FALSE";
    }
}