package dio;

import java.util.*;
import java.util.Scanner;

public class ClassificandoMatrizes {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = input.nextInt();
		}

		int aux = 0;
		
		for(int i = 0; i < N; i++) {
			if(nums[i]%2 != 0) {
				for(int j = i+1; j < N; j++) {
					if(nums[j]%2==0) {
							aux = nums[i];
							System.out.println("aux ="+aux);
							nums[i]=nums[j];
							System.out.println("num[i] ="+nums[i]);
							nums[j]=aux;
							System.out.println("nums[j] ="+nums[j]);
							break;
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(nums[i]);
		}
		
		input.close();
	}
}