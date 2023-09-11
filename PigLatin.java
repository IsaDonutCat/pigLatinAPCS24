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
        String word; // single word to pig latin-ate
        int start = 0; //the start of the word
        int len = origin.length();
        int difference; 
        for (int i = 0; i < len; i++)
        {

            if (phrase[i] == ' ') //space detected. the previous set of characters will be a word
            {
                if (phrase[start] == 'a' || phrase[start] == 'e' || phrase[start] == 'i' || phrase[start] == 'o' || phrase[start] == 'u') //vowel at the start of the word
                {
                    origin = origin.substring(0, i) + "way" + origin.substring(i, len);
                    phrase = origin.toCharArray(); //updates both char array and origin
                    len = origin.length(); //modifies len so it remembers to cycle through the rest of the word
                    i += 3; //modifies i so it doesn't check a word that has already been pig-latined
                    start = i + 1; //sets the start to the next word, assuming here is only one space between words;
                    if (i > len)
                    {
                        break;
                    }
                }
                else
                {
                    difference = start; 
                    while (phrase[difference] != 'a' || phrase[difference] != 'e' || phrase[difference] != 'i' || phrase[difference] != 'o' || phrase[difference] != 'u')
                    {
                        difference += 1;
                    } //quits loop when phrase[difference] is a vowel

                    origin = origin.substring(0, start) + origin.substring(difference, i) + origin.substring(start, difference) + "ay" + origin.substring(i, len);
                    phrase = origin.toCharArray();
                    len = origin.length();
                    i += 2;
                    start = i + 1;
                    if (i > len)
                    {
                        break;
                    }
                }
            }
            else if (i == (len - 1))
            {
                if (phrase[start] == 'a' || phrase[start] == 'e' || phrase[start] == 'i' || phrase[start] == 'o' || phrase[start] == 'u') //vowel at the start of the word
                {
                    origin = origin.substring(0, len) + "way"; //phrase doesn't need to be redelcared since this is the end
                }
                else
                {
                    difference = start; 
                    while (phrase[difference] != 'a' || phrase[difference] != 'e' || phrase[difference] != 'i' || phrase[difference] != 'o' || phrase[difference] != 'u')
                    {
                        difference += 1;
                    } //quits loop when phrase[difference] is a vowel

                    origin = origin.substring(0, len) + "ay";
                }
            }
        }

        System.out.println(phrase);
        input.close();
    }
}