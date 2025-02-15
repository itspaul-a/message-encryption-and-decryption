
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static String[] getInput() 
    {
        String filePath = "file.txt";
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

    public static void main(String[] args)
    {
	    printArray();
    }
}
