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
        int difference; 
        for (int i = 0; i < len; i++)
        {

            if (phrase[i] == ' ') //space detected. the previous set of characters will be a word
            {
                if (phrase[start] == 'a' || phrase[start] == 'e' || phrase[start] == 'i' || phrase[start] == 'o' || phrase[start] == 'u') //vowel at the start of the word
                {
                    phrase = phrase.substring(0, i) + "way" + phrase.substring(i, len);
                    len += 3; //modifies len so it remembers to cycle through the rest of the word
                    i += 3; //modifies i so it doesn't check a word that has already been pig-latined
                    start = i + 1; //sets the start to the next word, assuming here is only one space between words;
                }
                else
                {
                    difference = start; 
                    while (phrase[difference] != 'a' || phrase[difference] != 'e' || phrase[difference] != 'i' || phrase[difference] != 'o' || phrase[difference] != 'u')
                    {
                        difference += 1;
                    } //quits loop when phrase[difference] is a vowel

                    phrase = phrase.substring(0, start) + phrase.substring(difference, i) + phrase.substring(start, difference) + "ay" + phrase.substring(i, len);
                    len += 2;
                    i += 2;
                    start = i + 1;
                }
            }
        }

        System.out.println(phrase);
        input.close();
    }
}