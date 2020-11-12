package Stringpgms;

import java.util.HashSet;

public class removeparticulatcharfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String quote = "Alive is awesome";
		String remove = "es";

		char[] base = quote.toCharArray();
		char[] rem = remove.toCharArray();

		// Add the characters to be removed into the HashSet
		HashSet<Character> checker = new HashSet<Character>();
		for(int i = 0; i< rem.length ; i++)
		checker.add(rem[i]);

		String answer="";

		//Add character into answer if it isn't in the HashSet
		for(int i = 0; i< base.length ; i++)
		if(!checker.contains(base[i]))
		answer = answer + base[i];

		System.out.println(answer);

	}

}
