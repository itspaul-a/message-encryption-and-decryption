import java.util.List;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
public class Output extends Encryption
{
    public static void outputFile()
    {
        Encryption encryption = new Encryption();
        Input input = new Input();
        List<Character> words = encryption.encryption();
        String output = String.valueOf(words);

        try
        {
            FileWriter myWriter = new FileWriter(input.filepath);
            myWriter.write(output);
            myWriter.close();
            System.out.println("Successfully wrote to file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
}
