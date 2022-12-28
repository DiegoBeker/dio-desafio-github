package me.dio.inter.backend.desafio.intermediario;

import java.util.Arrays;
import java.util.Scanner;

public class SalvandoMusicas {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String[] arquivoSplit = arquivoDoPc.split("[.]");
        
        //System.out.println(Arrays.toString(arquivoSplit));
        
        if(arquivoSplit[arquivoSplit.length - 1].equalsIgnoreCase("mp3"))
        	System.out.println("Salvar");
        else
        	System.out.println("Deletar");
        
        leitor.close();
	}
}
