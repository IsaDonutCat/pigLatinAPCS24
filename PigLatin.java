import java.util.Scanner;
import java.lang.Character;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");
        String phrase = input.nextLine();
        String word; // single word to pig latin-ate
        int start = 0; //the start of the word
        int len = phrase.length();

        for (int i = 0; i < len; i++)
        {

            if (phrase[i] == ' ') //space detected. the previous set of characters will be a word
            {
                if (phrase[start] == 'a' || phrase[start] == 'e' || phrase[start] == 'i' || phrase[start] == 'o' || phrase[start] == 'u') //vowel at the start of the word
                {
                    phrase = phrase.substring(start, i) + "way" + phrase.substring(i, len);
                    len += 3; //modifies len so it remembers to cycle through the rest of the word
                    i += 3; //modifies i so it doesn't check a word that has already been pig-latined
                    start = i + 1; //sets the start to the next word, assuming here is only one space between words;
                }
                else
                {
                    while (phrase[start] != 'a' || phrase[start] != 'e' || phrase[start] != 'i' || phrase[start] != 'o' || phrase[start] != 'u')
                    {
                        
                    }
                }
            }
        }

        System.out.println(phrase);
        input.close();
    }
}