package dio;

import java.util.Scanner;

public class QuadradosPerfeitos {
	public static void main(String[] args) {
		int n = Integer.parseInt(new Scanner(System.in).nextLine());

		int[] d = new int[n + 1];
		int aux = 0;
		int menor = n;
		int resto = n;
		int soma = 0;

		for (int i = 0; i <= n; i++) {
			if (i * i <= n) {
				d[i] = i * i;
				// System.out.print(d[i] + " ");
			} else
				break;
			aux = i;
		}
		// System.out.println("");
		// System.out.println(aux);
		int cont = 0;

		for (int j = aux; j >= 1; j--) {
			// System.out.println("j= "+j);
			for (int i = j; i >= 0; i--) {
				if (resto - d[i] >= 0) {
					resto -= d[i];
					soma += d[i];
					cont++;
					// System.out.println(d[i]);
				}
				if (soma == n) {
					if (cont < menor)
						menor = cont;
					// System.out.println("soma =" + cont);
					cont = 0;
					soma = 0;
					resto = n;
					break;
				}
				if (resto >= d[i]) {
					i++;
				}
			}
		}
		System.out.println("menor soma: " + menor);

	}
}
