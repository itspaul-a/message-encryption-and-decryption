package crypt;

import java.util.List;
import java.util.ArrayList;


class Decryption 
{
	public static List<Character> decryption()
	{
		List<Character> input = Encryption.encryption();
		List<Character> words  = new ArrayList<Character>();
		List<Integer> words2 = new ArrayList<Integer>();
		String password = Encryption.password;

		int temp = 0;
		for(int i = password.length(); i>0; i--)
		{
			while(words2.size() != input.size())
			{
				words.add(input.get(temp));
				temp++;
			}
		}
		

		return words;
	}
	
}

