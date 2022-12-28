package dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialDesajeitado {
	public static void main(String args[]) {

		// TODO: Cálculo do valor do Fatorial Desajeitado de "numero".

		int n = new Scanner(System.in).nextInt();
		int temp = 0;
		int res = 0;

		List<Integer> listaResultados = new ArrayList<>();

		while (n >= 3) {
			temp = n * (n - 1) / (n - 2); // Calculo da multiplicacao/divisao devido a prioridade de operacao
			n -= 3; // ex: 10 * 9 / 8

			if (listaResultados.isEmpty()) {
				listaResultados.add(temp); // Se a lista estiver vazia adiciona o valor temporário positivo
			} else {
				listaResultados.add(temp * (-1)); // Se lista nao estiver vazia adiciona o valor temporario negativo para
													// ser somado a
			} // lista no final devido a operacao "-"

			listaResultados.add(n); // Adiciona o numero na lista devido a operacao "+"
			n--;
		}

		if (n == 2) { // Não tem um ciclo de operacoes completos portanto a parte restante é n * n-1
						// Ex: 2 * 1
			temp = n * (n - 1);
			listaResultados.add(temp * (-1)); // Adiciona o valor na lita de resultados
		} else if (n == 1) {
			listaResultados.add(n * (-1));
		}

		for (int num : listaResultados) {
			//System.out.print(num + " ");
			res += num;
		}

		System.out.println(res);
	}
}
