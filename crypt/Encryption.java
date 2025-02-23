package crypt;


import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileReader;


public class Encryption 
{

	public static String password;

	public static List<Character> encryption()
	{
		Scanner scan = new Scanner(System.in);

		Input input = new Input();
		char[] words = input.getInput();


		System.out.print("Enter a password: ");
		String pass = scan.nextLine();
		password = pass;

		int temp = 0;

		List<Character> words2 = new ArrayList<>();
	
		for(int i = 0; i < pass.length(); i++)
		{
		    temp = i;
		    while(temp < words.length)
		    {
		        words2.add(words[temp]);
		        temp+=pass.length();
		    }
		}

		//print output
		//for(int i = 0; i < words2.size(); i++)
		//{
		//    System.out.print(words2.get(i) + " ");
		//}
	
		scan.close();
		return words2;
	}

}

