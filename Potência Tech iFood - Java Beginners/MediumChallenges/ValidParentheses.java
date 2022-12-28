package dio;

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
        scanner.close();
    }

    public static boolean ehValido(String s) {
        
    	if(s.isBlank())
    		return true;
    	else {
    		char inicio = s.charAt(0);
            char fim = s.charAt(s.length()-1);
            
    		if(inicio == '(' && fim == ')')
    			return true;
    		if(inicio == '[' && fim == ']')
    			return true;
    		if(inicio == '{' && fim == '}')
    			return true;  
    	}
    	return false;
    }
}