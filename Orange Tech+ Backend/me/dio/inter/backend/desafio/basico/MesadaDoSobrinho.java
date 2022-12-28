package me.dio.inter.backend.desafio.basico;

import java.util.Scanner;

public class MesadaDoSobrinho {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        System.out.println(mesada*entrada);
        
        leitor.close();
	}

}
