import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");
        String phrase = input.nextLine();
        String word;
        int len = phrase.length();

        for (int i = 0; i < len; i++)
        {   
            if (phrase[i] == " ")
            {
                word = phrase.substring("");
            }
            //TODO: does the ph
        }

        System.out.println(phrase);
    }
}