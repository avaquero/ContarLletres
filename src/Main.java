import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		String frase;
		int cont[] = new int[26];
		
		Scanner llegir = new Scanner(System.in);
		System.out.println("Entra una frase:");
		frase = llegir.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			char c = Character.toLowerCase(frase.charAt(i));
			if(c >= 'a' && c <= 'z') cont[c-'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (cont[i] > 0)
				System.out.println((char)(i+'a')+ ": " + cont[i]);
		}
	}

}
