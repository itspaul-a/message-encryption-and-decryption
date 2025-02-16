import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Encryption extends Input
{
    public static void testCipher()
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter message: ");
	String message = scan.nextLine();
	
	System.out.print("Enter password: ");
	String pass = scan.nextLine();
	
	int temp = 0;
	
	char[] words = message.toCharArray();
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
	
	for(int i = 0; i < words2.size(); i++)
	{
	    System.out.print(words2.get(i) + " ");
	}
	
	scan.close();
    }

}
