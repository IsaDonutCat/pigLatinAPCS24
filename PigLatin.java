import java.util.Scanner;
import java.lang.Character;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");
        String origin = input.nextLine();
        char[] phrase = origin.toCharArray();
        int len = origin.length();
        int spaceCount = 0;
        int previouSpace;

        for (int i = 0; i < len; i++)
        {
            if (phrase[i] == ' ')
            {
                spaceCount++;
                if (spaceCount == 1)
                {
                    previouSpace = i;
                }
            }

        }

        System.out.println(phrase);
        input.close();
    }
}