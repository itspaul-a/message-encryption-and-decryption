import java.util.List;


class Decryption extends Main implements Interface
{
	public static void decryption()
	{
		List<Character> output = Main.getEncryption();
		for(int i = 0; i < output.size(); i++)
		{
			System.out.print(output.get(i));
		}
	}
}

