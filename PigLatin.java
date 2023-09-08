import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");
        String phrase = input.nextLine();

        int len = phrase.Length();
        int start = 0;
        String chara;

        for (int i = 0; i < len; i++)
        {
            if (phrase.substring(i, i + 1) == " "); // up to but not including. phrase[i] is a space
            {   
                chara = phrase.substring(start, start + 1);
                if (phrase.substring(start, start + 1) == )
                start = i + 1;
            }
        }

    }
}