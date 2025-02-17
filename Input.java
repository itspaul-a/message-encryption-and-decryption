import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;


public class Input
{
    //implements reading file and converting to char array (crazy this doesn't exist)
    public static char[] readFileToCharArray(String filePath) throws IOException 
    {
    	File file = new File(filePath);
    	char[] charArray = new char[(int) file.length()];
       
    	try (FileReader reader = new FileReader(file)) 
    	{
        	reader.read(charArray);
    	}
    	return charArray;
    }

    //takes file as input and returns char array
    public static char[] getInput() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filePath = scan.nextLine(); // will change to user input later
        try 
	    {
            char[] letterArray = readFileToCharArray(filePath);
	        return letterArray;
        } 
	    catch (IOException e) 
	    {
            System.err.println("Error reading file: " + e.getMessage());
	        char[] arr = {};
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
     
    //prints array to screen
    public static void printArray()
    {
	    char[] arr = getInput();
	    for(int i = 0; i < arr.length; i++)
	    {
		    System.out.print(arr[i]);
	    }

    }


}
