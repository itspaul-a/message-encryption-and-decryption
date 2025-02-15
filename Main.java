
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main{
    
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

    public static void main(String[] args)
    {
	splitArray();
    }
}
