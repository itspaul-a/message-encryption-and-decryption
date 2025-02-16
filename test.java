
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test
{
    
    //take the file as input and check that file exists
    public static String[] getInput() 
    {
        String filePath = "file.txt"; // will change to user input later
        try 
	{
            String[] letterArray = readFileToStringArray(filePath);
	    return letterArray;
                   } 
	catch (IOException e) 
	{
            System.err.println("Error reading file: " + e.getMessage());
	    String[] arr = {};
	    return arr;
        }
    }

    
    //convert file to string array
    public static String[] readFileToStringArray(String filePath) throws IOException 
    {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        List<String> letters = new ArrayList<>();
        for (char c : content.toCharArray()) 
	{
            letters.add(String.valueOf(c));
        }
        return letters.toArray(new String[0]);
    }
    
    public static void printArray()
    {
	    String[] arr = getInput();
	    for(int i = 0; i < arr.length; i++)
	    {
		    System.out.print(arr[i]);
	    }

    }

    //splits array into groups of 4
    public static ArrayList<String> splitArray()
    {
	String[] arr = getInput();
	ArrayList<String> al = new ArrayList<String>();
	for(int i = 0; i < arr.length; i++)
	{
	    al.add(arr[i]);
	    if(i % 4 == 0)
	    {
		al.add("\n");
	    }
	}
	
	//prints array list
	//for(int i = 0; i < al.size(); i++)
	//{
	//    System.out.println(al.get(i));
	//}
	
	return al;
    }

    public static void randomTest()
    {
	String[] arr = getInput();
	ArrayList<String> al = new ArrayList<String>();
	
	for(int i = 0; i < arr.length; i++)
	{
	    if(!(i % 4 == 0))
	    {
		al.add(arr[i]);
	    }
	}

	for(int i = 0; i < al.size(); i++)
	{
	    System.out.println(al.get(i));
	}
    }
	

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

        public static void main(String[] args)
        {
	   randomTest();
        }
}
